/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Implementations.Validation;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author willyp
 */
public class ValidationRuleTest {
    
    public ValidationRuleTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getMessage method, of class ValidationRule.
     */
    @Test
    public void testGetMessage() {
        ValidationRule instance = new ValidationRule(() -> {return true;},"Message",Implementations.Validation.ErrorLevel.Info());
        String expResult = "Message";
        String result = instance.getMessage();
        assertEquals(expResult, result);
    }

    /**
     * Test of getIsValid method, of class ValidationRule.
     */
    @Test
    public void testGetIsValid() {
        ValidationRule instance = new ValidationRule(() -> {return true;},"Message",Implementations.Validation.ErrorLevel.Info());
        boolean expResult = true;
        boolean result = instance.getIsValid();
        assertEquals(expResult, result);
    }

    /**
     * Test of getSeverity method, of class ValidationRule.
     */
    @Test
    public void testGetSeverity() {
        ValidationRule instance = new ValidationRule(() -> {return true;},"Message",Implementations.Validation.ErrorLevel.Info());
        ErrorLevel expResult = Implementations.Validation.ErrorLevel.Info();
        ErrorLevel result = instance.getSeverity();
        assertEquals(expResult, result);
    }

    /**
     * Test of evaluate method, of class ValidationRule.
     */
    @Test
    public void testEvaluate() {
        ValidationRule instance = new ValidationRule(() -> {return true;},"Message",Implementations.Validation.ErrorLevel.Info());
        ErrorLevel expResult = Implementations.Validation.ErrorLevel.Unassigned();
        ErrorLevel result = instance.evaluate();
        assertEquals(expResult, result);
    }
    /**
     * Test of evaluate method, of class ValidationRule.
     */
    @Test
    public void testEvaluate_false() {
        ValidationRule instance = new ValidationRule(() -> {return false;},"Message",Implementations.Validation.ErrorLevel.Info());
        ErrorLevel expResult = Implementations.Validation.ErrorLevel.Info();
        ErrorLevel result = instance.evaluate();
        assertEquals(expResult, result);
    }
}
