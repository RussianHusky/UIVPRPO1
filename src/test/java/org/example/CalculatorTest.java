package org.example;

import org.junit.jupiter.api.Test;

public class CalculatorTest {
    @Test
    void testAdd()
    {
        Calculator calculator = new Calculator();
        assert calculator.add(10, 5) == 15;
        assert calculator.divide(10, 5) == 2;
        assert calculator.isPrime(13);
        assert calculator.subtract(10, 4) == 6;
    }


}
