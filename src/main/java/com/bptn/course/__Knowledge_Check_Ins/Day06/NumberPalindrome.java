package com.bptn.course.__Knowledge_Check_Ins.Day06;

import java.util.Scanner;

public class NumberPalindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		System.out.println("Enter a positive integer: ");
		int number = input.nextInt();
		if(isPalindrome(number))
			System.out.println(number + " is a palindrome.");
		else 
			System.out.println(number + " is not a palindrome.");
	}
	
    //Bug: the method should be static
	public static int reverse(int number) {
		int reversed = 0;
		
		while(number > 0) {
			int mod = number % 10;
			reversed = reversed*10+mod;
			number /= 10;
		}
		return reversed;
	}
	
    //Bug: the method should be static and return a boolean
    //Fix: the method should return true if the number is equal to its reverse, false otherwise
	public static boolean isPalindrome(int number) {
		return number == reverse(number);
	}
}
