public class Main {
    public static void main(String[] args) {
//        Primitive Types: byte, short, int, long, float, double, char, boolean
//        Creating own data types with classes
//        String: sequence of characters (char); limited by MAX_VALUE of an int (~2.14 billion)
        String myString = "This is a string";
        System.out.println("myString is equal to " + myString);
        myString += ", and this is more."; // myString = myString + <more_text>
        System.out.println("myString is equal to " + myString);
        myString += "\ua00A9 2019";
        System.out.println("myString is equal to " + myString);
        String numberString = "250.55";
        numberString += "49.95";
        System.out.println(numberString);

        String lastString = "10";
        int myInt = 50;
        lastString += myInt;
        System.out.println("lastString is equal to " + lastString);

        // String in Java are immutable -- can't change a String after it's created; a new String gets created instead.
    }
}