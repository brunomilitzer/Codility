package com.brunomilitzer.codility.lesson4;

import java.util.Arrays;

public class MaxCounter {

    public int[] solution(int N, int[] A) {
        int[] counters = new int[N];
        Arrays.fill(counters, 0);

        int startLine = 0;
        int currentMax = 0;

        for (int i : A) {
            int x = i - 1;

            if (i > N) startLine = currentMax;
            else if (counters[x] < startLine) counters[x] = startLine + 1;
            else counters[x] += 1;

            if (i <= N && counters[x] > currentMax) currentMax = counters[x];
        }

        for (int i = 0; i < counters.length; i++) {
            if (counters[i] < startLine) counters[i] = startLine;
        }

        return counters;
    }
}
