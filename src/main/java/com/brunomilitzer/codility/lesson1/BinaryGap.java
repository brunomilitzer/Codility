package com.brunomilitzer.codility.lesson1;

public class BinaryGap {

    public int solution(int N) {

        String binaryString = Integer.toBinaryString(N);
        int binaryGapCount = 0;

        for (char c : binaryString.toCharArray()) {
            if (c == '1') {

            } else {
                binaryGapCount++;
            }

            System.out.println(c);
        }

        return 0;
    }
}
