package org.example;

public class ByteShortIntLong {
    public static void main(String[] args) {
        int myValue = 10000;
        int myMinValue = Integer.MIN_VALUE;
        int myMaxvalue = Integer.MAX_VALUE;
        System.out.println("Integer  minimum value " + myMinValue);
        System.out.println("Integer  maximum value " + myMaxvalue);
        System.out.println("Busted max value = " + (myMaxvalue + 1));
        System.out.println("Busted min value = " + (myMinValue - 1));
        int myMaxIntTest = 2_147_483_647;

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("byte minimum value = " + myMinByteValue);
        System.out.println("byte maximum value = " + myMaxByteValue);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short minimum value = " + myMinShortValue);
        System.out.println("Short maximum value = " + myMaxShortValue);

        long myLongValue  = 100L;
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long minimum value = " + myMinLongValue);
        System.out.println("Long maximum value = " + myMaxLongValue);
        long bigLongLiteralValue = 2_147_483_647_234L;
        System.out.println(bigLongLiteralValue);

        short BigShortLiteralValue = 32767;

        int myTotal = (myMinValue/ 2);
        byte myNewByteValue = (byte) (myMinByteValue / 2);
        short myNewShortValue = (short) (myMinShortValue / 2 );



        byte challengeByte = 10;
        short challengeShort = 20;
        int challengeInt = 50;
        Long   challengeLong = (long)(50000 + (10 * (challengeByte + challengeShort + challengeInt)));
        System.out.println(challengeLong);
    }

}
