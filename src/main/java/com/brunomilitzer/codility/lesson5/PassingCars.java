package com.brunomilitzer.codility.lesson5;

public class PassingCars {

    public int solution(int[] A) {
        int[] suffixSum = new int[A.length + 1];
        int count = 0;

        for (int i = A.length - 1; i >= 0 ; i--) {
            suffixSum[i] = A[i] + suffixSum[i  + 1];
            if (A[i] == 0) count += suffixSum[i];
            if (count > 1000000000) return -1;
        }

        return count;
    }
}
