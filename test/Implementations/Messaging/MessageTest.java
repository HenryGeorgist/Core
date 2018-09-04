/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Implementations.Messaging;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author willyp
 */
public class MessageTest {
    private Interfaces.Messaging.Message message;
    private static final String MESSAGE = "This is a message";
    public MessageTest() {
    }
    @Before
    public void setUp() {
        message = new Message(MESSAGE);
    }
    /**
     * Test of getMessage method, of class Message.
     */
    @Test
    public void testGetMessage() {
        System.out.println("getMessage");
        String expResult = MESSAGE;
        String result = message.getMessage();
        assertEquals(expResult, result);
    }
    
}
