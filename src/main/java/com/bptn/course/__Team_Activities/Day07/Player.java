package com.bptn.course.__Team_Activities.Day07;

/* From the previous exercise. 
 * If you want to run the TestClass, 
 * you'll need to paste the code for your Player class here.
 */

import java.util.Scanner;

public class Player {

    private String name;
    // Add other instance variable(s)
    private String playerNumber;

    // Question: should scanner be static or not?
    // Yes the scanner should be static, so a new scanner is not created with every
    // instance
    private static Scanner scanner = new Scanner(System.in);// complete line

    public Player(String name, String playerNumber) {
        // complete constructor
        this.name = name;
        this.playerNumber = playerNumber;
    }

    // create getter methods

    public int makeMove() {
        System.out.println("Make your move. What column do you want to put a token in?");
        int column = scanner.nextInt(); // receive user input
        return column;
    }

    public String toString() {
        return ("Player " + playerNumber + " is " + name);
    }

    public String getName() {
        return name;
    }

    public String getPlayerNumber() {
        return playerNumber;
    }

}