public class Main {
    public static void main(String[] args) {
        int newScore = calculateScore("Tim", 500);
        System.out.println(newScore);
        calculateScore(75);
        calculateScore();

        System.out.println(calcFeetAndInchesToCentimeters(2, 7));
        System.out.println(calcFeetAndInchesToCentimeters(23));
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points.");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Unnamed player scored " + score + " points.");
        return score * 1000;
    }

    public static int calculateScore() {
        System.out.println("No player name, no player score.");
        return 0;
    }

    // need to change number of parameters to make it unique
//    public static void calculateScore() {
//        System.out.println("No player name, no player score.");
//    }

    // ==== Challenge ==== //
    /* Create a method called calcFeetAndInchesToCentimeters
    * It needs to have two parameters.
    * feet is the first parameter, inches is the 2nd parameter
    *
    * You should validate that the first parameter feet is >=0
    * You should validate that the first parameter inches is >=0 and <=12
    * return -1 if it is not true
    *
    * If the parameters are valid, then calculate how many centimeters comprise the feet and inches passed to this method and return that value.
    */
    public static double calcFeetAndInchesToCentimeters(int feet, int inches) {
        return (feet >=0 && (inches >=0 && inches <=12)) ? ((feet * 12) + inches) * 2.54 : -1;
    }
    /*
    * Create a 2nd method of the same name but with only one parameter: inches
    * validate that it's >=0
    * return -1 if it is not true
    * But if it is valid, then calculate how many feet are in teh inches and then here is the tricky part
    * call the other overloaded method passing the correct feet and inches calculated so that it can calculate correctly
    * hints: Use double for your number data types is probably a good idea
    * 1 inch = 2.54 cm and one foot = 12 inches
    *
    * Call another overloaded method by using the corresponding number of parameters
    *
    * */
    public static double calcFeetAndInchesToCentimeters(int inches) {
        return ((inches >=0)) ? (inches) * 2.54 : -1;
    }






}