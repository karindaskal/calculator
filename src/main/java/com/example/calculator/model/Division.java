package com.example.calculator.model;
/**
 * implements Icalculator
 * Division operator
 */

public class Division implements Icalculator {

    @Override
    public Result calculate(double num1, double num2) {

        Result result = new Result(num1/num2);
        return result;
    }
}
