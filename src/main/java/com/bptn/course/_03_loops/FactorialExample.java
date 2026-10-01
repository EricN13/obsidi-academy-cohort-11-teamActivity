package com.bptn.course._03_loops;

import java.util.Scanner;

class FactorialExample {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int fact = 1;
        
        // Get the number from user 
        System.out.print("Enter a number to calculate its factorial: ");
        int number = scanner.nextInt(); 

        for (int i = 1; i <= number; i++) {
            // Calculate factorial
            fact = fact * i;
        }

        System.out.println("Factorial of " + number + " is: " + fact);
    }
  }