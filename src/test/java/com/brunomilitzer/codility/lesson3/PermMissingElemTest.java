package com.brunomilitzer.codility.lesson3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PermMissingElemTest {

    private final PermMissingElem missingElem = new PermMissingElem();

    @Test
    public void testScenario1() {
        int[] a1 = {2, 3, 1, 5};

        assertEquals(4, missingElem.solution(a1));
    }

    @Test
    public void testScenario2() {
        int[] a2 = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        assertEquals(10, missingElem.solution(a2));
    }

    @Test
    public void testScenario3() {
        int[] a3 = {};

        assertEquals(1, missingElem.solution(a3));
    }

}