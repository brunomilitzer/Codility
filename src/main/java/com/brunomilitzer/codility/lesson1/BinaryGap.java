package com.brunomilitzer.codility.lesson1;

public class BinaryGap {

    public int solution(int N) {

        String binaryString = Integer.toBinaryString(N);
        boolean started = false;

        int counter = 0;
        int maxCount = 0;

        for (char c : binaryString.toCharArray()) {
            if (c == '1') {
                if (started) {
                    if (counter > maxCount) maxCount = counter;
                }

                counter = 0;
                started = true;
            }
            if (c == '0') {
                counter++;
            }
        }

        return maxCount;
    }
}
