import java.util.ArrayList;
import java.util.List;

abstract class BankAccount {
    private String accountNumber;
    private String holderName;
    private double balance;

    public BankAccount(
            String accountNumber,
            String holderName,
            double balance) {

        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Invalid withdrawal.");
        }
    }

    public abstract double calculateInterest();
}

interface Loanable {
    void applyForLoan(double amount);

    boolean calculateLoanEligibility();
}

class SavingsAccount extends BankAccount implements Loanable {

    public SavingsAccount(
            String accountNumber,
            String holderName,
            double balance) {

        super(accountNumber, holderName, balance);
    }

    @Override
    public double calculateInterest() {
        return getBalance() * 0.04;
    }

    @Override
    public void applyForLoan(double amount) {
        System.out.println(
            "Savings account loan application: ₹" + amount
        );
    }

    @Override
    public boolean calculateLoanEligibility() {
        return getBalance() >= 50000;
    }
}

class CurrentAccount extends BankAccount implements Loanable {

    public CurrentAccount(
            String accountNumber,
            String holderName,
            double balance) {

        super(accountNumber, holderName, balance);
    }

    @Override
    public double calculateInterest() {
        return getBalance() * 0.02;
    }

    @Override
    public void applyForLoan(double amount) {
        System.out.println(
            "Current account loan application: ₹" + amount
        );
    }

    @Override
    public boolean calculateLoanEligibility() {
        return getBalance() >= 100000;
    }
}

public class BankingSystem {

    public static void main(String[] args) {

        List<BankAccount> accounts = new ArrayList<>();

        accounts.add(
            new SavingsAccount(
                "SA1001",
                "Rohith",
                75000
            )
        );

        accounts.add(
            new CurrentAccount(
                "CA1002",
                "Arjun",
                150000
            )
        );

        for (BankAccount account : accounts) {

            System.out.println(
                "Account Holder: " +
                account.getHolderName()
            );

            System.out.println(
                "Account Number: " +
                account.getAccountNumber()
            );

            System.out.println(
                "Balance: ₹" +
                account.getBalance()
            );

            System.out.println(
                "Interest: ₹" +
                account.calculateInterest()
            );

            Loanable loanable = (Loanable) account;

            loanable.applyForLoan(50000);

            System.out.println(
                "Loan Eligible: " +
                loanable.calculateLoanEligibility()
            );

            System.out.println("--------------------");
        }
    }
}