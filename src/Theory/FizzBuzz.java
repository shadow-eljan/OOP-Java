package Theory;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number:");
        int num = s.nextInt();

        if(num%3==0 && num%5==0){
            System.out.println("Planet Destruction");
        } else if (num%3==0) {
            System.out.println("Planet");
        } else if (num%5==0) {
            System.out.println("Destruction");
        }else{
            System.out.println("Void");
        }
    }
}
