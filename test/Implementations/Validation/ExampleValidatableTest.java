/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Implementations.Validation;

import Interfaces.Validation.ValidationRule;
import java.util.ArrayList;
import java.util.Collection;
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
public class ExampleValidatableTest {
    
    public ExampleValidatableTest() {
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
     * Test of getValue method, of class ExampleValidatable.
     */
    @Test
    public void testGetValue() {
        ExampleValidatable instance = new ExampleValidatable(4);
        int expResult = 4;
        int result = instance.getValue();
        assertEquals(expResult, result);
    }

    /**
     * Test of setValue method, of class ExampleValidatable.
     */
    @Test
    public void testSetValue() {
        int val = 0;
        ExampleValidatable instance = new ExampleValidatable(2);
        instance.setValue(val);
        assertEquals(instance.getValue(),val);
    }

    /**
     * Test of addValidationRule method, of class ExampleValidatable.
     */
    @Test
    public void testAddValidationRule() {
        String property = "ReturnFalse";
        ValidationRule rule = new Implementations.Validation.ValidationRule(()->{return true;}, "False Message", ErrorLevel.Major());
        ExampleValidatable instance = new ExampleValidatable(2);
        instance.addValidationRule(property, rule);
        ErrorLevel ret = instance.validate(property);
        assertEquals(ErrorLevel.Unassigned(),ret);
    }

    /**
     * Test of validate method, of class ExampleValidatable.
     */
    @Test
    public void testValidate() {
        ExampleValidatable instance = new ExampleValidatable(2);
        ErrorLevel expResult = ErrorLevel.Major();
        ErrorLevel result = instance.validate();
        assertEquals(expResult, result);
    }

    /**
     * Test of validate method, of class ExampleValidatable.
     */
    @Test
    public void testValidate_String() {
        String property = "Value";
        ExampleValidatable instance = new ExampleValidatable(2);
        ErrorLevel expResult = ErrorLevel.Major();
        ErrorLevel result = instance.validate(property);
        assertEquals(expResult, result);
    }

    /**
     * Test of getValidationMessages method, of class ExampleValidatable.
     */
    @Test
    public void testGetValidationMessages() {
        ExampleValidatable instance = new ExampleValidatable(2);
        Collection<String> expResult = new ArrayList<>();
        expResult.add("Value is less than 3");
        instance.validate();
        Collection<String> result = instance.getValidationMessages();
        assertEquals(expResult, result);
    }
    
}
