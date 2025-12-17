package Practical;

import java.util.Scanner;

public class FeetToMeter {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter feet to convert: ");
        double feet = s.nextDouble();

        double meter = feet * 0.305;

        System.out.println("Total Meter: "+ meter);
    }
}
