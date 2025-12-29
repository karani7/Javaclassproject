import java.util.Scanner;
public class ATMSimulation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Initialize account with the starting balance
        System.out.println("=== Welcome to the ATM ===");
        System.out.print("Enter your starting balance:$");
        double startingBalance = getValidAmount(scanner);

        Account account = new Account(startingBalance);
        boolean isRunning = true;

        //Main loop - keeps running until the user exits
        while (isRunning) {
            displayMenu();

            String choice = scanner.nextLine().trim();

            switch (choice) {
                case "1":
                    handleDeposit(scanner, account);
                    break;

                case "2":
                    handleWithdrawal(scanner, account);
                    break;

                case "3":
                    account.displayBalance();
                    break;

                case "4":
                    System.out.println("\nThank you for using ATM.Goodbye");
                    isRunning = false;
                    break;
                default:
                    System.out.println("Invalid option. Please choose 1-4");
            }
            if (isRunning) {
                System.out.println();//Add a spacing between the transactions
            }
        }
        scanner.close();
    }
    private static void displayMenu() {
        System.out.println("\n--- ATM Menu ---");
        System.out.println("1. Deposit");
        System.out.println("2. Withdraw");
        System.out.println("3. Check Balance");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
    }

    private static void handleDeposit(Scanner scanner, Account account) {
        System.out.print("Enter deposit amount:$");
        double amount = getValidAmount(scanner);
        account.deposit(amount);
    }

    private static void handleWithdrawal(Scanner scanner, Account account) {
        System.out.print("Enter withdrawal amount:$");
        double amount = getValidAmount(scanner);
        account.withdraw(amount);
    }

    private static double getValidAmount(Scanner scanner) {
        while (true) {
            try {
                String input = scanner.nextLine().trim();
                double amount = Double.parseDouble(input);
                return amount;
            } catch (NumberFormatException e) {
                System.out.print("invalid input. Please enter a valid number:$");
            }
        }
    }
}
