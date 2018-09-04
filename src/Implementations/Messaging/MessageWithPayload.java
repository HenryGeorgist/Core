/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Implementations.Messaging;

import java.util.Optional;

/**
 *
 * @author willyp
 * @param <T> The type of the payload
 */
public class MessageWithPayload<T> extends Implementations.Messaging.Message {
    private Optional<T> _payload;
    private void setPayload(T payload){
        if(payload != null){
            _payload = Optional.of(payload);
        }else{
            _payload = Optional.empty();
        }
    }
    /**
     * Creates an instance of message with payload, but sets the payload to null (irrevocably)
     * @param message The string message being sent
     */
    public MessageWithPayload(String message) {
        super(message);
        setPayload(null);
    }
    /**
     * 
     * @param message
     * @param payload 
     */
    public MessageWithPayload(String message, T payload){
        super(message);
        setPayload(payload);
    }
    public Optional<T> getPayload(){
        return _payload;
    }
    
}
