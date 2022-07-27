public class Main {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 5000;
        int levelCompleted = 5;
        int bonus = 100;

        // === If then Else === //
        /* The if statement identifies which statement or code block to run based on the value of an expression. In other words, based on a specific condition.
        * Inside the code block defined by curly braces { and } we can have one or multiple statements
        * We can use the else statement after the if. In that case, when the condition is false, the else block will be executed.
        * We can also add else if to test multiple conditions. */
        boolean condition = true;
        if (condition) {
            // if statement block
        } else {
            // else statement block
        }


        if (score == 5000 ) // without code block, can only run one line
            System.out.println("Your score was 5000.");
        else { // can run more than one line of code
            System.out.println("Your score was not 5000.");
            System.out.println("This will never be executed.");
        }

        System.out.println("This is always executed.");

    }
}