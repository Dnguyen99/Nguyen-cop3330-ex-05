/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Dylan Nguyen
 */

package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);

        System.out.println("What is the first number? ");
        int num1 = scan.nextInt();
        System.out.println("What is the second number? ");
        int num2 = scan.nextInt();

        System.out.println(+num1+ " + " +num2+ " = " +(num1 + num2));
        System.out.println(+num1+ " - " +num2+ " = " +(num1 - num2));
        System.out.println(+num1+ " * " +num2+ " = " +(num1 * num2));
        System.out.println(+num1+ " / " +num2+ " = " +(num1 / num2));

    }
}
