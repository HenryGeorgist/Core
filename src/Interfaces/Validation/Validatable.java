/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces.Validation;

import java.util.Collection;

/**
 *
 * @author willyp
 */
public interface Validatable {
    public void addValidationRule(String property, ValidationRule rule);
    public Implementations.Validation.ErrorLevel validate();
    public Implementations.Validation.ErrorLevel validate(String property);
    public Collection<String> getValidationMessages();
}
