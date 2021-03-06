package com.brunomilitzer.codility.lesson16;

public class MaxNonoverlappingSegments {

    public int solution(int[] A, int[] B) {
        int lastEndSegment = -1;
        int chosenCount = 0;

        for (int i = 0; i < A.length; i++) {
            if (A[i] > lastEndSegment) {
                chosenCount++;
                lastEndSegment = B[i];
            }
        }

        return chosenCount;
    }
}
