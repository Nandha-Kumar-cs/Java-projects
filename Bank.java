import java.util.ArrayList;

public class Bank {
    private ArrayList<Account> accounts;

    public Bank() {
        this.accounts = new ArrayList<>();
    }

    // Method to add an account to the bank
    public void addAccount(Account account) {
        accounts.add(account);
        System.out.println("Account added successfully.");
    }

    // Method to find an account by account number
    public Account getAccount(int accountNumber) {
        for (Account acc : accounts) {
            if (acc.getAccountNumber() == accountNumber) {
                return acc;
            }
        }
        return null; // Account not found
    }

    // Method to create a new account
    public Account createAccount(String accountType, String ownerName) {
        Account newAccount = new Account(accountType, ownerName);
        addAccount(newAccount);
        return newAccount;
    }

    // Method to perform a transaction (deposit or withdraw)
    public void performTransaction(int accountNumber, double amount, String transactionType) {
        Account account = getAccount(accountNumber);
        if (account != null) {
            if (transactionType.equalsIgnoreCase("deposit")) {
                account.deposit(amount);
            } else if (transactionType.equalsIgnoreCase("withdraw")) {
                account.withdraw(amount);
            } else {
                System.out.println("Invalid transaction type.");
            }
        } else {
            System.out.println("Account not found.");
        }
    }
}
