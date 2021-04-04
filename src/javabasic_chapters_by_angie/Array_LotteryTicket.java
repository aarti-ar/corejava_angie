package javabasic_chapters_by_angie;

import java.util.Random;

/*
Create a Lottery Quick Pick application that will
 generate a lottery ticket with 6 random numbers between 1-69 numbers
*/
public class Array_LotteryTicket {
    private static final int LENGTH =6;
    private static final int MAX_TICKET_NUMBER =69;

    public static void main(String []args){
        int []ticket = generateNumber();
        printTicket(ticket);
    }
    public static int [] generateNumber(){
        int[] ticket = new int[LENGTH];
        Random random = new Random();
        for(int i=0; i<LENGTH; i++){
            ticket[i]=random.nextInt(69)+1;
        }
        return ticket;
    }
    public static void printTicket(int ticket []){
        for (int i=0; i<LENGTH; i++){
            System.out.print(ticket[i]+" | ");
        }
    }

}
