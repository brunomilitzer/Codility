package com.brunomilitzer.codility.lesson7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BracketsTest {

    private final Brackets brackets = new Brackets();

    @Test
    public void testScenario1() {
        String s = "{[()()]}";

        assertEquals(1, brackets.solution(s));
    }

    @Test
    public void testScenario2() {
        String s = "([)()]";

        assertEquals(0, brackets.solution(s));
    }

}