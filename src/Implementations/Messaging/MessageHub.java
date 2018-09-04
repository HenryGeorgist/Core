/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Implementations.Messaging;

import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.locks.ReentrantLock;

/**
 *This is a singleton pattern for a centralized message hub. This can allow for
 * messages to be sent from any message and then broadcast by the message hub to
 * any registered listener.
 * @author willyp
 */
public class MessageHub {
    private static MessageHub _instance = new MessageHub();
    private Collection<Interfaces.Messaging.MessageReceiver> _recievers;
    private ConcurrentLinkedQueue<Interfaces.Messaging.MessageWithSender> _messageQueue;
    private static ReentrantLock _syncLock;
    /**
     * Gets the instance of the Message Hub
     * @return A message Hub (the only one in the program)
     */
    public static MessageHub getInstance(){
        return _instance;
    }
    private MessageHub(){
        //initialize collections
        _recievers = new ArrayList<>();
        _messageQueue = new ConcurrentLinkedQueue<>();
        _syncLock = new ReentrantLock();
        
    }
    /**
     * Allows any Receiver to to register with the message hub to start receiving
     * messages.
     * @param reciever 
     */
    public void register(Interfaces.Messaging.MessageReceiver reciever){
        _recievers.add(reciever);
    }
    public void sendMessage(Object sender, Interfaces.Messaging.Message incomingMessage){
        //broadcast message to all recievers who wish to hear this message.
        _messageQueue.offer(new MessageWithSender(sender,incomingMessage));
        if(!_syncLock.isLocked()){
            Flush();
        }

    }
    private void Flush(){
        //dequeue and send messages.
        //lock to ensure syncronous consumption.
        _syncLock.lock();
        try{
            while(!_messageQueue.isEmpty()){
                Interfaces.Messaging.MessageWithSender m = _messageQueue.poll();
                for(Interfaces.Messaging.MessageReceiver reciever: _recievers){
                    if(!reciever.senderFilter(m.getSender())){
                        continue;
                    }
                    if(!reciever.messageTypeFilter(m.getMessage())){
                        continue;
                    }
                    if(m instanceof Interfaces.Validation.ErrorMessage){
                        Interfaces.Validation.ErrorMessage errMsg = (Interfaces.Validation.ErrorMessage)m;
                        if(!reciever.errorLevelFilter(errMsg.getErrorLevel())){
                            continue;
                        }
                    }
                    reciever.receiveMessage(m.getMessage());
                }
            }
        }finally{
            _syncLock.unlock();
        }
        
    }
}
