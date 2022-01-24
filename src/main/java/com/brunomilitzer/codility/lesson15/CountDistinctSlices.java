package com.brunomilitzer.codility.lesson15;

import java.util.Arrays;

public class CountDistinctSlices {

    public int solution(int M, int[] A) {
        int totalSlices = 0;
        boolean[] inCurrentSlice = new boolean[M + 1];
        Arrays.fill(inCurrentSlice, false);
        int head = 0;

        for (int tail = 0; tail < A.length; tail++) {
            while (head < A.length && !inCurrentSlice[A[head]]) {
                inCurrentSlice[A[head]] = true;
                totalSlices += (head - tail) + 1;
                head++;

                if (totalSlices > 1000000000) totalSlices = 1000000000;
            }
            inCurrentSlice[A[tail]] = false;
        }

        return totalSlices;
    }
}
