package javabasic_chapters_by_angie;

import java.util.Scanner;

/*
Do While
Write a program that allows a user to enter teo numbers,
and then sums up the two numbers.The user should be able to
repeat this action untill they indicate they are done.
 */
public class DoWhileLoop_AddNumbers {
    public static void main (String  args[]){
        Scanner scanner = new Scanner(System.in);   //scanner object created

        boolean again;

        do {
            System.out.println("Enter the first number");
            double num1=scanner.nextDouble();  //will insert 1st number

            System.out.println("Enter the second number");
            double num2=scanner.nextDouble();   //will insert 2nd number

            double sum =num1 + num2;
            System.out.println("The sum is" + sum);

            System.out.println("Would you like to start over? true or false");
            again =scanner.nextBoolean();      //will insert true or false
        }while (again);
    }
}
