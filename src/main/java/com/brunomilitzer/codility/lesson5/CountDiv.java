package com.brunomilitzer.codility.lesson5;

public class CountDiv {

    public int solution(int A, int B, int K) {
        int start = (int) Math.ceil(A / (double) K);
        int end = (int) Math.floor(B / (double) K);

        return  (end - start) + 1;
    }
}
