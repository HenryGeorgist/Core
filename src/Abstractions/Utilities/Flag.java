/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Abstractions.Utilities;

/**
 * This abstract class is intended for bit flags, it allows for setting state
 * turning on and off flags, and checking if a flag is currently on.
 * @author willyp
 * @param <T>
 */
public abstract class Flag<T extends Flag> {
    protected int _state;
    protected Flag(int state){
        _state = state;
    }
    /**
     * 
     * @return returns the current state as an integer
     */
    protected final int getState(){
        return _state;
    }
    /**
     * Determines if the flag in question has been turned on.
     * @param flag an instance of flag with the state in question set.
     * @return True if the flag is set, False if it is not set
     */
    public final boolean isHot(T flag){
        return (getState() & flag.getState())==flag.getState();
    }
    /**
     * Adds the flag to the current state.
     * @param flag The flag you wish to add to the current state.
     */
    public final void addToState(T flag){
        _state = getState()|flag.getState();
    }
    /**
     * Removes the flag from the current state
     * @param flag The flag wished to be removed.
     */
    public final void removeFromState(T flag){
        _state = getState() &~ flag.getState();
    }
    @Override
    public String toString(){
        return Integer.toString(_state);
    }
    public String toBinaryString(){
        return Integer.toBinaryString(_state);
    }
}
