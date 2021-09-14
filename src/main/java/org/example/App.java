package org.example;

import java.util.Objects;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 18 Solution
 *  Copyright 2021 Tyler Coleman
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Press C to convert from Fahrenheight to Celcius.");
        System.out.println("Press F to convert from Celcius to Fahrenheit.");
        System.out.println("Your choice: ");
        String choice = in.nextLine();
        double temp;
        double convertedTemp;
        String fromTemp = null, toTemp = null;
        if (Objects.equals(choice, "F")|(Objects.equals(choice, "f"))) {
            fromTemp = "Celcius";
            toTemp = "Fahrenheit";
        }
        if (Objects.equals(choice, "C")|(Objects.equals(choice, "c"))) {
            fromTemp = "Fahrenheight";
            toTemp = "Celcius";
        }
        System.out.printf("Please enter the temperature in %s: ", fromTemp);
        temp = in.nextDouble();
        if (Objects.equals(fromTemp, "Fahrenheight")) {
            convertedTemp = (temp - 32) * 5 / 9;
        }
        else {
            convertedTemp = (temp * 9 / 5) + 32;
        }
        System.out.printf("The temperature in %s is %.02f", toTemp, convertedTemp);
    }
}
