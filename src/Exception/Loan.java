package Exception;

import java.sql.SQLOutput;
import java.util.Date;

class Loan {

    private double annualInterestRate;
    private int numberOfYears;
    private double loanAmount;
    private Date loanDate;


    public Loan() {
        this.loanDate = new Date();
    }


    public Loan(double annualInterestRate, int numberOfYears, double loanAmount) {

        if (annualInterestRate <= 0)
            throw new IllegalArgumentException("Interest rate must be greater than zero");

        if (numberOfYears <= 0)
            throw new IllegalArgumentException("Number of years must be greater than zero");

        if (loanAmount <= 0)
            throw new IllegalArgumentException("Loan amount must be greater than zero");

        this.annualInterestRate = annualInterestRate;
        this.numberOfYears = numberOfYears;
        this.loanAmount = loanAmount;
        this.loanDate = new Date();
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        if (annualInterestRate <= 0)
            throw new IllegalArgumentException("Interest rate must be greater than zero");
        this.annualInterestRate = annualInterestRate;
    }

    public int getNumberOfYears() {
        return numberOfYears;
    }

    public void setNumberOfYears(int numberOfYears) {
        if (numberOfYears <= 0)
            throw new IllegalArgumentException("Number of years must be greater than zero");
        this.numberOfYears = numberOfYears;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(double loanAmount) {
        if (loanAmount <= 0)
            throw new IllegalArgumentException("Loan amount must be greater than zero");
        this.loanAmount = loanAmount;
    }

    public Date getLoanDate() {
        return loanDate;
    }

    public double monthlyPayment() {
        return 0.0;
    }

    public double totalPayment() {
        return (loanAmount * annualInterestRate * numberOfYears)/100;
    }
}

