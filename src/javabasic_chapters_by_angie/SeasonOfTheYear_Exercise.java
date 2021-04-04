package javabasic_chapters_by_angie;

import java.util.Scanner;
/*
    Create a program that asks user for a season of the year,
    the a whole number,then an adjective. Use the input to complete the
    the sentence below the output the result:
    "On a [adjective][season of the year]day,
     i drink a minimum of[whole number]cups of coffee."
     */

public class SeasonOfTheYear_Exercise {


    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a season of the year:");
        String season = scanner.next();

        System.out.println("Enter a whole number:");
        int number = scanner.nextInt();

        System.out.println("Enter an adjective:");
        String adjective = scanner.next();

        scanner.close();

        System.out.println("On a " + adjective + " " + season +
                " day, I drink a minimum of " + number +
                " cups of coffee.");
    }
}
