package examplecheckedexception.arithmetic;

import examplecheckedexception.exception.DivideByZeroException;

public class Divide {
    
    private double firstNumber;
    private double secondNumber;
    
    public Divide(double firstNumber, double secondNumber){
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }
    
    public void setFirstNumber(double firstNumber){
        this.firstNumber = firstNumber;
    }
    
    public double getFirstNumber(){
        return firstNumber;
    }
    
    public void setSecondNumber(double secondNumber){
        this.secondNumber = secondNumber;
    }
    
    public double getSecondNumber(){
        return secondNumber;
    }
    
    public double divide() throws DivideByZeroException{
        if(secondNumber == 0.0){
            throw new DivideByZeroException();
        }
        return firstNumber/secondNumber;
    }    
}
