package CollectionFramework.List.ArrayList;

import java.util.Scanner;

public class ATM {
    public static class ATMInterface {
        private static int accountNumber = 123456789; // Example account number
        private static int pin = 1234; // Example PIN
        private static double balance = 1000; // Example initial balance
        private static String mobileNumber = "9999999999"; // Example mobile number

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int option;

            do {
                System.out.println("ATM Interface");
                System.out.println("1. Withdraw Money");
                System.out.println("2. Check Account Balance");
                System.out.println("3. Deposit Money");
                System.out.println("4. Mini Statement");
                System.out.println("5. Change PIN");
                System.out.println("6. Change Mobile Number");
                System.out.println("7. Exit");
                System.out.print("Enter your option: ");
                option = scanner.nextInt();

                switch (option) {
                    case 1:
                        withdrawMoney();
                        break;
                    case 2:
                        checkAccountBalance();
                        break;
                    case 3:
                        depositMoney();
                        break;
                    case 4:
                        miniStatement();
                        break;
                    case 5:
                        changePIN();
                        break;
                    case 6:
                        changeMobileNumber();
                        break;
                    case 7:
                        System.out.println("Thank you for using the ATM.");
                        break;
                    default:
                        System.out.println("Invalid option. Please try again.");
                        break;
                }

                System.out.println();
            } while (option != 7);
        }

        private static void withdrawMoney() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter amount to withdraw: ");
            double amount = scanner.nextDouble();

            if (amount <= balance) {
                balance -= amount;
                System.out.println("Please collect your cash.");
                System.out.println("Remaining balance: " + balance);
            } else {
                System.out.println("Insufficient balance.");
            }
        }

        private static void checkAccountBalance() {
            System.out.println("Account balance: " + balance);
        }

        private static void depositMoney() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter amount to deposit: ");
            double amount = scanner.nextDouble();
            balance += amount;
            System.out.println("Deposit successful.");
            System.out.println("Updated balance: " + balance);
        }

        private static void miniStatement() {
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Current balance: " + balance);
            System.out.println("Last 5 transactions:");
            // Implement logic to display last 5 transactions
        }

        private static void changePIN() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter current PIN: ");
            int currentPIN = scanner.nextInt();
            if (currentPIN == pin) {
                System.out.print("Enter new PIN: ");
                int newPIN = scanner.nextInt();
                pin = newPIN;
                System.out.println("PIN changed successfully.");
            } else {
                System.out.println("Invalid PIN.");
            }
        }

        private static void changeMobileNumber() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter current mobile number: ");
            String currentMobileNumber = scanner.next();
            if (currentMobileNumber.equals(mobileNumber)) {
                System.out.print("Enter new mobile number: ");
            }
        }
    }
}
