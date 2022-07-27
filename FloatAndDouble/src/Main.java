public class Main {
    public static void main(String[] args) {
        float myMinFLoatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float minimum value = " + myMinFLoatValue);
        System.out.println("Float maximum value = " + myMaxFloatValue);

        double myMinDoubleValue = Float.MIN_VALUE;
        double myMaxDoubleValue = Float.MAX_VALUE;
        System.out.println("Double minimum value = " + myMinDoubleValue);
        System.out.println("Double maximum value = " + myMaxDoubleValue);


        int myIntValue = 5;
        float myFloatValue = 5.25f; // float myFloatValue = (float) 5.25;
        double myDoubleValue = 5.25d;

        // === Challenge === //
        // Convert a number of pounds into kilograms
        // 1. Create a variable with the appropriate type to store the number of pounds to be converted into kilograms.
        // 2. Calculate the result i.e. the number of kilograms based on the contents of the variable above and store the result in a 2nd appropriate variable.
        // 3. Print out the result
        // HINT: 1 pound = 0.45359237

        double numberOfPounds = 200d;
        double convertedKilograms = numberOfPounds * 0.45359237d;
        System.out.println("Number of kilograms in " + numberOfPounds + " pounds: " + convertedKilograms);

        double pi = 3.1415927d;
        double anotherNumber = 3_000_000.4_567_890d;
        System.out.println(pi);
        System.out.println(anotherNumber);

        // Big Decimal overcomes the issue of precise calculations due to limitation with how floating point numbers are stored/


    }
}