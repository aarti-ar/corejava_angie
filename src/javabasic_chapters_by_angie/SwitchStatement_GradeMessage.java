package javabasic_chapters_by_angie;

import java.util.Scanner;

public class SwitchStatement_GradeMessage {
    public static void main(String args[]){

        //Just for Information->Switch statement more Talks about the Quality so bit different from if-else-if

        System.out.println("Enter your letter grade:");
        Scanner scanner =new Scanner(System.in);
        String grade=scanner.next();

        String message;     //It will hold the string
        switch (grade){
            case "A":
                message= "Excellent job!";
            break;
            case "B":
                message="Great job!";
             break;
            case "C":
                message="Good job!";
                break;
            case "D":
                message="You need to work a bit harder";
                break;
            case "F":
                message="Uh Oh!";
                break;
            default:
                message="Error. Invalid grade";
                break;
        }
        System.out.println(message);
    }
}
