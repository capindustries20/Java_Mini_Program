package org.example;

import java.util.*;
import java.util.Map;

public class FindFirstNonReapeatString {
    public static char firstUniqueChar(String str) {
        Map<Character, Integer> countMap = new LinkedHashMap<>();
        for (char ch : str.toCharArray())
            countMap.put(ch, countMap.getOrDefault(ch, 0) + 1);

        for (Map.Entry<Character, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() == 1) return entry.getKey();
        }
        return '_';
    }


    public static void main(String[] args) {
        System.out.println(firstUniqueChar("HHeelloWorrldd"));
    }
}
