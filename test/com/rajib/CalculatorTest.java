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
        int minuend = 15;
        int subtrahend = 10;
        int expectedResult = 5;
        int actualResult = calculator.integerSubtraction(minuend, subtrahend);

        // Lazy assert message
        assertEquals(expectedResult, actualResult,
                () -> minuend + " - " + subtrahend + " did not produce " + expectedResult);
    }
}