public class NumberInWord {
    public static void printNumberInWord(int number) {
        String[] numbers = {"ZERO", "ONE", "TWO", "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT", "NINE"};
        System.out.println((number >=0 && number <=9) ? numbers[number] : "OTHER");
    }
}
