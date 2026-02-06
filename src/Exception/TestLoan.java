package Exception;

public class TestLoan {
    public static void main(String[] args) {
        Loan myloan= new Loan();
        try {
            myloan.setAnnualInterestRate(6);
            myloan.setNumberOfYears(10);
            myloan.setLoanAmount(0);
        } catch(IllegalArgumentException e) {
            System.out.println("Error"+e.getMessage());
        }
        System.out.println(myloan.getAnnualInterestRate());
        System.out.println(myloan.totalPayment());
    }
}