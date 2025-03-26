package org.example;

import org.junit.jupiter.api.Test;

public class SuckMyBallsTest {
    @Test
    void testAdd()
    {
        Calculator calculator = new Calculator();
        assert calculator.add(10, 5) == 15;
        assert calculator.addNumbers(3, 4) == 7;
    }


}
