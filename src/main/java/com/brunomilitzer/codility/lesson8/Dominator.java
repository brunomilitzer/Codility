package com.brunomilitzer.codility.lesson8;

public class Dominator {

    public int solution(int[] A) {
        int consecutiveSize = 0;
        int candidate = 0;

        for (int item : A) {
            if (consecutiveSize == 0) {
                candidate = item;
                consecutiveSize++;
            } else if (candidate == item) {
                consecutiveSize++;
            } else {
                consecutiveSize--;
            }
        }

        int occurrence = 0;
        int index = 0;

        for (int i = 0; i < A.length; i++) {
            if (A[i] == candidate) {
                occurrence++;
                index = i;
            }
        }

        return occurrence > A.length / 2.0 ? index : -1;
    }
}
