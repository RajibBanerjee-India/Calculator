package com.rajib;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    // test<System Under Test>_<Condition or State Change>_<Expected Result>
    @Test
    void testIntegerDivision_WhenFourIsDividedByTwo_ShouldReturnTwo() {
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