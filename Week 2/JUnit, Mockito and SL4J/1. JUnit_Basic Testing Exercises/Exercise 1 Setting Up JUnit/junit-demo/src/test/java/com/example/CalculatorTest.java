package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void testAddition() {
        int a = 2;
        int b = 3;
        int expected = 5;
        assertEquals(expected, a + b);
    }

    @Test
    public void testSubtraction() {
        int a = 10;
        int b = 4;
        int expected = 6;
        assertEquals(expected, a - b);
    }
}
