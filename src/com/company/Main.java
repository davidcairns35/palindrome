package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a word to find out if it is a palindrome");
        String palindrome = scanner.next();

        if (isPalindrome(palindrome))
            System.out.println(palindrome + " is a palindrome");
        else
            System.out.println(palindrome + " is not a palindrome");

        System.out.println("Would you like to check another word to see if it is a palindrome?");
        String response = scanner.next();
        if(response.equalsIgnoreCase ("yes")){
            main(null);
        }
    }

    static boolean isPalindrome(String str) {
        int n = str.length();

        // Empty string is not a palindrome
        if (n == 0)
            return false;

        return isPal(str, 0, n - 1);
    }

    static boolean isPal(String str, int s, int e){
        // If there is only one character
        if (s == e)
            return true;

        // First and last characters do not match
        if ((str.charAt(s)) != (str.charAt(e)))
            return false;

        // If more than two characters check if middle substring is also a palindrome
        if (s < e + 1)
            return isPal(str, s + 1, e - 1);

        return true;
    }

}