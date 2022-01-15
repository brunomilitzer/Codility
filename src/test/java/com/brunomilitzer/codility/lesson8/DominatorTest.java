package com.brunomilitzer.codility.lesson8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DominatorTest {

    private final Dominator dominator = new Dominator();

    @Test
    public void testScenario1() {
        int[] a = {3, 4, 3, 2, 3, -1, 3, 7};

        assertEquals(3, dominator.solution(a));
    }

    @Test
    public void testScenario2() {
        int[] a = {5, 1, 5, 3, 1, 5, 4};

        assertEquals(-1, dominator.solution(a));
    }

    @Test
    public void testScenario3() {
        int[] a = {2, 4, 3, 3, 3, 2, 3};

        dominator.solution(a);

        assertEquals(6, dominator.solution(a));
    }

}