package com.brunomilitzer.codility.lesson7;

import java.util.Stack;

public class Fish {

    public int solution(int[] A, int[] B) {
        Stack<Integer> stack = new Stack<>();
        int survivors = 0;

        for (int i = 0; i < A.length; i++) {
            int weight = A[i];
            if (B[i] == 1) {
                stack.push(weight);
            } else {
                int weightDown = stack.isEmpty() ? -1 : stack.pop();
                while (weightDown != -1 && weightDown < weight)
                    weightDown = stack.isEmpty() ? -1 : stack.pop();
                if (weightDown == -1) {
                    survivors++;
                } else {
                    stack.push(weightDown);
                }
            }
        }

        return survivors + stack.size();
    }
}
