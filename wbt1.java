import java.util.Scanner;

public class wbt1{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bank bank = new Bank();

        boolean exit = false;

        while (!exit) {
            System.out.println("\t\t\tWelcome to the Bank Application");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            System.out.println();
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    createAccount(scanner, bank);
                    break;
                case 2:
                    performDeposit(scanner, bank);
                    break;
                case 3:
                    performWithdraw(scanner, bank);
                    break;
                case 4:
                    exit = true;
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }

    private static void createAccount(Scanner scanner, Bank bank) {
        System.out.print("Enter account type :  ");
        String accountType = scanner.nextLine();
        System.out.print("Enter owner's name: ");
        String ownerName = scanner.nextLine();

        Account newAccount = bank.createAccount(accountType, ownerName);
        System.out.println("Account created successfully:");
        System.out.println("Account Number: " + newAccount.getAccountNumber());
        System.out.println("Owner Name: " + newAccount.getOwnerName());
        
    }

    private static void performDeposit(Scanner scanner, Bank bank) {
        // Implementation remains the same as before
        System.out.print("Enter account number: ");
        int accountNumber = scanner.nextInt();
        System.out.print("Enter amount to deposit: ");
        double amount = scanner.nextDouble();

        Account account = bank.getAccount(accountNumber);
        if (account != null) {
            account.deposit(amount);
        } else {
            System.out.println("Account not found.");
        }
    }


    private static void performWithdraw(Scanner scanner, Bank bank) {
        // Implementation remains the same as before
        System.out.print("Enter account number: ");
        int accountNumber = scanner.nextInt();
        System.out.print("Enter amount to withdraw: ");
        double amount = scanner.nextDouble();

        Account account = bank.getAccount(accountNumber);
        if (account != null) {
            account.withdraw(amount);
        } else {
            System.out.println("Account not found.");
        }
    }
}
