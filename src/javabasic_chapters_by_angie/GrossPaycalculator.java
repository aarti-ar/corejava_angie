package javabasic_chapters_by_angie;

import java.util.Scanner;

public class GrossPaycalculator {
    public static void main(String args[]){

        //1.Get the number of Hours worked
        System.out.println("Enter the number of Hours the employee worked.");
        Scanner scanner=new Scanner(System.in);
        int hours=scanner.nextInt();

        //2.Get the Hourly pay rate
        System.out.println("Enter the employee's pay rate.");
        double rate=scanner.nextDouble();
        scanner.close();


        //3.Multiply hours and pay rate
        double grossPay= hours* rate;

        //4.Display result
        System.out.println("The employee's gross pay is £" + grossPay);

    }
}
