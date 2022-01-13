package com.brunomilitzer.codility.lesson3;

public class PermMissingElem {

    public int solution(int[] A) {

        long actualSum = 0;
        long maxNumber = A.length + 1;
        long expectedSum = 0;

        for (int number : A) {
            actualSum += number;
        }

        expectedSum = (maxNumber * (maxNumber + 1)) / 2;

        return (int) (expectedSum - actualSum);
    }
}
