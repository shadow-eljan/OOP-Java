package Practical;

import java.util.Scanner;

public class Futureinvestment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double amount;
        double rate;
        double time;
        System.out.println("Enter investment amount: ");
        amount = scanner.nextDouble();
        System.out.println("Enter annual interest rate: ");
        rate = scanner.nextDouble();
        System.out.println("Enter number of years: ");
        time = scanner.nextDouble();
        double futureInvestmentVal = amount*(Math.pow((1+(rate/100)),time));
        System.out.printf("Total investment in %f years will be %.2f",time,futureInvestmentVal);

    }
}
