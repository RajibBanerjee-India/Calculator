package com.rajib;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void integerDivision() {
        Calculator calculator = new Calculator();
        int result = calculator.integerDivision(4, 2);
        assertEquals(2, result, "4/2 did not produce 2");
    }

    @Test
    void integerSubtraction() {
        Calculator calculator = new Calculator();
        int result = calculator.integerSubtraction(15, 10);
        assertEquals(5, result, "15-10 did not return 5");
    }
}