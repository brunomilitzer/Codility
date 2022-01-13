package com.brunomilitzer.codility.lesson2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CyclicRotationTest {

    private final CyclicRotation cyclicRotation = new CyclicRotation();

    @Test
    public void testScenario1() {
        int[] a1 = {3, 8, 9, 7, 6};
        int[] result = {9, 7, 6, 3, 8};
        int k = 3;

        assertArrayEquals(result, cyclicRotation.solution(a1, k));
    }

    @Test
    public void testScenario2() {
        int[] a2 = {0, 0, 0};
        int[] result = {0, 0, 0};
        int k = 1;

        assertArrayEquals(result, cyclicRotation.solution(a2, k));
    }

    @Test
    public void testScenario3() {
        int[] a3 = {1, 2, 3, 4};
        int[] result = {1, 2, 3, 4};
        int k = 4;

        assertArrayEquals(result, cyclicRotation.solution(a3, k));
    }

}