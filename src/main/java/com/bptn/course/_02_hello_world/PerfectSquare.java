package com.bptn.course._02_hello_world;

public class PerfectSquare {
    public static void main(String[] args) {
        System.out.println(isPerfectSquare(1));
        System.out.println(isPerfectSquare(4));
        System.out.println(isPerfectSquare(Integer.MAX_VALUE / 100));
        System.out.println(isPerfectSquare(255));

    }

    public static boolean isPerfectSquare(int num) {
        //Bug: loop condition is "i < num", so the number is not included
        //Fix: Include num in the calculations with "<=" 
        for(int i = 1; i <= num; i++) {
        	//Bug: only one "=" sign 
            //Fix: use "==" for comparisons
            if(i*i == num) 
        		return true;
        	else if (i*i > num) return false;
        }
        //Bug: method is missing a default/guaranteed return statement 
        //Fix: return false be default
        return false;
    }
}
