package Practical;

import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter fahrenheit: ");
        double fahrenheit = s.nextDouble();
        double celsius = (fahrenheit-32) * 5/9;
        System.out.println("Celsius: "+ celsius);
    }
}
