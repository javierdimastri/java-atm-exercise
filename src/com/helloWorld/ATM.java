package com.helloWorld;

import java.util.Scanner;

public class ATM {
    public static void main(String[] args){
        System.out.println("Hello world");
        int balance = 100;
        int withdraw = 0;
        int deposit = 0;
        boolean isStillActive = true;
        Scanner input = new Scanner(System.in);

        while (isStillActive){
            System.out.println("Welcome to Automated Teller Machine");
            System.out.println("Type 1 for Checking Account");
            System.out.println("Type 3 for Exit");
            int choice = input.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Balance: "+balance);
                    break;
                case 3:
                    isStillActive = false;
            }
        }
        System.out.println("Thanks");
    }
}
