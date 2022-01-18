package com.brunomilitzer.codility.lesson5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PassingCarsTest {

    private final PassingCars passingCars = new PassingCars();

    @Test
    public void testScenario1() {
        int[] a = {0, 1, 0, 1, 1};

        assertEquals(5, passingCars.solution(a));
    }

    @Test
    public void testScenario2() {
        int[] a = {1, 1, 1, 1, 1};

        assertEquals(0, passingCars.solution(a));

    }

}