import java.util.Scanner;

public class Divisible {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = s.nextInt();

        if(num % 3 == 0 && num % 5 == 0){
            System.out.println("Divisible");
        }else{
            System.out.println("Not Divisible");
        }
    }
}
