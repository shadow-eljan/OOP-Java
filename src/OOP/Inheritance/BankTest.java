package OOP.Inheritance;

public class BankTest {
    public static void main(String[] args) {

        CheckingAccount checking = new CheckingAccount(101, 5000, 5.0, 2000);
        SavingsAccount savings = new SavingsAccount(102, 3000, 4.0);

        System.out.println(" Checking Account ");
        checking.display();
        checking.withdraw(6000);
        checking.display();

        System.out.println(" Savings Account ");
        savings.display();
        savings.withdraw(4000);
        savings.display();
    }
}