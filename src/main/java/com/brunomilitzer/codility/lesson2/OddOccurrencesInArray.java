package com.brunomilitzer.codility.lesson2;

import java.util.HashSet;
import java.util.Set;

public class OddOccurrencesInArray {

    private final Set<Integer> aList = new HashSet<>();

    public int solution(int[] A) {
        for (int a : A) {
            if (aList.contains(a)) aList.remove(a);
            else aList.add(a);
        }

        return aList.iterator().next();
    }
}
