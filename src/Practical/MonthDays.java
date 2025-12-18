package Practical;

import java.util.Scanner;

public class MonthDays {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a month (1 to 12): ");
        int choice = s.nextInt();

        System.out.print("Enter a year: ");
        int year = s.nextInt();

        switch(choice){
            case 1, 3, 5, 7, 8, 10, 12 -> System.out.println("31 days in this month.");
            case 4,6,9,11 -> System.out.println("30 days in this month");
            case 2 ->{
                if((year % 400 == 0) || (year % 4 == 0 && year % 100 !=0)){
                    System.out.println("29 days.");
                }else{
                    System.out.println("28 days.");
                }
            }
            default -> System.out.println("Invalid Input.");
        }

    }
}
