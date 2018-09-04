/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces.Messaging;

/**
 * A simple class that stores a message along with the sender of the message.
 * This is used within the Message Hub class to send a sender with a message to 
 * receivers that are listening.
 * @author willyp
 */
public interface MessageWithSender{
    /**
     * provides access to the message being sent
     * @return A message
     */
    public Message getMessage();
    /**
     * provides access to the sender of the message
     * @return An object reference to the sender.
     */
    public Object getSender();
}
