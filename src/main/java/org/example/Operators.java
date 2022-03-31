package org.example;

public class Operators {
    public static void main(String[] args) {

        int result = 1 + 2;
        System.out.println("1+2 = " + result);
        int previusResult = result;
        System.out.println("PreviousResult = " + previusResult);
        result = result - 1;
        System.out.println("3-2 = " + result);
        System.out.println("PreviousResult =  " + previusResult);

        result = result * 10;
        System.out.println("2*10 = " + result);

        result = result / 5;
        System.out.println("20/5 = " + result);

        result = result % 3;
        System.out.println("4%3 = " + result);

        //result + 1;
        result++; // 1+1 = 2
        System.out.println("1+1 = " + result);

        //resul -1
        result--; // 2-1 = 1
        System.out.println("2-1 = " + result);

        // result +2
        result += 2; // 1+2 =3
        System.out.println("1+2 = " + result);

        //result = result * 10
        result *= 10; // 3*10 = 30
        System.out.println("3*10 = " + result);

        //result = result * 10
        result /= 3; // 30/3 = 10
        System.out.println("30/3 = " + result);

        //result = result - 2
        result -= 2; // 10-2 = 8
        System.out.println("10-2 = " + result);

        boolean isALien = false;
        if (isALien == true) {
            System.out.println("It is not an Alien!");
            System.out.println("And I am scared of aliens.");
        }


        int topScore = 80;
        if (topScore < 100) {
            System.out.println("You got the high Score!");
        }

        int secondTopScore = 81;
        if ((topScore > secondTopScore) && (topScore < 100)) {
            System.out.println("Greater than secondTopScore and less than topScore");
        }

        if ((topScore > 90) || (secondTopScore <= 90)) {
            System.out.println("Either or both of the conditions are true.");
        }

        int newValue = 50;
        if (newValue == 50){
            System.out.println("This is is true.");


            boolean isCAr = false;
            if (isCAr){
                System.out.println("This is not supposed to happen.");
            }

            isCAr = true;
            boolean wasCar = isCAr ? true : false;
            if (wasCar){
                System.out.println("wasCar is true.");
            }



        }
    }
}

