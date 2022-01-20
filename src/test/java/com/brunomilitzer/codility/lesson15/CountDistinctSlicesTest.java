package com.brunomilitzer.codility.lesson15;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountDistinctSlicesTest {

    private final CountDistinctSlices countDistinctSlices = new CountDistinctSlices();

    @Test
    public void testScenario1() {
        int[] a = {3, 4, 5, 5, 2};
        int m = 6;

        assertEquals(9, countDistinctSlices.solution(m, a));
    }

}