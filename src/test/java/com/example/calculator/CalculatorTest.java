package com.example.calculator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void testAddition() {
        Calculator calc = new Calculator();
        assertEquals(15, calc.add(10, 5));
    }

    @Test
    void testSubtraction() {
        Calculator calc = new Calculator();
        assertEquals(5, calc.subtract(10, 5));
    }

    @Test
    void testMultiplication() {
        Calculator calc = new Calculator();
        assertEquals(50, calc.multiply(10, 5));
    }

    @Test
    void testDivision() {
        Calculator calc = new Calculator();
        assertEquals(2, calc.divide(10, 5));
    }

    @Test
    void testDivisionByZero() {
        Calculator calc = new Calculator();
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            calc.divide(10, 0);
        });
        assertEquals("Division by zero is not allowed!", exception.getMessage());
    }
}
