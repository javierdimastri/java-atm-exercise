package com.helloWorld;

import java.util.Scanner;

public class ATM {
    int balance;
    int withdraw;
    int deposit;
    public int getBalance(){
        return this.balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getDeposit(){
        return this.deposit;
    }

    public void setDeposit(int deposit) {
        this.deposit = deposit;
    }

    public void deposit(ATM atm) {
        Scanner depositInput = new Scanner(System.in);
        System.out.println("Account Balance: " +atm.getBalance());
        System.out.print("Deposit Amount : ");
        int input = depositInput.nextInt();
        int newDeposit = atm.getBalance() + input;
        atm.setDeposit(input);

        atm.setBalance(newDeposit);
        //still not able to deposit
        //add another class to store the properties later
    }

    public void checkingAccount (ATM atm) {
        Scanner checkingAccountInput = new Scanner(System.in);
        System.out.println("Type 1 for View balance");
        System.out.println("Type 2 for Withdraw Funds");
        System.out.println("Type 3 for Deposit Funds");
        System.out.println("Type 4 for Exit");
        boolean isStillChecking = true;
        while (isStillChecking){
            System.out.print("action type: ");
            int checkingAccountChoice = checkingAccountInput.nextInt();
            switch (checkingAccountChoice){
                case 1:
                    System.out.println("Balance: "+atm.getBalance());
                    break;
                case 2:
                    System.out.println("something");
                    break;
                case 3:
                    atm.deposit(atm);
                    System.out.println("Your Balance: " +atm.getBalance());
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
                    ATM atm = new ATM();
                    atm.checkingAccount(atm);
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
