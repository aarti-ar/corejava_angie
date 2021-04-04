package javabasic_chapters_by_angie;

import java.util.Scanner;

/*
While Loop
Each store employee makes £15 an hour.
Write a program that allows the employee
to enter the number of hour worked for the week.Do not allow overtime.
 */
public class WhileLoop_GrossPayInputValidation {
        public static void main(String args[]){

            //Initialize known variables
            int rate=15;
            int maxHour=40;

            //Get input for unknown variables
            System.out.println("How many hours did you work this week?");
            Scanner scanner=new Scanner(System.in);                     //created scanner object
            double hourWorked = scanner.nextDouble();

            //validate input
            while (hourWorked > maxHour || hourWorked <1){              //Logical operator
                System.out.println(("Invalid entry. Your hours must be between 1 and 40,Try again"));
                hourWorked =scanner.nextDouble();
            }
            scanner.close();
            //Calculate Gross
            double gross= rate * hourWorked;
            System.out.println("Gross pay: £"+ gross);
        }

}
