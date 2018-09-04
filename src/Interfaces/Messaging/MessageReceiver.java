/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces.Messaging;

/**
 *
 * @author willyp
 */
public interface MessageReceiver {
    /**
     * 
     * @param incomingMsg 
     */
    public void receiveMessage(Interfaces.Messaging.Message incomingMsg);
    public boolean senderFilter(Object sender);
    public boolean messageTypeFilter(Interfaces.Messaging.Message incomingMessage);
    public boolean errorLevelFilter(Implementations.Validation.ErrorLevel errorLevel);
}
