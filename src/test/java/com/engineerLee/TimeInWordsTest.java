package com.engineerLee;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TimeInWordsTest {
    @Test
    void testTimeInWords() {
        // Test cases for exact hour
        assertEquals("one o'clock", TimeInWords.timeInWords(1, 0));
        assertEquals("twelve o'clock", TimeInWords.timeInWords(12, 0));

        // Test cases for past the hour
        assertEquals("one minute past one", TimeInWords.timeInWords(1, 1));
        assertEquals("fifteen past two", TimeInWords.timeInWords(2, 15));
        assertEquals("twenty nine minutes past three", TimeInWords.timeInWords(3, 29));
        assertEquals("half past four", TimeInWords.timeInWords(4, 30));

        // Test cases for to the next hour
        assertEquals("twenty nine minutes to six", TimeInWords.timeInWords(5, 31));
        assertEquals("quarter to seven", TimeInWords.timeInWords(6, 45));
        assertEquals("one minute to eight", TimeInWords.timeInWords(7, 59));

        // Test edge cases
        assertEquals("one minute past twelve", TimeInWords.timeInWords(12, 1));
        assertEquals("quarter to one", TimeInWords.timeInWords(12, 45));
    }

}