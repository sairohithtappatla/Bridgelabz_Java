class BankAccount {
    protected String accountNumber;
    protected double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void displayAccountType() {
        System.out.println("Bank Account");
    }

    public void displayDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: ₹" + balance);
    }
}

class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(
            String accountNumber,
            double balance,
            double interestRate) {

        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    @Override
    public void displayAccountType() {
        System.out.println("Account Type: Savings Account");
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}

class CheckingAccount extends BankAccount {
    private double withdrawalLimit;

    public CheckingAccount(
            String accountNumber,
            double balance,
            double withdrawalLimit) {

        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    @Override
    public void displayAccountType() {
        System.out.println("Account Type: Checking Account");
        System.out.println("Withdrawal Limit: ₹" + withdrawalLimit);
    }
}

class FixedDepositAccount extends BankAccount {
    private int durationMonths;

    public FixedDepositAccount(
            String accountNumber,
            double balance,
            int durationMonths) {

        super(accountNumber, balance);
        this.durationMonths = durationMonths;
    }

    @Override
    public void displayAccountType() {
        System.out.println("Account Type: Fixed Deposit Account");
        System.out.println("Duration: " + durationMonths + " months");
    }
}

public class BankAccountTypes {

    public static void main(String[] args) {

        BankAccount[] accounts = {
            new SavingsAccount("SA1001", 50000, 6.5),
            new CheckingAccount("CA1002", 30000, 10000),
            new FixedDepositAccount("FD1003", 100000, 24)
        };

        for (BankAccount account : accounts) {
            account.displayDetails();
            account.displayAccountType();
            System.out.println("--------------------");
        }
    }
}