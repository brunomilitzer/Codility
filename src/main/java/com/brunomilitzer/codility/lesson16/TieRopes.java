package com.brunomilitzer.codility.lesson16;

public class TieRopes {

    public int solution(int K, int[] A) {
        int count = 0;
        int ropeLength = 0;

        for (int rope : A) {
            ropeLength += rope;

            if (ropeLength >= K) {
                count++;
                ropeLength = 0;
            }
        }

        return count;
    }
}
