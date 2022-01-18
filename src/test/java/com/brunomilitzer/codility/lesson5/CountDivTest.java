package com.brunomilitzer.codility.lesson5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountDivTest {

    private final CountDiv countDiv = new CountDiv();

    @Test
    public void testScenario1() {
        int a = 6;
        int b = 11;
        int k = 2;

        assertEquals(3, countDiv.solution(a, b, k));
    }

    @Test
    public void testScenario2() {
        int a = 5;
        int b = 16;
        int k = 3;

        assertEquals(4, countDiv.solution(a, b, k));
    }

}