package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int number;
        int correctNumber = 14;
        int difference;
        System.out.println("I'm thinking of a number between 1 and 100");
        System.out.println("(including both). Can you guess what it is?");
        System.out.println("Type a number:");

        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();
        System.out.println("Your guess is: "+number);
        System.out.println("The number I was thinking of is: "+correctNumber);

        difference = correctNumber - number;
        if (difference < 0) {
            difference= difference *-1;
        }
        System.out.println("You were off by: " + difference);
        /*
        I'm thinking of a number between 1 and 100
        (including both). Can you guess what it is?
        Type a number: 45
        Your guess is: 45
        The number I was thinking of is: 14
        You were off by: 31 */
    }
}
