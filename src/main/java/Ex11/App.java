package Ex11;

import java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Christopher Jean
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        System.out.println("How many euros are you exchanging?");
        double euro = input.nextDouble();
        System.out.println("What is the exchange rate?");
        double rate = input.nextDouble();
        System.out.println(euro + " euros at an exchange rate of "+rate+" is");

        double dollars = Math.ceil((rate * euro)*100)/100;
        System.out.println(dollars +" U.S. dollars.");



    }
}
