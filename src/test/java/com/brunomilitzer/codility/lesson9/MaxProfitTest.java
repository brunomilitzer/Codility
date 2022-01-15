package com.brunomilitzer.codility.lesson9;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxProfitTest {

    private final MaxProfit maxProfit = new MaxProfit();

    @Test
    public void testScenario1() {
        int[] a = {23171, 21011, 21123, 21366, 21013, 21367};

        assertEquals(356, maxProfit.solution(a));
    }
}