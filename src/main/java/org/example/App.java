/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Hailey Tapia
 */

package org.example;

import java.util.Scanner;

public class App
{
    public static void main(String[] args)
    {
        int celsius = 0, fahrenheit = 0, convertedTemp = 0;
        String convertedType = "";
        Scanner input = new Scanner(System.in);

        System.out.print("Press C to convert from Fahrenheit to Celsius.\nPress F to convert from Celsius to Fahrenheit.\n");
        char convert = input.next().charAt(0);
        System.out.printf("Your choice: %c\n", convert);

        if (convert == 'C' || convert == 'c')
        {
            System.out.print("Please enter the temperature in Fahrenheit: ");
            fahrenheit = input.nextInt();
            celsius = (fahrenheit - 32) * 5 / 9;
            convertedTemp = celsius;
            convertedType = "Celsius";
        }
        else if (convert == 'F' || convert == 'f')
        {
            System.out.print("Please enter the temperature in Celsius: ");
            celsius = input.nextInt();
            fahrenheit = (celsius * 9 / 5) + 32;
            convertedTemp = fahrenheit;
            convertedType = "Fahrenheit";
        }

        System.out.print("The temperature in " + convertedType + " is " + convertedTemp + ".");
    }
}