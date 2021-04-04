package javabasic_chapters_by_angie;

public class Reverse_String {

    public static void main(String []args){

        reverseString("Hello TAU!");
    }
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
