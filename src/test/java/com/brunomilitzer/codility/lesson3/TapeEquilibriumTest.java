package com.brunomilitzer.codility.lesson3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TapeEquilibriumTest {

    private final TapeEquilibrium equilibrium = new TapeEquilibrium();

    @Test
    public void testScenario1() {
        int[] a1 = {3, 1, 2, 4, 3};

        assertEquals(1, equilibrium.solution(a1));
    }
}