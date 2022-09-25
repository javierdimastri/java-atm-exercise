package com.helloWorld;

import java.util.Scanner;

public class ATM {

    public void checkingAccount (int balance) {
        Scanner checkingAccountInput = new Scanner(System.in);
        System.out.println("Type 1 for View balance");
        System.out.println("Type 4 for Exit");
        boolean isStillChecking = true;
        while (isStillChecking){
            int checkingAccountChoice = checkingAccountInput.nextInt();
            switch (checkingAccountChoice){
                case 1:
                    System.out.println("Balance: "+balance);
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Command Not Found");
            }
            isStillChecking = false;
        }
    }
    public static void main(String[] args){
        System.out.println("Welcome to Automated Teller Machine, Please choose your action");
        int balance = 100;
        int withdraw = 0;
        int deposit = 0;
        boolean isStillActive = true;
        Scanner input = new Scanner(System.in);

        while (isStillActive){
            System.out.println("Type 1 for Checking Account");
            System.out.println("Type 2 for Saving Account");
            System.out.println("Type 3 for Exit");
            System.out.print("action type: ");
            int choice = input.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Checking Account");
                    ATM check = new ATM();
                    check.checkingAccount(balance);
                    break;
                case 2:
                    System.out.println("Saving: ");
                    break;
                case 3:
                    isStillActive = false;
                    break;
                default:
                    System.out.println("Command Not Found");
            }
        }
        System.out.println("Thanks");
    }
}
