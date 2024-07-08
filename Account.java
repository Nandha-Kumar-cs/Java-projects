public class Account {
    private static int nextAccountNumber = 1;

    private int accountNumber;
    private double balance;
    private String accountType;
    private String ownerName;

    // Constructor
    public Account(String accountType, String ownerName) {
        this.accountNumber = nextAccountNumber++;
        this.accountType = accountType;
        this.ownerName = ownerName;
        this.balance = 0.0; // Initial balance
    }

    // Getter and Setter methods

    // Method to deposit money
    public void deposit(double amount) {
        balance += amount;
        System.out.println(amount + " deposited.\n Current balance: " + balance);
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println(amount + " withdrawn. Current balance: " + balance);
        } else {
            System.out.println("Insufficient balance. Withdrawal failed.");
        }
    }

    // Getter for account number
    public int getAccountNumber() {
        return accountNumber;
    }

    // Getter for owner's name
    public String getOwnerName() {
        return ownerName;
    }
}
