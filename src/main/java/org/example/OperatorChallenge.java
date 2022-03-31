package org.example;

public class OperatorChallenge {

    public static void main(String[] args) {

        double first = 20.00;
        double second = 80.00;
        double math = (first + second) * 100;
        System.out.println("math = "+ math);
        double remainder = math % 40.0;
        System.out.println("reminder = "+ remainder);
        boolean result = (remainder == 0) ? true : false;
        System.out.println("There is no reminder "+result);

        if (!result){
            System.out.println("Got some reminder.");
        }
    }
}
