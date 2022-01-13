package com.brunomilitzer.codility.lesson4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxCounterTest {

    private final MaxCounter maxCounter = new MaxCounter();

    @Test
    public void testScenario1() {
        int[] a = {3, 4, 4, 6, 1, 4, 4};
        int n = 5;
        int[] result = {3, 2, 2, 4, 2};

        assertArrayEquals(result, maxCounter.solution(n, a));
    }

}