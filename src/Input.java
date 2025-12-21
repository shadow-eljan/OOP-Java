import java.util.Scanner;

public class Input {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = s.nextLine();
        boolean val = true;

        System.out.print("Enter your age: ");
        int age = s.nextInt();
        s.nextLine();

        System.out.print("Enter your address: ");
        String address = s.nextLine();

        System.out.println("\nYour Card Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
        System.out.printf("Name : %s", name);
        System.out.printf("\nValue: %b", val);

    }
}
