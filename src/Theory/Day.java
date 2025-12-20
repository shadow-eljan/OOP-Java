package Theory;

import java.util.Scanner;

public class Day {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter 1 to 7: ");
        int day = s.nextInt();

        switch(day){
            case 1-> System.out.println("Sunday");
            case 2,3,4,5,6,7 -> System.out.println("Day :)");
            default-> System.out.println("Error");
        }
    }
}
