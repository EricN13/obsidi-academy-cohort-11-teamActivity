package com.bptn.course.__Knowledge_Check_Ins.Day06;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double side1 = scanner.nextDouble();
        double side2 = scanner.nextDouble();
        double side3 = scanner.nextDouble();

        if (isValid(side1, side2, side3)) {
            double area = area(side1, side2, side3);
            System.out.println("The area of the triangle is: " + area);
        } else {
            System.out.println("The given sides do not form a valid triangle.");
        }
    }

    public static boolean isValid(double side1, double side2, double side3) {
        // Check if the sum of any two sides is greater than the third 
        return (side1 + side2 > side3) && (side1 + side3 > side2) && (side2 + side3 > side1);
    }

    public static double area(double side1, double side2, double side3) {
        // Calculate the area of the triangle 
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }
}
