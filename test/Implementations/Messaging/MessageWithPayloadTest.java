/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Implementations.Messaging;

import java.util.Optional;
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
public class MessageWithPayloadTest {
    
    public MessageWithPayloadTest() {
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
     * Test of getPayload method, of class MessageWithPayload.
     */
    @Test
    public void testGetPayload() {
        System.out.println("getPayload");
        MessageWithPayload<Integer> instance = new MessageWithPayload("This has a payload", 1234);
        Optional expResult = Optional.of(1234);
        Optional result = instance.getPayload();
        assertEquals(expResult, result);
    }
        /**
     * Test of getPayload method, of class MessageWithPayload.
     */
    @Test
    public void testGetNulPayload() {
        System.out.println("getNullPayload");
        MessageWithPayload<Integer> instance = new MessageWithPayload("This has a Null payload", null);
        Optional expResult = Optional.empty();
        Optional result = instance.getPayload();
        assertEquals(expResult, result);
    }
}
