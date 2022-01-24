package com.brunomilitzer.codility.lesson16;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxNonoverlappingSegmentsTest {

    private final MaxNonoverlappingSegments maxNonoverlappingSegments = new MaxNonoverlappingSegments();

    @Test
    public void testScenario1() {
        int[] a = {1, 3, 7, 9, 9};
        int[] b = {5, 6, 8, 9, 10};

        assertEquals(3, maxNonoverlappingSegments.solution(a, b));

    }

}