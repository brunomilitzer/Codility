package com.brunomilitzer.codility.lesson6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberOfDiscIntersectionsTest {

    private final NumberOfDiscIntersections numberOfDiscIntersections = new NumberOfDiscIntersections();

    @Test
    public void testScenario1() {
        int[] a = {1, 5, 2, 1, 4, 0};

        assertEquals(11, numberOfDiscIntersections.solution(a));
    }
}