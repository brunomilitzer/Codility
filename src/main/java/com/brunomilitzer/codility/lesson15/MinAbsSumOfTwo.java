package com.brunomilitzer.codility.lesson15;

import java.util.Arrays;

public class MinAbsSumOfTwo {

    public int solution(int[] A) {
        int minAbsSumOfTwo = Integer.MAX_VALUE;
        Arrays.sort(A);

        int head = 0;
        int tail = A.length - 1;

        while (head <= tail) {
         minAbsSumOfTwo = Math.min(minAbsSumOfTwo, Math.abs(A[head] + A[tail]));
         if (A[head] + A[tail] < 0) head++;
         else tail--;
        }

        return minAbsSumOfTwo;
    }
}
