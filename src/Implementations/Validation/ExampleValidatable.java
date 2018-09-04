/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Implementations.Validation;

import Interfaces.Validation.Validatable;
import Interfaces.Validation.ValidationRule;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

/**
 *
 * @author willyp
 */
class ExampleValidatable implements Validatable {
    private final int _value;
    private boolean _isValid = true;
    private HashMap<String,ValidationRule> _rules;
    private Collection<String> _messages;
    public int getValue(){
        return _value;
    }
    public ExampleValidatable(int value){
        _value = value;
        _messages = new ArrayList<>();
        ValidationRule valueRule = new Implementations.Validation.ValidationRule(this::validateValue,"Value is greater than 3", ErrorLevel.Major());
        addValidationRule("Value", valueRule);
    }
    @Override
    public final void addValidationRule(String property, ValidationRule rule) {
        if(_rules==null){
            _rules = new HashMap<>();
        }
        _rules.put(property,rule);
    }
    private boolean validateValue(){
        return _value>3;
    }
    @Override
    public ErrorLevel validate() {
        ErrorLevel errorLevel = ErrorLevel.Unassigned();
        _messages = new ArrayList<>();
        _isValid = true;
        for(String p : _rules.keySet()){
            errorLevel.addToState(_rules.get(p).evaluate());
            if(!_rules.get(p).getIsValid()){
                _isValid = false;
                _messages.add(_rules.get(p).getMessage());
            }
        }
        return errorLevel;
    }

    @Override
    public ErrorLevel validate(String property) {
        boolean changedState = false;
        for(String p : _rules.keySet()){
            if(property.equals(p)){
                ErrorLevel ret = _rules.get(p).evaluate();
                if(!_rules.get(p).getIsValid()){
                    String mesg = _rules.get(p).getMessage();
                    if(!_messages.contains(mesg)){
                        _messages.add(mesg);
                    }
                    if(_isValid){
                        _isValid = false;
                    }
                }else{
                    if(!_isValid){
                        for(String pp : _rules.keySet()){
                            if(!_rules.get(pp).getIsValid()){
                                return ret;
                            }
                        }
                        _isValid = true;
                    }
                }
                return ret;
            }
        }
        return ErrorLevel.Unassigned();
    }

    @Override
    public Collection<String> getValidationMessages() {
        return _messages;
    }
    
}
