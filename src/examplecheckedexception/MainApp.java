package examplecheckedexception;

import examplecheckedexception.arithmetic.Divide;
import examplecheckedexception.exception.DivideByZeroException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MainApp {
    
    private static Logger logger = Logger.getLogger(MainApp.class.getName()); 

    public static void main(String[] args) {
        
        Divide d = new Divide(2.0, 3.0);
        double result = 0;        
        try {
            result = d.divide();
        } catch (DivideByZeroException ex) {
            logger.log(Level.SEVERE, null, ex);
        }
        
        logger.info("Result = " + result);
    }
}
