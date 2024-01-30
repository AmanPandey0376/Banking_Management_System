package com.codealpha.bm.code;

import java.util.Scanner;

public class Banking_Management_System {
    private static double balance = 0;
    private static final int PIN = 1234; // Predefined PIN for simplicity
    
   public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {


        System.out.print("Enter your PIN: ");
        int enteredPin = input.nextInt();

        if (validatePin(enteredPin)) {
            System.out.println("PIN verification successful. Welcome!");

            while (true) {
                System.out.println("1. Deposit\n2. Withdraw\n3. Check Balance\n4. Exit");
                System.out.print("Enter your choice: ");

                int userinput = input.nextInt();

                switch (userinput) {
                    case 1:
                        deposit();
                        break;
                    case 2:
                        withdraw();
                        break;
                    case 3:
                        checkBalance();
                        break;
                    case 4:
                        System.out.println("Exiting the program. Thank you For Using Our Banking System!");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            }
        } else {
            System.out.println("Incorrect PIN. Exiting the program.");
        }
    }

    private static boolean validatePin(int enteredPin) {
        return enteredPin == PIN;
    }

    private static void deposit() {
      
        System.out.print("Enter the Amount to deposit: ");
        double amount = input.nextDouble();
        if (amount > 0) {
        	balance = balance + amount;
            System.out.println("Deposit successful. Updated balance: " + balance);
        } else {
            System.out.println("Invalid amount. Please enter a positive value.");
        }
    }

    private static void withdraw() {
     
        System.out.print("Enter the Amount to withdraw: ");
        double amount = input.nextDouble();
        if (amount > 0 && amount <= balance) {
        	balance = balance - amount;
            System.out.println("Withdrawal successful. Updated balance: " + balance);
        } else {
            System.out.println("Invalid amount or insufficient funds. Please try again.");
        }
    }

    private static void checkBalance() {
        System.out.println("Current balance: " + balance);
    }
}
