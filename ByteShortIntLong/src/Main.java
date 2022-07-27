public class Main {
    public static void main(String[] args) {
//        int myValue = 10000;

//        Int - 32 bits
        int myMinIntValue = Integer.MAX_VALUE;
        int myMaxIntValue = Integer.MIN_VALUE;
        System.out.println("Integer Minimum Value = " + myMinIntValue);
        System.out.println("Integer Maximum Value = " + myMaxIntValue);
        System.out.println("Busted MIN value = " + (myMinIntValue - 1));
        System.out.println("Busted MAX value = " + (myMaxIntValue + 1));

        int myMaxIntTest = 2_147_483_647;

//        Byte - 8 bits
        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Minimum Value = " + myMinByteValue);
        System.out.println("Byte Maximum Value = " + myMaxByteValue);

//        Short - 16 bits
        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Minimum Value = " + myMinShortValue);
        System.out.println("Short Maximum Value = " + myMaxShortValue);

//        Long - 64 bits
//        long myLongValue = 100L;
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long Minimum Value = " + myMinLongValue);
        System.out.println("Long Minimum Value = " + myMaxLongValue);
        long bigLongLiteralValue = 2_147_483_647_234L;
        System.out.println(bigLongLiteralValue);

        int myTotal = (myMinIntValue / 2);


//        Casting - treat or convert a number from one tupe to another
//        e.g. (byte) (myMinByteValue/2)
        //        byte myNewByteValue = (myMinByteValue / 2); // error because value inside parentheses detected as int
        byte myNewByteValue = (byte) (myMinByteValue / 2);
        short myNewShortValue = (short) (myMinShortValue / 2);

        int myNewIntValue = (int) (123.456 / 2);
        long myNewLongValue = (long) (50000L + (10L * (myNewByteValue + myNewShortValue + myNewIntValue)));
        System.out.println(myNewLongValue);
    }
}