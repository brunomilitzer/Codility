package com.brunomilitzer.codility.lesson1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinaryGapTest {

    private final BinaryGap binaryGap = new BinaryGap();

    @Test
    public void testScenario1() {
        int n = 9;

        assertEquals(2, binaryGap.solution(n));
    }

    @Test
    public void testScenario2() {
        int n = 529;

        assertEquals(4, binaryGap.solution(n));
    }

    @Test
    public void testScenario3() {
        int n = 20;

        assertEquals(1, binaryGap.solution(n));
    }

    @Test
    public void testScenario4() {
        int n = 15;

        assertEquals(0, binaryGap.solution(n));
    }

    @Test
    public void testScenario5() {
        int n = 1041;

        assertEquals(5, binaryGap.solution(n));
    }

    @Test
    public void testScenario6() {
        int n = 32;

        assertEquals(0, binaryGap.solution(n));
    }

}