/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Implementations.Messaging;

import Interfaces.Messaging.Message;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author willyp
 */
public class MessageWithSenderTest {
    public static final String MESSAGE = "This is a message";
    public static Interfaces.Messaging.MessageWithSender mws;
    @Before
    public void setUp() {
        mws = new MessageWithSender(this,new Implementations.Messaging.Message(MESSAGE));
    }
    /**
     * Test of getSender method, of class MessageWithSender.
     */
    @Test
    public void testGetSender() {
        System.out.println("getSender");
        Object expResult = this;
        Object result = mws.getSender();
        assertEquals(expResult, result);
    }

    /**
     * Test of getMessage method, of class MessageWithSender.
     */
    @Test
    public void testGetMessage() {
        System.out.println("getMessage");
        String expResult = MESSAGE;
        String result = mws.getMessage().getMessage();
        assertEquals(expResult, result);
    }
    
}
