/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Implementations.Messaging;

import Interfaces.Messaging.Message;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import Interfaces.Messaging.MessageReceiver;

/**
 *
 * @author willyp
 */
public class MessageHubTest {
    private MessageHub mh;
    public MessageHubTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        mh = MessageHub.getInstance();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getInstance method, of class MessageHub.
     */
    @Test
    public void testGetInstance() {
        System.out.println("getInstance");
        MessageHub expResult = mh;
        MessageHub result = MessageHub.getInstance();
        assertEquals(expResult, result);
    }

    /**
     * Test of register method, of class MessageHub.
     */
    @Test
    public void testRegister() {
        System.out.println("register");
        MessageReceiver reciever = new Implementations.Messaging.MessageReceiver();
        MessageHub instance = mh;
        instance.register(reciever);

    }

    /**
     * Test of sendMessage method, of class MessageHub.
     */
    @Test
    public void testSendMessage() {
        System.out.println("sendMessage");
        Object sender = this;
        Message incomingMessage = new Implementations.Messaging.Message("This is a cool message");
        MessageHub instance = mh;
        instance.sendMessage(sender, incomingMessage);
    }
    
}
