package com.brunomilitzer.codility.lesson2;

public class CyclicRotation {

    public int[] solution(int[] A, int K) {

        int[] result = new int[A.length];

        for (int i = 0; i < A.length; i++) {
            int currentPos = (i + K) % A.length;

            result[currentPos] = A[i];
        }

        return result;
    }
}
