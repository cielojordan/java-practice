import java.lang.reflect.Array;

public class Main {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;


        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);
//        calculateScore(true, 800, 5, 100);
//        calculateScore(true, 1000, 8, 200);

        // === Challenge Output === //
        String player = "John Smith";

        displayHighScorePosition(player, calculateHighScorePosition(1000));
        displayHighScorePosition(player, calculateHighScorePosition(900));
        displayHighScorePosition(player, calculateHighScorePosition(400));
        displayHighScorePosition(player, calculateHighScorePosition(50));
    }

    // methods
//    public static void calculateScore( boolean gameOver, int score, int levelCompleted, int bonus) { // void for null return
    public static int calculateScore ( boolean gameOver, int score, int levelCompleted, int bonus) {
//        boolean gameOver = true;
//        int score = 800;
//        int levelCompleted = 5;
//        int bonus = 100;

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
//            System.out.println("Your final score was " + finalSscore);
            return finalScore;
        }
        return -1;
    }

    // ===== CHALLENGE ===== //
    /* Create a methods called displayHighSorePosition
     * It should receive a player's name as a parameter and a 2nd parameter as a position in the high score table
     * You should display the players name along with a message like " managed to get into position ' and the position they got and a further message " on the high score table". */

    public static void displayHighScorePosition( String playerName, int highScorePosition) {
        System.out.println( playerName + " managed to get into position " + highScorePosition);
    }

    /* Create a 2nd method called calculateHighScorePosition
     * it should be sent one argument only, the player score
     * It should return an int
     * the return data should be
     * 1 if the score is >=1000
     * 2 if the score is >=500 and < 1000
     * 3 if the score is >=100 and < 500
     * 4 in all other cases */

    public static int calculateHighScorePosition(int playerScore) {
//        if (playerScore >= 1000 )
//            return 1;
//        else if ( playerScore >= 500)
//            return 2;
//        else if ( playerScore >= 100)
//            return 3;
//        else
//            return 4;
        int position = 4; // default position
        if (playerScore >= 1000 )
            position = 1;
        else if ( playerScore >= 500)
            position = 2;
        else if ( playerScore >= 100)
            position = 3;
        return position;
    }

    // Call both methods and displau the results of the following
    //  a score of 1500, 900, 400 and 50
}


