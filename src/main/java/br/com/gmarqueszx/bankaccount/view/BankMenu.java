package br.com.gmarqueszx.bankaccount.view;

import br.com.gmarqueszx.bankaccount.domain.Account;
import br.com.gmarqueszx.bankaccount.domain.CheckingAccount;
import br.com.gmarqueszx.bankaccount.domain.Customer;
import br.com.gmarqueszx.bankaccount.domain.SavingsAccount;

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.Scanner;

public class BankMenu {

    private final Scanner scanner = new Scanner(System.in);

    public void start() {
        while (true) {
            System.out.println("\n--- MarquesBank ---");
            System.out.println("1. Create New Account");
            System.out.println("2. Exit Program");
            System.out.print("Choose an option: ");

            int choice = readIntInput();

            if (choice == 1) {
                Customer customer = createCustomer();
                Account account = chooseAccountType(customer);
                if (account != null) {
                    System.out.println("\nAccount created successfully!");
                    accountOperationsMenu(account);
                }
            } else if (choice == 2) {
                System.out.println("Thank you for using our bank. Goodbye! ");
                break;
            } else {
                System.out.println("Invalid option. Please try again.");
            }
        }
    }

    private Customer createCustomer() {
        System.out.println("\n--- Customer Registration ---");
        System.out.print("First name: ");
        String firstName = scanner.next();
        System.out.print("Last name: ");
        String lastName = scanner.next();
        System.out.print("CPF (Brazilian Tax ID): ");
        String cpf = scanner.next();
        System.out.print("Email: ");
        String email = scanner.next();
        System.out.print("Phone number: ");
        String phoneNumber = scanner.next();
        return new Customer(firstName, lastName, email, phoneNumber, cpf);
    }

    private Account chooseAccountType(Customer customer) {
        System.out.println("\n--- Account Type ---");
        System.out.println("1. Checking Account");
        System.out.println("2. Savings Account");
        System.out.print("Choose an option: ");
        int choice = readIntInput();

        System.out.print("Enter the branch number: ");
        String agency = scanner.next();
        System.out.print("Enter the account number: ");
        String accountNumber = scanner.next();

        if (choice == 1) {
            System.out.print("Enter the overdraft limit: ");
            double overdraft = readDoubleInput();
            return new CheckingAccount(customer, accountNumber, agency, overdraft);
        } else if (choice == 2) {
            return new SavingsAccount(customer, accountNumber, agency);
        } else {
            System.out.println("Invalid account type.");
            return null;
        }
    }

    private void accountOperationsMenu(Account account) {
        while (true) {
            System.out.println("\n--- Account Operations: " + account.getAccountNumber() + " ---");
            System.out.println("Hello, " + account.getCustomer().getFirstName() + "!");
            System.out.println("Current Balance: $ " + String.format("%.2f", account.getBalance()));
            System.out.println("-------------------------");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Back to Main Menu");
            System.out.print("Choose an operation: ");

            int choice = readIntInput();

            switch (choice) {
                case 1:
                    System.out.print("Enter the deposit amount: ");
                    double depositAmount = readDoubleInput();
                    account.deposit(depositAmount);
                    System.out.println("Deposit successful!");
                    break;
                case 2:
                    System.out.print("Enter the withdrawal amount: ");
                    double withdrawAmount = readDoubleInput();
                    try {
                        account.withdraw(withdrawAmount);
                        System.out.println("Withdrawal successful!");
                    } catch (RuntimeException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;
                case 3:
                    System.out.println("Returning to main menu...");
                    return;
                default:
                    System.out.println("Invalid option.");
            }
        }
    }

    private int readIntInput() {
        while (true) {
            try {
                int value = scanner.nextInt();
                scanner.nextLine();
                return value;
            } catch (InputMismatchException e) {
                System.out.println("Error: Invalid input. Please enter a whole number.");
                scanner.nextLine();
                System.out.print("Try again: ");
            }
        }
    }

    private double readDoubleInput() {
        while (true) {
            try {
                double value = scanner.nextDouble();
                scanner.nextLine();
                return value;
            } catch (InputMismatchException e) {
                System.out.println("Error: Invalid input. Please enter a number.");
                scanner.nextLine();
                System.out.print("Try again: ");
            }
        }
    }
}