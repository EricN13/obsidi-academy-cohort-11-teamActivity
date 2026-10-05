package com.bptn.course._05_strings;

import java.util.Scanner;

public class StringOperations {
    public static void main(String[] args) {
        // write your code below:
        // Write a menu-driven program to perform different operations on a string:
        // palindrome check, reverse a string, and string compare.
        Scanner scanner = new Scanner(System.in);

        System.out.println("String Operations Menu:");
        System.out.println("1. Check if a string is a palindrome");
        System.out.println("2. Reverse a string");
        System.out.println("3. Compare two strings");
        
        System.out.println("Please enter your choice (1-3):");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                // Check if a string is a palindrome
                System.out.println("Enter the string to check for palindrome: ");
                scanner.nextLine(); // Consume the newline character
                String input = scanner.nextLine();
                isPalindrome(input);
                break;
            case 2:
                // Reverse a string
                System.out.println("Enter the string to reverse: ");
                scanner.nextLine(); // Consume the newline character
                String reverseInput = scanner.nextLine();
                System.out.println("Reversed string is: " + reverseString(reverseInput));
                break;
            case 3:
                // Compare two strings
                System.out.println("Enter the first string: ");
                scanner.nextLine(); // Consume the newline character
                String str1 = scanner.nextLine();
                System.out.println("Enter the second string: ");
                String str2 = scanner.nextLine();
                compareStrings(str1, str2);
                break;
            default:
                System.out.println("Invalid choice!");
                break;
        }
    }

    public static void isPalindrome(String input) {
        // Implement palindrome check logic here
        String reverseInput = reverseString(input);

        if (input.equals(reverseInput)){
                System.out.println(input + " is palindrome");
          } else {
                System.out.println(input + " is not palindrome");
          }
    }

    public static String reverseString(String input) {
        // Implement string reversal logic here
        String reverseInput = "";
        for ( int i = input.length()-1; i>=0; i--){
            reverseInput += input.charAt(i);
        }
        return reverseInput;
    }

    public static void compareStrings(String str1, String str2) {
        // Implement string comparison logic here
        int result = str1.compareTo(str2);
        if (result == 0) {
            System.out.println("The entered Strings are equal.");
        } else {
            System.out.println("The entered strings are not equal.");
        }
    }


}