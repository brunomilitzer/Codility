package com.brunomilitzer.codility.lesson2;

import java.util.Arrays;

public class OddOccurrencesInArray {

    public int solution(int[] A) {
        Arrays.sort(A);

        System.out.println(Arrays.toString(A));

        int unpair = 0;

        for (int i = 1; i < A.length - 1; i += 2) {
            if (A[i] != A[i + 1]) unpair = A[i];
        }

        return unpair;
    }
}
