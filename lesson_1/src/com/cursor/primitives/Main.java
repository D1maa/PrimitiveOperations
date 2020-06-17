package com.cursor.primitives;

import java.util.Scanner;

public class Main {
    private static double inputAmount()
    {
        Scanner input = new Scanner(System.in);
        while (true)
        {
            try
            {
                double amount = input.nextDouble();
                return amount;
            }
            catch (java.util.InputMismatchException e)
            {
                input.nextLine();
            }
        }
    }

     static void ArithmeticOperations() {
        System.out.println("Please ,enter the First number: ");
        double firstDigit = inputAmount();
        System.out.println("Please ,enter the Second number: ");
        double secondDigit = inputAmount();
         Scanner sc =new Scanner(System.in);

         System.out.println("Now choose which arithmetic action( + , - , * , / ) do you want: ");
         String strScan = sc.nextLine();
        switch (strScan){
            case "+" :
                System.out.println("Here is your Result : "  + (firstDigit + secondDigit));
                break;
            case "-" :
                System.out.println("Here is your Result : " + (firstDigit - secondDigit));
                break;
            case "*" :
                System.out.println("Here is your Result : " + (firstDigit * secondDigit));
                break;
            case "/" :
                System.out.println("Here is your Result : " + (firstDigit / secondDigit));
                break;
            default:
                System.out.println("PLEASE choose from this list arithmetic action( + , - , * , / )");
                System.out.println("See You Next Time ;) ");

        }
    }



    public static void main(String[] args) {
        byte a = 127;
        short b = 32767;
        int c =345;
        long d = 33443L;
        float e = 22.11f;
        double f = 3313.44;
        char g = 'g';
        char cr = 71;
        System.out.println("a : " + a);
        System.out.println("b : " + b);
        System.out.println("c : " + c);
        System.out.println("d : " + d);
        System.out.println("e : " + e);
        System.out.println("f : " + f);
        System.out.println("g : " + g);
        System.out.println("cr (ASCII): " + cr);

        ArithmeticOperations();





}
}