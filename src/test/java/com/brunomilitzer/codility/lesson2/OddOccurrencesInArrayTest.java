package com.brunomilitzer.codility.lesson2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OddOccurrencesInArrayTest {

    private final OddOccurrencesInArray oddOccurrencesInArray = new OddOccurrencesInArray();

    @Test
    public void testScenario1() {
        int[] a = {9, 3, 9, 3, 9, 7, 9};

        assertEquals(7, oddOccurrencesInArray.solution(a));
    }

    @Test
    public void testScenario2() {
        int[] a = {1, 4, 3, 1, 4, 1, 1, 3, 2};

        assertEquals(2, oddOccurrencesInArray.solution(a));
    }

}