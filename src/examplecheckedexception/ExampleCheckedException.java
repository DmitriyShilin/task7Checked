package examplecheckedexception;

import examplecheckedexception.arithmetic.Divide;
import examplecheckedexception.exception.DivideByZeroException;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class ExampleCheckedException {
    
    private static Logger LOGGER = null;
    private static FileHandler handler = null;

    public static void main(String[] args) {
        
        Divide d = new Divide(2.0, 3.0);
        double result = 0;        
        try {
            result = d.divide();
        } catch (DivideByZeroException ex) {
            Logger.getLogger(ExampleCheckedException.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            handler = new FileHandler("C:/log/ExampleCheckedException.log", false);            
        } catch (IOException | SecurityException ex) {
            Logger.getLogger(ExampleCheckedException.class.getName()).log(Level.SEVERE, ex.toString(), ex);
        } 
        handler.setFormatter(new SimpleFormatter());
        LOGGER = Logger.getLogger(ExampleCheckedException.class.getName());
        LOGGER.addHandler(handler);
        LOGGER.setLevel(Level.INFO);
        LOGGER.setUseParentHandlers(false);   
        LOGGER.info("Result = " + result);
    }
}
