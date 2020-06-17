package com.cursos.primitives;

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
        double FisrtDigit = inputAmount();
        System.out.println("Please ,enter the Second number: ");
        double SecondDigit = inputAmount();
        System.out.println("Now choose witch arithmetic action( + , - , * , / ) do you want: ");
        Scanner sc =new Scanner(System.in);
        String strScan = sc.nextLine();
        switch (strScan){
            case "+" :
                System.out.println("Here is your Result : "  + (FisrtDigit + SecondDigit));
                break;
            case "-" :
                System.out.println("Here is your Result : " + (FisrtDigit - SecondDigit));
                break;
            case "*" :
                System.out.println("Here is your Result : " + (FisrtDigit * SecondDigit));
                break;
            case "/" :
                System.out.println("Here is your Result : " + (FisrtDigit / SecondDigit));
                break;
            default:
                System.out.println("PLEASE choose from this list arithmetic action( + , - , * , / )");
                System.out.println("See You Next Time ;) ");

        }
    }

    public static void main(String[] args) {
        ArithmeticOperations();

}
}