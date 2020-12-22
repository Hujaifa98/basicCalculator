/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mycalculator;

/**
 *
 * @author USER
 */
public class Calculations {
    Calculations(){
        
    }
    public double getResult(double firstNumber,double secondNumber,String operator){
        double result = 0;
        if(operator.equals("+")) 
            result = firstNumber + secondNumber;
        else if(operator.equals("-")) 
            result = firstNumber - secondNumber;
        else if(operator.equals("*")) 
            result = firstNumber * secondNumber;
        else if(operator.equals("/")) 
            result = firstNumber / secondNumber;
        else if(operator.equals("^")) 
            result = Math.pow(firstNumber, secondNumber);
        else if(operator.equals("%")) 
            result = firstNumber % secondNumber;
        return result;
    }
    public String removeLastNumber(String str){
        return str.substring(0,str.length()-1);
    }
    public String checkDecimal(double result){
        if(result%1 == 0)
            return String.format("%.0f", result);
        else
            return String.format("%.2f", result);
        
    }
}
