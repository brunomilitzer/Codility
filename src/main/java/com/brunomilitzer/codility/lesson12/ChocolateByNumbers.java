package com.brunomilitzer.codility.lesson12;

public class ChocolateByNumbers {

    private int findGcd(int a, int b) {
        if (b == 0) return a;
        else return findGcd(b, a % b);
    }

    public int solution(int N, int M) {
        return N / findGcd(N, M);
    }
}
