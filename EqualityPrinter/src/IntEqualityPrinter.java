public class IntEqualityPrinter {
    public static void printEqual(int firstNumber, int secondNumber, int thirdNumber) {
        System.out.println((firstNumber<0 || secondNumber <0 || thirdNumber<0) ? "Invalid Value" : (firstNumber == secondNumber && secondNumber == thirdNumber) ? "All numbers are equal" : (firstNumber == secondNumber || firstNumber == thirdNumber || secondNumber == thirdNumber) ? "Neither all are equal or different": "All numbers are different");
    }
}
