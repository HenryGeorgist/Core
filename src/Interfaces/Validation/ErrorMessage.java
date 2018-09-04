/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces.Validation;

/**
 * An interface that combines a message with an error level.
 * @author willyp
 */
public interface ErrorMessage extends Interfaces.Messaging.Message {
    /**
     * Provides access to the Error level flag object to determine if the error
     * of the message.
     * @return 
     */
    public Implementations.Validation.ErrorLevel getErrorLevel();
}
