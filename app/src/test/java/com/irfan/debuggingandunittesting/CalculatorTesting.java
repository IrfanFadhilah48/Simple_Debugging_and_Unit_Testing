package com.irfan.debuggingandunittesting;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class CalculatorTesting {

    @Mock
    private CalculatorService calculatorService;
    private Calculator calculator;

    private int num1 = 4;
    private int num2 = 2;

    @Before
    public void setUp(){
        calculator = new Calculator();
        calculator.setCalculatorService(calculatorService);
        calculator.setNum1(num1);
        calculator.setNum2(num2);
    }

    @Test
    public void add_test_correct(){
        when(calculatorService.add(num1, num2)).thenReturn(6);
        assertEquals("Result should be 6", 6, calculator.add());
    }

    @Test
    public void subtract_test_correct(){
        when(calculatorService.substract(num1, num2)).thenReturn(2);
        assertEquals("Result should be 2", 2, calculator.subtract());
    }

    @Test
    public void multiply_test_correct(){
        when(calculatorService.multiply(num1, num2)).thenReturn(8);
        assertEquals("Result should be 8", 8, calculator.multiply());
    }

    @Test
    public void divide_test_correct(){
        when(calculatorService.divide(num1, num2)).thenReturn(2);
        assertEquals("Result should be 2", 2, calculator.divide());
    }
}
