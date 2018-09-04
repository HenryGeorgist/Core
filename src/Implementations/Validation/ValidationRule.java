/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Implementations.Validation;

import java.util.function.BooleanSupplier;

/**
 *
 * @author willyp
 */
public class ValidationRule implements Interfaces.Validation.ValidationRule{
    private final String _errorMessage;
    private final BooleanSupplier _rule;
    private final ErrorLevel _severity;
    private boolean _isValid = true;
    public ValidationRule(BooleanSupplier rule, String message, ErrorLevel severity){
        _rule = rule;
        _errorMessage = message;
        _severity = severity;
    }
    @Override
    public String getMessage() {
        return _errorMessage;
    }
    @Override
    public boolean getIsValid(){
        return _isValid;
    }
    @Override
    public ErrorLevel getSeverity() {
        return _severity;
    }

    @Override
    public ErrorLevel evaluate() {
        _isValid = _rule.getAsBoolean();
        if(!_isValid){
            return _severity;
        } 
        return ErrorLevel.Unassigned();
    }
    
}
