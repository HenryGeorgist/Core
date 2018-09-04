/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces.Messaging;

/**
 * The message interface is the lowest level API for sending a message to the 
 * MessageHub, it minimally requires adding a message as a string.
 * @author willyp
 */
public interface Message {
    /**
     * The only method required of any message is to return a message as a string
     * @return returns a string containing the message
     */
    public String getMessage();
}
