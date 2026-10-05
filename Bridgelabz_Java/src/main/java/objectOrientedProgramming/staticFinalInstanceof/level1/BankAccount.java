package objectOrientedProgramming.staticFinalInstanceof.level1;

public class BankAccount {
    private static String bankName = "State Bank";
    private static int totalAccounts = 0;

    private String accountHolderName;
    private final String accountNumber;

    public BankAccount(String accountHolderName, String accountNumber) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        totalAccounts++;
    }

    public static int getTotalAccounts() {
        return totalAccounts;
    }

    public void displayDetails() {
        System.out.println("Bank: " + bankName);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Account Number: " + accountNumber);
    }

    public static void displayIfBankAccount(Object object) {
        if (object instanceof BankAccount) {
            BankAccount account = (BankAccount) object;
            account.displayDetails();
        } else {
            System.out.println("The object is not a BankAccount.");
        }
    }

    public static void main(String[] args) {
        BankAccount first = new BankAccount("Rohith", "BA1001");
        BankAccount second = new BankAccount("Sai", "BA1002");

        displayIfBankAccount(first);

        System.out.println("\nTotal Accounts: " + BankAccount.getTotalAccounts());

        System.out.println("\nChecking a different object:");
        displayIfBankAccount("Not a bank account");
    }
}