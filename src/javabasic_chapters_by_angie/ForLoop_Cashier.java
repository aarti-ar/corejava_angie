package javabasic_chapters_by_angie;

import java.util.Scanner;

/*
For Loop
Write a Cashier program that will scan a given number of items and tally
the cost.
 */
public class ForLoop_Cashier {
    public static void main (String args []){
        //Get number of items to scan
        System.out.println("Enter the number of items you would like to scan:");
        Scanner scanner = new Scanner(System.in);           //Created a scanner object
        int quantity;                    //user will enter quantity here
        quantity = scanner.nextInt();

        double total=0;

        //Create loop to iterate through all of the items and accumulate the costs
        for(int i=0; i<quantity; i++){
            System.out.println("Enter the cost of the item:");
            double price = scanner.nextDouble();                     //user will enter price here

            total= total+price;
        }
        scanner.close();
        System.out.println("Your total is £"+total);
    }
}
