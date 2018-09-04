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
public class ErrorLevelTest {
    
    public ErrorLevelTest() {
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
     * Test of Unassigned method, of class ErrorLevel.
     */
    @Test
    public void testUnassigned() {
        ErrorLevel instance = ErrorLevel.Unassigned();
        assertEquals("0", instance.toBinaryString());
    }

    /**
     * Test of Info method, of class ErrorLevel.
     */
    @Test
    public void testInfo() {
        ErrorLevel instance = ErrorLevel.Info();
        assertEquals("1", instance.toBinaryString());
    }

    /**
     * Test of getWarning method, of class ErrorLevel.
     */
    @Test
    public void testWarning() {
        ErrorLevel instance = ErrorLevel.Warning();
        assertEquals("10", instance.toBinaryString());
    }

    /**
     * Test of Minor method, of class ErrorLevel.
     */
    @Test
    public void testMinor() {
        ErrorLevel instance = ErrorLevel.Minor();
        assertEquals("100", instance.toBinaryString());
    }

    /**
     * Test of Major method, of class ErrorLevel.
     */
    @Test
    public void testMajor() {
        ErrorLevel instance = ErrorLevel.Major();
        assertEquals("1000", instance.toBinaryString());
    }

    /**
     * Test of setCritical method, of class ErrorLevel.
     */
    @Test
    public void testCritical() {
        ErrorLevel instance = ErrorLevel.Critical();
        assertEquals("10000", instance.toBinaryString());
    }
    /**
     * Test of addToState method by combining Critical and Warning.
     */
    @Test
    public void testCombineCritical_Warning() {
        ErrorLevel instance = ErrorLevel.Critical();
        ErrorLevel warning = ErrorLevel.Warning();
        instance.addToState(warning);
        assertEquals("10010", instance.toBinaryString());
    }
    /**
    * Test of removeFromState method by removing state, setting it back to unassigned.
    */
    @Test
    public void testRemoveCritical() {
        ErrorLevel instance = ErrorLevel.Critical();
        assertEquals("10000", instance.toBinaryString());
        instance.removeFromState(instance);
        assertEquals("0", instance.toBinaryString());
    }
    /**
    * Test of isHot method by checking if a flag is hot.
    */
    @Test
    public void testIsHot() {
        ErrorLevel instance = ErrorLevel.Critical();
        assertEquals(instance.isHot(instance), true);
    }
}
