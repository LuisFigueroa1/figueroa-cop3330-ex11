package org.example;

/*
 *  UCF COP3330 Fall 2021 exercise 11 Solution
 *  Copyright 2021 Luis Figueroa
 */

import java.util.Scanner; //the scanner utility

public class App
{
    public static void main( String[] args ) //main function
    {
        Scanner userInput = new Scanner(System.in);

        //declare the variables that will be used in convertion
        Double euro;
        Double rate;


        //scan all the numbers
        System.out.println("How many euros are you exchanging? " );
        euro = userInput.nextDouble(); //scan the input
        System.out.println("What is the exchange rate? " );
        rate = userInput.nextDouble(); //scan the input

        //math operations
        double doll = rate * euro;

        //round up the cents for final dollar
        double dollF = Math.floor(doll*100)/100;

        //print output
        System.out.println(euro + " euros at an exchange rate of "
        + rate + " is " + dollF + " U.S. dollars.");
    }
}