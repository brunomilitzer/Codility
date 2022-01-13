package com.brunomilitzer.codility.lesson4;

public class FrogRiverOne {

    public int solution(int X, int[] A) {

        boolean[] riverPositions = new boolean[X + 1];

        for (int time = 0; time < A.length; time++) {
            int pos = A[time];

            if (!riverPositions[pos]) {
                riverPositions[pos] = true;
                X -= 1;

                if (X == 0) return time;
            }
        }

        return -1;
    }
}
