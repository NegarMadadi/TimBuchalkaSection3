package org.example;


public class Strings {
    public static void main(String[] args) {
       String myString = "This is my string";
        System.out.println(  "My String is " + myString);
        myString = myString + ", and this is more.";
        System.out.println(  "My String is equal to " + myString);
        myString = myString + " \u00A9 2019";
        System.out.println("My string is equl to = " + myString);

        String numberString = "250.55 ";
        numberString = numberString + "49.95";
        System.out.println(numberString);

        String lastString = "10";
        int myInt = 50;
        lastString = lastString + 50;
        System.out.println("Last string is equal to " + lastString);

        double doubleNumebr = 120.4;
        lastString = lastString + doubleNumebr;
        System.out.println("Last String is equal to "+ lastString);


    }
}
