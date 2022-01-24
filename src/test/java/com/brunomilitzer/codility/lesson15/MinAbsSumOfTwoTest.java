package com.brunomilitzer.codility.lesson15;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinAbsSumOfTwoTest {

    private final MinAbsSumOfTwo minAbsSumOfTwo = new MinAbsSumOfTwo();

    @Test
    public void testScenario1() {
        int[] a = {1, 4, -3};

        assertEquals(1, minAbsSumOfTwo.solution(a));
    }

    @Test
    public void testScenario2() {
        int[] a = {-8, 4, 5, -10, 3};

        assertEquals(3, minAbsSumOfTwo.solution(a));
    }

    @Test
    public void testScenario3() {
        int[] a = {-7, 3, -1, 5, -11, 4, -9, 14, 17, -2};

        assertEquals(1, minAbsSumOfTwo.solution(a));
    }

    @Test
    public void testScenario4() {
        int[] a = {8, 3, 5, 16, 11};

        assertEquals(6, minAbsSumOfTwo.solution(a));
    }

    @Test
    public void testScenario5() {
        int[] a = {-7, -5, -6, -2, -9};

        assertEquals(4, minAbsSumOfTwo.solution(a));
    }

    @Test
    public void testScenario6() {
        int[] a = {-7, 3 - 6, 1, 0, -9};

        assertEquals(0, minAbsSumOfTwo.solution(a));
    }
}