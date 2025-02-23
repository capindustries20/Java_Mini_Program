    package org.example;
    public class Palindrome {
        public static boolean isPalindrome(int num){
            int original = num,rev = 0;
            while (num > 0){
                rev = rev * 10 + num % 10;
                num /= 10;
            }
            return original == rev;
        }
        public static void main(String[] args) {
            System.out.println(isPalindrome(121) ? "Yes" : "No");
        }
    }