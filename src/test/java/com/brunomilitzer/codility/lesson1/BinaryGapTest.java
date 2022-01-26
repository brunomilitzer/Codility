package com.brunomilitzer.codility.lesson1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinaryGapTest {

    private final BinaryGap binaryGap = new BinaryGap();

    @Test
    public void testScenario1() {
        int n = 9;

        assertEquals(5, binaryGap.solution(n));
    }

}