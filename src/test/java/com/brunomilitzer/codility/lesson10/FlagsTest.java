package com.brunomilitzer.codility.lesson10;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FlagsTest {

    private final Flags flags = new Flags();

    @Test
    public void testScenario1() {
        int[] a = {1, 5, 3, 4, 3, 4, 1, 2, 3, 4, 6, 2};

        assertEquals(3, flags.solution(a));
    }

}