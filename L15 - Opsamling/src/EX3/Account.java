package EX3;

import java.time.LocalDate;

public class Account {

    private int id = 0;
    private double balance = 0;
    private double annualInterestRate = 0;
    private LocalDate dateCreated;


    public Account() {
    }

    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
        this.dateCreated = LocalDate.now();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public LocalDate getDateCreated() {
        return dateCreated;
    }

    public double getMonthlyInterestRate() {
        double MonthlyInterestRate = 0;
        MonthlyInterestRate = annualInterestRate / 12;
        return MonthlyInterestRate;
    }

    public double getMonthlyInterest() {
        double monthlyInterest = 0;
        monthlyInterest = this.balance * getMonthlyInterestRate();
        return monthlyInterest;
    }

    public void Withdraw(int withdraw) {
        if (withdraw < this.balance) {
            this.balance -= withdraw;
        }
    }

    public void Deposit(int deposit) {
        this.balance += deposit;
    }
}
