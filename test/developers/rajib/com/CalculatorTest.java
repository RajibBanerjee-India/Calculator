package developers.rajib.com;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Test Math Operations in Calculator class")
class CalculatorTest {

    Calculator calculator;

    @BeforeAll
    static void setup() {
     System.out.println("Executing @BeforeAll method.");
    }

    @AfterAll
    static void cleanup() {
        System.out.println("Executing @AfterAll method.");
    }

    @BeforeEach
    void beforeEachTestMethod() {
        calculator = new Calculator();
        System.out.println("Executing @BeforeEach method.");
    }

    @AfterEach
    void afterEachTestMethod() {
        System.out.println("Executing @AfterEach method.");
    }

    // test<System Under Test>_<Condition or State Change>_<Expected Result>
    @DisplayName("Test 4/2 = 2")
    @Test
    void testIntegerDivision_WhenFourIsDividedByTwo_ShouldReturnTwo() {
        System.out.println("Running Test 4/2 = 2.");
        // Arrange  // Given
        int dividend = 4;
        int divisor = 2;
        int expectedResult = 2;

        // Act  // When
        int actualResult = calculator.integerDivision(dividend, divisor);

        // Assert  // Then
        assertEquals(expectedResult, actualResult, "4/2 did not produce 2");
    }

    @DisplayName("Division by Zero")
    @Test
    void testIntegerDivision_WhenDividendIsDividedByZero_ShouldThrowArithmeticException() {
        System.out.println("Running Division by Zero");
        fail("Not implemented yet");
    }

    @DisplayName("Test 15-10 = 5")
    @Test
    void integerSubtraction() {
        System.out.println("Running Test 15-10 = 5");
        int minuend = 15;
        int subtrahend = 10;
        int expectedResult = 5;
        int actualResult = calculator.integerSubtraction(minuend, subtrahend);

        // Lazy assert message
        assertEquals(expectedResult, actualResult,
                () -> minuend + " - " + subtrahend + " did not produce " + expectedResult);
    }
}