package developers.rajib.com;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

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

    @Disabled("TODO : Still need to work on it")
    @DisplayName("Division by Zero - Disabled")
    @Test
    void testIntegerDivision_WhenDividendIsDividedByZero_Disabled() {
        System.out.println("Running Division by Zero - Disabled");
        fail("Not implemented yet");
    }

    @DisplayName("Division by Zero")
    @Test
    void testIntegerDivision_WhenDividendIsDividedByZero_ShouldThrowArithmeticException() {
        System.out.println("Running Division by Zero");

        // Arrange
        int dividend = 4;
        int divisor = 0;
        String expectedExceptionMessage = "/ by zero";

        // Act & Assert
        ArithmeticException actualResult = assertThrows(ArithmeticException.class,
                // Act
                () -> calculator.integerDivision(dividend, divisor),
                "Division by zero should have thrown Arithmetic Exception.");

        // Assert
        assertEquals(expectedExceptionMessage, actualResult.getMessage(),
                "Unexpected exception message.");
    }

    @DisplayName("Test integer subtraction [minuend, subtrahend, expectedResult]")
    @ParameterizedTest
    //@MethodSource()
    @CsvSource({
            "27, 25, 2",
            "89, 45, 44",
            "340, 230, 110"
    })
    void integerSubtraction(int minuend,
                            int subtrahend,
                            int expectedResult) {
        System.out.println("Running Test " + minuend + "-" + subtrahend + "=" + expectedResult);
        int actualResult = calculator.integerSubtraction(minuend, subtrahend);

        // Lazy assert message
        assertEquals(expectedResult, actualResult,
                () -> minuend + " - " + subtrahend + " did not produce " + expectedResult);
    }

    @DisplayName("Testing String argument passing with CsvSource annotation")
    @ParameterizedTest
    @CsvSource({
            "Rajib, Banerjee, RajibBanerjee",
            "Raj, '', Raj ", // lName is empty
            "Raju, , Rajunull" // lName is null
    })
    void parameterizedTestWithString(String fName,
                                     String lName,
                                     String expectedFullName) {

        String actualFullName = fName+lName;
        System.out.println("Full Name - " + expectedFullName);

        assertEquals(expectedFullName, actualFullName, "Full Name doesn't match");
    }

    /*private static Stream<Arguments> integerSubtraction() {

        return Stream.of(
                Arguments.of(33, 1, 32),
                Arguments.of(54, 34, 20),
                Arguments.of(24, 5, 19)
        );
    }*/

}