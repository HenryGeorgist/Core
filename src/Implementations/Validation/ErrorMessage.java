/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Implementations.Validation;

/**
 *
 * @author willyp
 */
public class ErrorMessage implements Interfaces.Validation.ErrorMessage {
    private final String _message;
    private final Implementations.Validation.ErrorLevel _errorLevel;
    public ErrorMessage(String message, Implementations.Validation.ErrorLevel errorLevel){
        _message = message;
        _errorLevel = errorLevel;
    }
    @Override
    public ErrorLevel getErrorLevel() {
        return _errorLevel;
    }
    @Override
    public String getMessage() {
         return _message;
    }
    
}
