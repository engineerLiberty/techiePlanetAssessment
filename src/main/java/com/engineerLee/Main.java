package com.engineerLee;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Techie Assessment Interview");
        System.out.println("============================================================");



        String input = "1234445123444512344451234445123444512344451234445";

        SumOfDigits sumOfDigits = new SumOfDigits();

        System.out.println("============================================================");
        System.out.println("Sum Digits");

        System.out.println("============================================================");
        System.out.println("Digits to be summed: "+input);
        System.out.println("sum of digits is: "+ sumOfDigits.sumOfDigits( input));
    }
}