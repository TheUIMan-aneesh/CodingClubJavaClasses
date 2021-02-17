package com.example;
import java.util.Scanner;
//import java.util.*

public class lesson01 {
    public static void main(String[] args)
    {
        //String deals with sentences and words
        //Int- integers
        //Double  - numbers with decimals

        String string1 = "Hey";
        int num1 = 11;
        int num2 = 500;

        int sum = num1 + num2;

        System.out.println("Added together " + sum + " subtracted together " +(num1-num2));
        System.out.println(string1);

        //Finding the average
        int average = (num1 + num2)/2;

        System.out.println(average);

        //Take in input
        Scanner input = new Scanner(System.in);
        //Print out pick a number
        System.out.println("Pick a number: "); //You can just use print instead of println to get the input on the same line
        //Store the number
        int number = input.nextInt();


        System.out.println("Pick another number: ");
        int number2= input.nextInt();

        int addition = number + number2;
        int product = number * number2;
        int divide = number/number2;


        //Print out the sum of the inputted numbers
        System.out.println("The sum is: " + addition);
        System.out.println("The product is: " + product);
        System.out.println("The quotient is: " + divide);


    }
}
