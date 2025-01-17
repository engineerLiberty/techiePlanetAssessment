package com.engineerLee;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class RemoveDuplicatesTest {
    @Test
    void testRemoveDuplicates() {
        int[][] input = {
                {1, 3, 1, 2, 3, 4, 4, 3, 5},
                {1, 1, 1, 1, 1, 1, 1},
                {7, 8, 9, 7, 8, 9, 10}
        };

        int[][] expected = {
                {1, 3, 0, 2, 0, 4, 0, 0, 5},
                {1, 0, 0, 0, 0, 0, 0},
                {7, 8, 9, 0, 0, 0, 10}
        };

        RemoveDuplicates.removeDuplicates(input);

        assertArrayEquals(expected, input);
    }

}