package com.brunomilitzer.codility.lesson16;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TieRopesTest {

    private final TieRopes tieRopes = new TieRopes();

    @Test
    public void testScenario1() {
        int k = 4;
        int[] a = {1, 2, 3, 4, 1, 1, 3};

        assertEquals(3, tieRopes.solution(k, a));
    }

}