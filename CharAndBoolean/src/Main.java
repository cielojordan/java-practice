public class Main {
    public static void main(String[] args) {
        // char occupied two bytes of memory or 16 bits
        char myChar = 'D';

        // Unicode
        // 1. international encoding standard for use with different languages and scripts, by which each letter, digit, or symbol is  assigned a unique numeric value that applies across different platforms and programs
        // 2. Allows representation of various languages by using a combination of the two bytes that a char takes up in memory it can represent and one of 65535 different types of characters
        char myUnicodeChar = '\u0044';
        System.out.println("myChar: " + myChar);
        System.out.println("myUnicodeChar: " + myUnicodeChar);

        char myCopyrightChar = '\u00A9';
        System.out.println("myCopyrightChar: " + myCopyrightChar);

        // Boolean = true | false

        boolean myTrueBooleanValue = true;
        boolean myFalseBooleanValue = false;

        boolean isCustomerOverTwentyOne = true;
    }
}