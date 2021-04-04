package javabasic_chapters_by_angie;
/*
Write a method that count the number of words in a String
and prints them individually on a new line.
 */
public class Strings_TextProcessor {

    public static void main(String[] args) {
        //countWord("I like Test Automation University");

        reverseString("Hello TAU!");
    }/**
     Splits a String into an array by tokenizing it.
     Count words and prints them
     @param text Full string to be split
     */
//    public static void countWord(String text){
//        var words=text.split("");
//        int numberOfWords=words.length;
//
//        String message=String.format("Your text contains %d words:", numberOfWords);
//        System.out.println(message);
//        for (int i=0; i<numberOfWords; i++){
//            System.out.println(words[i]);
//       }
    //  }

    /**
     * Prints a String in reverse order
     *
     * @param text String to reverse
     */
    public static void reverseString(String text) {
        for (int i = text.length() - 1; i >= 0; i--) {
            System.out.print(text.charAt(i));
        }
    }
}