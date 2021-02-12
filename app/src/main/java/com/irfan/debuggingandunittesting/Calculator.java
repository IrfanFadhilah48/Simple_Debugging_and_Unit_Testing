package com.irfan.debuggingandunittesting;

public class Calculator {

    private CalculatorService calculatorService;
    private int num1;
    private int num2;

    public CalculatorService getCalculatorService() {
        return calculatorService;
    }

    public void setCalculatorService(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int add(){
        return calculatorService.add(num1, num2);
    }

    public int subtract(){
        return calculatorService.substract(num1, num2);
    }

    public int multiply(){
        return calculatorService.multiply(num1, num2);
    }

    public int divide(){
        return calculatorService.divide(num1, num2);
    }
}
