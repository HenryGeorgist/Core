/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Implementations.Messaging;

import Implementations.Validation.ErrorLevel;
import Interfaces.Messaging.Message;

/**
 *
 * @author willyp
 */
public class MessageReceiver implements Interfaces.Messaging.MessageReceiver {

    @Override
    public void receiveMessage(Message incomingMsg) {
        System.out.println(incomingMsg.getMessage());
    }

    @Override
    public boolean senderFilter(Object sender) {
        return true;
    }

    @Override
    public boolean messageTypeFilter(Message incomingMessage) {
        return true;
    }

    @Override
    public boolean errorLevelFilter(ErrorLevel errorLevel) {
        return true;
    }
    
}
