package com.engineerLee;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumOfDigitsTest {
    @Test
    void testSumOfDigits() {
        assertEquals(15, SumOfDigits.sumOfDigits("12345")); // 1+2+3+4+5 = 15
        assertEquals(0, SumOfDigits.sumOfDigits("")); // Empty string case
        assertEquals(9, SumOfDigits.sumOfDigits("9")); // Single digit case
        assertEquals(45, SumOfDigits.sumOfDigits("123456789")); // 1+2+3+4+5+6+7+8+9 = 45
        assertEquals(6, SumOfDigits.sumOfDigits("1023")); // 1+0+2+3 = 6
    }

}