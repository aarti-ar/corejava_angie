package javabasic_chapters_by_angie;

import java.util.Scanner;
/*
The Objective of the game is to enter enough to equal exactly $1!
Crete a program that asks a user tp enter the quantities for the following coins:
pennies,nickels,dimes,and quarters.Your program should count up the value of
all the changes.If it's exactly $1 , they win! If it's more than $1,tell them
by how much they went over,if it's less than $1,tell them by how much they went under.
*/

public class IfElseIf_ChangeForADollarGame {

    public static void main(String args[]){

        double penny = .01;
        double nickel = .05;
        double dime = .10;
        double quarter = .25;
        int dollar = 1;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to 'Change for a Dollar'! " +
                "Your goal is to enter enough change to make exactly $1.00");

        System.out.println("Enter your number of pennies:");
        int numOfPennies = scanner.nextInt();

        System.out.println("Enter your number of nickels:");
        int numOfNickels = scanner.nextInt();

        System.out.println("Enter your number of dimes:");
        int numOfDimes = scanner.nextInt();

        System.out.println("Enter your number of quarters:");
        int numOfQuarters = scanner.nextInt();

        scanner.close();

        double total = numOfPennies * penny + numOfNickels * nickel + numOfDimes * dime + numOfQuarters * quarter;

        if(total < dollar){
            double amountShort = dollar - total;

            //Way to make the decimal print with only 2 decimal places
            System.out.println("Sorry, you lose! You were short " + String.format("%.2f", amountShort) + " cents.");
        }
        else if(total > dollar){
            double amountOver = total - dollar;

            //Way to make the decimal print with only 2 decimal places
            System.out.println("Sorry, you lose! You were over " + String.format("%.2f", amountOver) + " cents.");
        }
        else{
            System.out.println("Yay! That's exactly $1.00! You win!");
        }
    }
}
/*
So, you're going to create a program that asks the user to enter the quantities for the following coins.

You'll ask them how many pennies would you like?
How many nickels would you like?
How many dimes?
And then, how many quarters?
What your program is going to do is count up the value of all of the change that they answered.

If it's exactly one dollar then they win the game.
If it's more than one dollar, then you need to tell them that it's more than one dollar and how much they went over.
If it's less than one dollar, tell them how much they went under.
Feel free to change this game for your country's currency, so if you don't use dollars and you use something else that's fine.

So, for an example of this let's say that I ask the user:

How many pennies? - And they said 0.
How many nickels? - 0
How many dimes? - 0
How many quarters? - 4

Then my program would know that, okay quarters are worth 25 cents.
There's 4 of these, let me multiply those and get the value. Oh! that equals one dollar,
so I let them know that they win. So that's an example of the game.
 */
