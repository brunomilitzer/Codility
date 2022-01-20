package com.brunomilitzer.codility.lesson10;

public class Flags {

    public int solution(int[] A) {
        int[] peaks = new int[A.length];
        int nextPeak = A.length;
        peaks[A.length - 1] = nextPeak;

        for (int i = A.length - 2; i > 0 ; i--) {
            if (A[i] > A[i + 1] && A[i] > A[i - 1]) nextPeak = i;

            peaks[i] = nextPeak;
        }

        peaks[0] = nextPeak;

        int currentGuess = 0;
        int nextGuess = 0;

        while (canPlaceFlags(peaks, nextGuess)) {
            currentGuess = nextGuess;
            nextGuess++;
        }

        return currentGuess;
    }

    private boolean canPlaceFlags(int[] peaks, int flagsToPlace) {
        int currentPosition = 1 - flagsToPlace;

        for (int i = 0; i < flagsToPlace; i++) {
            System.out.println(i);
            if (currentPosition + flagsToPlace > peaks.length - 1) return false;
            currentPosition = peaks[currentPosition + flagsToPlace];
        }

        return  currentPosition < peaks.length;
    }
}
