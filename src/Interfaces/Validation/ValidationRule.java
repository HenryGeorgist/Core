/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces.Validation;

import java.util.function.Function;

/**
 * This interface defines the necessary elements associated with a Validation
 * Rule, a Message, an Error State, and the ability to evaluate the validity of
 * the instance.
 * @author willyp
 */
public interface ValidationRule {
    /**
     * A message describing the issues associated with the instance
     * of the object.
     * @return A message describing the validation issue.
     */
    public String getMessage();
    /**
     * Access to the current error state of the Validation Rule.
     * @return An ErrorLevel Flag.
     */
    public Implementations.Validation.ErrorLevel getSeverity();
    /**
     * Evaluates the current validity of this rule within the instance of the object
     * @return the current Error Level.
     */
    public Implementations.Validation.ErrorLevel evaluate();
    /**
     * Expresses if the validation rule is currently valid or not
     * @return true if valid false if invalid
     */
    public boolean getIsValid();
}
