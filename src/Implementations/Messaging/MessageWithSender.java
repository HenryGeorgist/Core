/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Implementations.Messaging;

/**
 *
 * @author willyp
 */
class MessageWithSender implements Interfaces.Messaging.MessageWithSender {
    private final Object _sender;
    private final Interfaces.Messaging.Message _message;
    @Override
    public Object getSender() {
        return _sender;
    }
    @Override
    public Interfaces.Messaging.Message getMessage() {
        return _message;
    }
    public MessageWithSender(Object sender, Interfaces.Messaging.Message message){
        _sender = sender;
        _message = message;
    }
}
