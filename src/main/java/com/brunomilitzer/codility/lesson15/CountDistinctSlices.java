package com.brunomilitzer.codility.lesson15;

public class CountDistinctSlices {

    public int solution(int M, int[] A) {
        int back = 0;
        int front = 0;
        int slice = 0;
        int sliceSize = 1;
        int dSlice = 0;

        for (int i = 0; i < A.length; i++) {
            slice = A[i];

            if (slice < M) {
                slice += A[i + sliceSize];
                sliceSize++;
            }
        }

        return 0;
    }
}
