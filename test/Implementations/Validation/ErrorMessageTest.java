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
public class ErrorMessageTest {
    
    public ErrorMessageTest() {
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
     * Test of getErrorLevel method, of class ErrorMessage.
     */
    @Test
    public void testGetErrorLevel() {
        ErrorMessage instance = new ErrorMessage("abcd",ErrorLevel.Warning());
        ErrorLevel expResult = ErrorLevel.Warning();
        ErrorLevel result = instance.getErrorLevel();
        assertEquals(expResult, result);
    }

    /**
     * Test of getMessage method, of class ErrorMessage.
     */
    @Test
    public void testGetMessage() {
        ErrorMessage instance = new ErrorMessage("abcd",ErrorLevel.Warning());
        String expResult = "abcd";
        String result = instance.getMessage();
        assertEquals(expResult, result);
    }
    
}
