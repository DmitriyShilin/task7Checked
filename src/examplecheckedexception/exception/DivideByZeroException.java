package examplecheckedexception.exception;

public class DivideByZeroException extends Exception{
    
    public DivideByZeroException(){        
    }
    
    @Override
    public String toString(){
        return "Exception: divide by zero";
    }
    
}
