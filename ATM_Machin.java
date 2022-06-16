package com.company;

import java.util.Scanner;


public class ATM_Machin {

    public static void main(String[] args) {
        int balance = 1000000, withdraw, deposit ;
        try (Scanner sc = new Scanner(System.in)) {
            while(true) {
                System.out.println("Welcome To ATM Machine !!. ");
                System.out.println("Choose 1 for withdraw ");
                System.out.println("Choose 2 for Deposite ");
                System.out.println("Choose 3 for Check Balance ");
                System.out.println("Choose 4 for Exit ");
                System.out.println("Choose The Opration you want to perform from above ");

                int choice = sc.nextInt();

                switch (choice){
                    case 1 :
                        System.out.println("Enter money to be withdraw : ");
                        withdraw = sc.nextInt();
                        if(balance >= withdraw) {
                            balance = balance - withdraw;
                            System.out.println("Pleases collect your money");
                        }
                        else {
                                System.out.println("Insufficient Balance");
                            }    
                            System.out.println("");
                        break;

                    case 2 :
                        System.out.println("Enter money to be deposited : ");
                        deposit = sc.nextInt();
                        balance = balance + deposit;
                        System.out.println("Your money hab been successfully deposit");
                        System.out.println();
                        break;
                    case 3 :
                        System.out.println("Balance : " + balance);
                        System.out.println("");
                        break;
                    case 4 :
                        System.exit(0);
                }
            }
        }
    }
    
}