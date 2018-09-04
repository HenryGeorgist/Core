/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Implementations.Validation;

/**
 *
 * @author willyp
 */
public final class ErrorLevel extends Abstractions.Utilities.Flag<ErrorLevel> {
    private static final int UNASSIGNED = 0;
    private static final int INFO = 1;
    private static final int WARNING = 2;
    private static final int MINOR = 4;
    private static final int MAJOR = 8;
    private static final int CRITICAL = 16;
    private ErrorLevel(int value){
        super(value);
    }
    public static ErrorLevel Unassigned(){
        ErrorLevel ret = new ErrorLevel(UNASSIGNED);
        return ret;
    }
    public static ErrorLevel Info(){
        ErrorLevel ret = new ErrorLevel(INFO);
        return ret;
    }
    public static ErrorLevel Warning(){
        ErrorLevel ret = new ErrorLevel(WARNING);
        return ret;
    }
    public static ErrorLevel Minor(){
        ErrorLevel ret = new ErrorLevel(MINOR);
        return ret;
    }
    public static ErrorLevel Major(){
        ErrorLevel ret = new ErrorLevel(MAJOR);
        return ret;
    }
    public static ErrorLevel Critical(){
        ErrorLevel ret = new ErrorLevel(CRITICAL);
        return ret;
    }
   @Override
    public boolean equals(Object o) {
        // If the object is compared with itself then return true  
        if (o == this) {
            return true;
        }
        if (!(o instanceof ErrorLevel)) {
            return false;
        } 
        ErrorLevel e = (ErrorLevel) o;
        // Compare the data members and return accordingly 
        return Integer.compare(_state, e._state) == 0;
    }    
}
