package Practical;

import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userInput = "";
        do {
            System.out.println("This is a looped program, do u wanna continue(Y/N)");
            userInput = scanner.nextLine().toUpperCase();
        }
        while (userInput.equalsIgnoreCase("Y"));
        System.out.println("Loop ended");
    }
}
