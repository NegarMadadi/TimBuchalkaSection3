package org.example;

public class FloatAndDouble {
    public static void main(String[] args) {

        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float minimum value = " + myMinFloatValue);
        System.out.println("Float Maximum value = " + myMaxFloatValue);


        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double minimum value = " + myMinDoubleValue);
        System.out.println("Double Maximum value = " + myMaxDoubleValue);


        int intValue = 5 / 3;
        float floatValue = 5f / 3;
        double doubleValue = 5.00 / 3.00;
        System.out.println("myIntValue = " + intValue);
        System.out.println("floatValue = " + floatValue);
        System.out.println("doubleValue = " + doubleValue);


        double numberOfPound = 3;
        double convertToKilograms = numberOfPound * 0.45359247;
        System.out.println(convertToKilograms);

        double pi = 3.1415927;
        double anotherNumber = 3_000_000.4_567_890;
        System.out.println(pi);
        System.out.println(anotherNumber);

    }
}
