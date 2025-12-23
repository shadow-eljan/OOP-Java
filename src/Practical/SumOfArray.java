package Practical;

import java.util.Scanner;

public class SumOfArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] arr = new double[10];
        double sum = 0;
        System.out.println("Enter 10 values: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextDouble();
        }
        for (double eachValue : arr) {
            sum += eachValue;
        }
        System.out.println("Sum: " + sum);
    }
}
