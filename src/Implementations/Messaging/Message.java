/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Implementations.Messaging;

/**
 *This is a basic implementation of the Message interface
 *This could be used to send a string message to a log file or a user interface
 * element.
 * @author willyp
 */
public class Message implements Interfaces.Messaging.Message {
    private final String _message;
    /**
     * The constructor for the Message class, it accepts the only parameter stored
     * within the class - the message
     * @param message The message that is intended to be sent.
     */
    public Message(String message){
        _message = message;
    }
    /**
     * This is a method to get the message.
     * @return the message being sent.
     */
    @Override
    public final String getMessage() {
        return _message;
    }
    
}
