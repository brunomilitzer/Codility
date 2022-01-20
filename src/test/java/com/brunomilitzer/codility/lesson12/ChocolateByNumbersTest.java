package com.brunomilitzer.codility.lesson12;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChocolateByNumbersTest {

    private final ChocolateByNumbers chocolateByNumbers = new ChocolateByNumbers();

    @Test
    public void testScenario1() {
        int n = 10;
        int m = 4;

        assertEquals(5, chocolateByNumbers.solution(n, m));
    }

    @Test
    public void testScenario2() {
        int n = 9;
        int m = 6;

        assertEquals(3, chocolateByNumbers.solution(n, m));
    }

    @Test
    public void testScenario3() {
        int n = 10;
        int m = 11;

        assertEquals(10, chocolateByNumbers.solution(n, m));
    }

}