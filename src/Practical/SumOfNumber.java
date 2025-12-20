package Practical;

import java.util.Scanner;

public class SumOfNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number from 0 to 1000:");
        int number = s.nextInt();
        int sum =0;
        int n = number;

            if(n<0 || n>1000){
                System.out.println("Invalid Number.");
            }else{
                while(n >0){
                    int m = n%10;
                    sum +=m;
                    n = n/10;
                }
             }
        System.out.println("Sum of Numbers: "+sum);
    }
}
