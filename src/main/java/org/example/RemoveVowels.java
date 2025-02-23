package org.example;

import java.util.*;

public class RemoveVowels {
    public static boolean isVowel(char c) {
        char lowercase = Character.toLowerCase(c);
        return lowercase == 'a' || lowercase == 'e' || lowercase == 'i' || lowercase == 'o' || lowercase == 'u';
    }

    public static String removeVowel(String input) {
        StringBuilder result = new StringBuilder();

        for (char c : input.toCharArray()) {
            if (!isVowel(c)) {
                result.append(c);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        String result = removeVowel(input);
        System.out.println(result);
    }
}