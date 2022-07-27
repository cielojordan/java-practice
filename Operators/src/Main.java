public class Main {
    public static void main(String[] args) {
        /* Operators are symbols that perform specific operations on one, two, ot three operands, and then return a result. */
        // In the example below, "+" is the operator
        String lastString = "10";
        double doubleNumber = 120.47d;
        lastString += doubleNumber; // lastString = lastString + doubleNumber
        /* Operand is used to describe any object manipulated by an operator. */
        // In the example below, 15 and 12 are operands
        int myVar = 15 + 12;
        // Variables used instead of literals are also operands.
        double hoursWorked = 40d;
        double hourlyRate = 10.50d;
        double mySalary = hoursWorked * hourlyRate;
        System.out.println("My salary is " + mySalary);
        // An Expression is formed by combining variables, literals, method return values and operators
        // In the example below, hoursWorked * newHourlyRate is the expression which returns the
        double newHourlyRate = 20.50d;
        double myNewSalary = hoursWorked * newHourlyRate;
        System.out.println("My new salary is " +myNewSalary );

        // Comments -- ignored by computer and added to a program to help describe something for humans


        // ==== More Examples ==== //
        int result = 1 + 2; // 1 + 2 = 3
        System.out.println("1 + 2 = " + result);
        int previousResult = result;
        System.out.println("previousResult = " + previousResult);
        result -= 1;
        System.out.println("3 - 1 " + result);
        System.out.println("previousResult = " + previousResult); // previousResult independent of result

        result *= 10; // 2 * 10 = 20
        System.out.println(" 2 * 10 = " + result);

        result /= 5;
        System.out.println("20 / 5 = " + result);

        result %= 3; // the remainder of (4 % 3) = 1
        System.out.println("4 % 3 = " + result);

        result++; // 1 + 1 = 2
        System.out.println("1 + 1 = " + result);

        result--; // 2 - 1 = 1
        System.out.println("2 - 1 = " + result);

        // === Conditional Logic === //
        // uses specific statements to allow us to check a condition and execute certain code based on whether that condition (expression) is true or false

        // if-then statement: tells the program to execute to a certain section of code only if a particular test evaluates to true

        boolean isAlien = false;
        if (!isAlien) {// isAlien == false
            System.out.println("It is not an alien!");
            System.out.println("And I am scared of aliens!");
        } else {
            System.out.println("It is an alien!");
        }

        int topScore = 100;
        if (topScore >= 100) {
            System.out.println("You got the top score!");
        }

        /* Logical AND and Logical OR
        * Logical AND (&&) and OR (||): operates on boolean operands; checks if a given condition is true or false
        * Bitwise AMD (&) and OR (|) --operates at the bit level; advanced concept
        */

        boolean isCar = false;
        if (isCar) {
            System.out.println();
        }
        isCar = true;
        boolean wasCar = isCar ? true : false;

        if (wasCar) {
            System.out.println("wasCar is true");
        }

        // Ternary Operator: shortcut o assigning one of two values to a variable depending on a given condition
        int ageOfClient = 20;

        boolean isEighteenOrOVer = (ageOfClient == 20) ? true : false;
        System.out.println(isEighteenOrOVer);

        // Summary of Operators
        // https://docs.oracle.com/javase/tutorial/java/nutsandbolts/opsummary.html

        // Java Operator Precedence Table
        // http://www.cs.bilkent.edu.tr/~guvenir/courses/CS101/op_precedence.html

        // === Operator Challenge === //
        // 1. Create a double with a value of 20.00
        double myDoubleValue = 20.00d;
        // 2. Create a second variable of type double with the value of 80.00
        double mySecondDoubleValue = 80.00d;
        // 3. Add both numbers together and multiply by 100
        double mySumValue = (myDoubleValue + mySecondDoubleValue) * 100.00d;
        // 4. Use the remainder operator to figure out what the remainder from the result of the operation step 3 and 40.00.
        double myRemainderValue = mySumValue % 40.00d;
        // 5. Create a boolean variable that assigned the value true if the remainder in #4 is 0 or false if it's not zero
        boolean isRemainderZero = myRemainderValue == 0; // boolean isRemainderZero = (myRemainderValue == 0) ? true : false
        System.out.println("Is the remainder zero? " + isRemainderZero);
        if (!isRemainderZero) {
            System.out.println("Got some remainder");
        }
    }
}