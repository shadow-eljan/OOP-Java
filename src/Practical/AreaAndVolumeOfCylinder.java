package Practical;

import java.util.Scanner;

public class AreaAndVolumeOfCylinder {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter radius: ");
        int radius = s.nextInt();
        System.out.println("Enter length: ");
        int length = s.nextInt();
        double area = radius * radius* Math.PI;
        double volume = area * length;

        System.out.println("Area: "+ area);
        System.out.println("Volume: "+ volume);
    }
}
