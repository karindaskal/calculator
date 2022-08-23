package com.example.calculator.model;



public class CalculatorModelImp implements CalculatorModel {
    /**
     * Returns the result of the expression
     * @param arithmetic
     * @return
     */
    @Override
    public  Result calc(Arithmetic arithmetic){
        Icalculator icalculator=null;
        switch (arithmetic.getOperation()){

            case "add" :icalculator=new Addition();
            break;
            case "sub":icalculator=new Subtraction();
            break;
            case "mul":icalculator=new Multiplication();
            break;
            case "div":icalculator=new Division();
            break;

        }
        return icalculator.calculate(arithmetic.getNum1(),arithmetic.getNum2());
    }
}
