package com.brunomilitzer.codility.lesson9;

public class MaxProfit {

    public int solution(int[] A) {
        int globalMax = 0;
        int localMaxSum = 0;

        for (int i = 1; i < A.length; i++) {
            int d = A[i] - A[i - 1];
            localMaxSum = Math.max(d, localMaxSum + d);
            globalMax = Math.max(localMaxSum, globalMax);
        }

        return globalMax;
    }
}
