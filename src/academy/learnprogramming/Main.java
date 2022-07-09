package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        int myValue = 10000;

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;

        System.out.println("Int min value " + myMinIntValue);
        System.out.println("Int max value " + myMaxIntValue);

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;

        System.out.println("Int min value " + myMinByteValue);
        System.out.println("Int max value " + myMaxByteValue);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;

        System.out.println("Int min value " + myMinShortValue);
        System.out.println("Int max value " + myMaxShortValue);

        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;

        System.out.println("Int min value " + myMinLongValue);
        System.out.println("Int max value " + myMaxLongValue);
        long bigLongLiteralValue = 2147438647234L; /*adding L in the end converts to long*/
    }
}
