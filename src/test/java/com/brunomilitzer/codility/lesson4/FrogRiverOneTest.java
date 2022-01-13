package com.brunomilitzer.codility.lesson4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FrogRiverOneTest {

    private final FrogRiverOne frogRiverOne = new FrogRiverOne();

    @Test
    public void testScenario1() {
        int x = 5;
        int[] a = {1, 3, 1, 4, 2, 3, 5, 4};

        assertEquals(6, frogRiverOne.solution(x, a));
    }

    @Test
    public void testScenario2() {
        int x = 1;
        int[] a = {1, 1, 1};

        assertEquals(-1, frogRiverOne.solution(x, a));
    }

    @Test
    public void testScenario3() {
        int x = 3;
        int[] a = {1, 2, 1};

        assertEquals(-1, frogRiverOne.solution(x, a));
    }

}