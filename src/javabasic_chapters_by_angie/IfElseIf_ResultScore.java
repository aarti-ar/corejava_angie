package javabasic_chapters_by_angie;

import java.util.Scanner;

public class IfElseIf_ResultScore {
    public static void main(String args[]){
      //Get the test score
        System.out.println("Enter your test score:");
        Scanner scanner =new Scanner(System.in);
        double score =scanner.nextDouble();

        //Determine the letter grade
        char grade; //For single word with single quote

         if (score <60) {      //Decision
             grade= 'F';
         }
         else if(score <70){
             grade='D';
         }
         else if(score <80){
             grade='C';
         }
         else if(score <90){
             grade='B';
         }else {
             grade='A';
         }
        System.out.println("Your grade is"+ grade);
    }
}
