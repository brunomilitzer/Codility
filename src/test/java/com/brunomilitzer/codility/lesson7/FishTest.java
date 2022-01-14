package com.brunomilitzer.codility.lesson7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FishTest {

    private final Fish fish = new Fish();

    @Test
    public void testScenario1() {
        int[] a = {4, 8, 2, 6, 7};
        int[] b = {0, 1, 1, 0, 0};

        assertEquals(2, fish.solution(a, b));
    }

    @Test
    public void testScenario2() {
        int[] a = {4, 3, 2, 1, 5};
        int[] b = {0, 1, 0, 0, 0};

        assertEquals(2, fish.solution(a, b));
    }

}