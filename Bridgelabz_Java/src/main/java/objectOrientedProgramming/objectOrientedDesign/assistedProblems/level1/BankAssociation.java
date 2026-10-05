package objectOrientedProgramming.objectOrientedDesign.assistedProblems.level1;

import java.util.ArrayList;
import java.util.List;

class Account {
    private String accountNumber;
    private double balance;

    public Account(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = Math.max(initialBalance, 0);
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }
}

class Customer {
    private String name;
    private List<Account> accounts;

    public Customer(String name) {
        this.name = name;
        this.accounts = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addAccount(Account account) {
        if (account != null) {
            accounts.add(account);
        }
    }

    public void viewBalance(Bank bank, String accountNumber) {
        bank.showCustomerBalance(this, accountNumber);
    }

    public List<Account> getAccounts() {
        return new ArrayList<>(accounts);
    }
}

class Bank {
    private String bankName;
    private List<Customer> customers;

    public Bank(String bankName) {
        this.bankName = bankName;
        this.customers = new ArrayList<>();
    }

    public void openAccount(Customer customer, String accountNumber,
                            double initialBalance) {
        if (customer == null || accountNumber == null || accountNumber.isBlank()) {
            System.out.println("Invalid customer or account number.");
            return;
        }

        Account account = new Account(accountNumber, initialBalance);
        customer.addAccount(account);

        if (!customers.contains(customer)) {
            customers.add(customer);
        }

        System.out.println("Account opened for " + customer.getName()
                + " at " + bankName);
    }

    public void showCustomerBalance(Customer customer, String accountNumber) {
        if (customer == null || !customers.contains(customer)) {
            System.out.println("Customer is not associated with this bank.");
            return;
        }

        for (Account account : customer.getAccounts()) {
            if (account.getAccountNumber().equals(accountNumber)) {
                System.out.println("Customer: " + customer.getName());
                System.out.println("Bank: " + bankName);
                System.out.println("Account Number: " + accountNumber);
                System.out.println("Balance: " + account.getBalance());
                return;
            }
        }

        System.out.println("Account not found for this customer.");
    }
}

public class BankAssociation {
    public static void main(String[] args) {
        Bank bank = new Bank("National Bank");

        Customer customer1 = new Customer("Rohith");
        Customer customer2 = new Customer("Sai");

        bank.openAccount(customer1, "ACC1001", 15000);
        bank.openAccount(customer1, "ACC1002", 8000);
        bank.openAccount(customer2, "ACC2001", 12000);

        System.out.println();
        customer1.viewBalance(bank, "ACC1001");
        System.out.println();
        customer1.viewBalance(bank, "ACC1002");
        System.out.println();
        customer2.viewBalance(bank, "ACC2001");
    }
}