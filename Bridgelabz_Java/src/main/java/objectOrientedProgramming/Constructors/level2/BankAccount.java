package objectOrientedProgramming.Constructors.level2;

public class BankAccount {
    public String accountNumber;
    protected String accountHolder;
    private double balance;

    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = Math.max(balance, 0);
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        }
    }

    public void displayDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount("AC1001", "Rohith", 15000.0);
        account.setBalance(18000.0);
        account.displayDetails();

        System.out.println("\nSavings Account");
        SavingsAccount savings = new SavingsAccount(
            "AC2001", "Sai", 25000.0, 4.5
        );
        savings.displaySavingsDetails();
    }
}