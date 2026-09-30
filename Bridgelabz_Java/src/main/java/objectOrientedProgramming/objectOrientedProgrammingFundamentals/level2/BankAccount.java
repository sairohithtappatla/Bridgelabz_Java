package objectOrientedProgramming.objectOrientedProgrammingFundamentals.level2;

import java.util.Scanner;

public class BankAccount {

    // Instance variables store individual account details
    private String accountHolder;
    private String accountNumber;
    private double balance;

    // Constructor to initialize bank account attributes
    public BankAccount(String accountHolder, String accountNumber, double balance) {
        setAccountHolder(accountHolder);
        setAccountNumber(accountNumber);
        setBalance(balance);
    }

    // Getter method to return account holder
    public String getAccountHolder() {
        return accountHolder;
    }

    // Setter method to update account holder
    public void setAccountHolder(String accountHolder) {
        if (accountHolder == null || accountHolder.trim().isEmpty()) {
            throw new IllegalArgumentException("Account holder cannot be empty.");
        }
        this.accountHolder = accountHolder;
    }

    // Getter method to return account number
    public String getAccountNumber() {
        return accountNumber;
    }

    // Setter method to update account number
    public void setAccountNumber(String accountNumber) {
        if (accountNumber == null || accountNumber.trim().isEmpty()) {
            throw new IllegalArgumentException("Account number cannot be empty.");
        }
        this.accountNumber = accountNumber;
    }

    // Getter method to return current balance
    public double getBalance() {
        return balance;
    }

    // Setter method to initialize or update balance
    public void setBalance(double balance) {
        if (balance < 0 || Double.isNaN(balance) || Double.isInfinite(balance)) {
            throw new IllegalArgumentException("Balance must be non-negative and finite.");
        }
        this.balance = balance;
    }

    // Method to deposit money into the account
    public void deposit(double amount) {
        if (amount <= 0 || Double.isNaN(amount) || Double.isInfinite(amount)) {
            throw new IllegalArgumentException("Deposit must be a positive finite amount.");
        }
        balance += amount;
    }

    // Method to withdraw money when sufficient balance exists
    public boolean withdraw(double amount) {
        if (amount <= 0 || Double.isNaN(amount) || Double.isInfinite(amount)) {
            throw new IllegalArgumentException("Withdrawal must be a positive finite amount.");
        }

        // Check whether the account has enough funds
        if (amount > balance) {
            return false;
        }

        // Deduct the withdrawal from the balance
        balance -= amount;
        return true;
    }

    // Method to display account details and balance
    public void displayBalance() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.printf("Current Balance: %.2f%n", balance);
    }

    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);

        try {
            // Get account details
            System.out.print("Enter account holder name: ");
            String accountHolder = input.nextLine();

            System.out.print("Enter account number: ");
            String accountNumber = input.nextLine();

            System.out.print("Enter opening balance: ");
            double balance = Double.parseDouble(input.nextLine());

            // Create BankAccount object
            BankAccount account = new BankAccount(accountHolder, accountNumber, balance);

            // Get deposit amount
            System.out.print("Enter amount to deposit: ");
            double depositAmount = Double.parseDouble(input.nextLine());

            // Deposit money
            account.deposit(depositAmount);
            System.out.println("Deposit successful.");

            // Get withdrawal amount
            System.out.print("Enter amount to withdraw: ");
            double withdrawalAmount = Double.parseDouble(input.nextLine());

            // Attempt withdrawal
            if (account.withdraw(withdrawalAmount)) {
                System.out.println("Withdrawal successful.");
            } else {
                System.out.println("Insufficient balance. Withdrawal declined.");
            }

            // Display updated account details
            System.out.println("\nAccount Details");
            account.displayBalance();
        } catch (IllegalArgumentException exception) {
            // Display validation or input errors
            System.out.println("Invalid input: " + exception.getMessage());
        }

        // Close Scanner
        input.close();
    }
}