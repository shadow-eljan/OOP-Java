package Practical;

import java.util.Scanner;

public class AsciiToChar {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number from 0 to 128");
        int num = s.nextInt();

        System.out.println("The char of ascii code: "+ num + " is: " + (char)num);
    }
}
