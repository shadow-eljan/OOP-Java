package Practical;

import java.util.Scanner;

public class LowerToUpper {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String name = s.nextLine();
        System.out.println(name + " converted to: "+ name.toLowerCase());
    }
}
