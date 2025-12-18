package Practical;

import java.util.Scanner;

public class Operations {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("1st number: ");
        int a = s.nextInt();
        System.out.println("2nd number: ");
        int b = s.nextInt();

        System.out.println("Sum:"+ (a+b));
        System.out.println("Minus:"+ (a-b));
        System.out.println("Multiply:"+ a*b);
        System.out.println("Divide:"+ a/b);
        System.out.println("Modulus:"+ a%b);
    }
}
