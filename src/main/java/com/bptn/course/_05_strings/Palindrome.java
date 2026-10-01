package com.bptn.course._05_strings;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
       System.out.println("Enter the string to check for palindrome: ");
       Scanner scanner = new Scanner(System.in);
       String input = scanner.nextLine();
       String reverseInput = "";

       // Fill in the code below to reverse the input string and store it in the reverseInput variable
         for ( int i = input.length()-1; i>=0; i--){
            reverseInput += input.charAt(i);
        }

        System.out.println("Reversed string is: " + reverseInput);
       // Write the code below to display "Input string is palindrome" or "Input string is not palindrome". 
       //Note: you'll have to write the logic to make that decision, as well.
         if (input.equals(reverseInput)){
                System.out.println(input + " is palindrome");
          } else {
                System.out.println(input + " is not palindrome");
          }
      
   }
}
