package org.controllers;

import java.sql.SQLException;
import java.util.Scanner;

public class UserChoice {
    Menu menu = new Menu();
    Bank bank = new Bank();

    public UserChoice() throws SQLException, ClassNotFoundException {
    }

    public void choice() throws SQLException, ClassNotFoundException {
        Scanner sc = new Scanner(System.in);
        aa:
        while (true) {
            menu.printGeneralMenu();
            String  choice = sc.next();
            switch (choice) {
                case "1":
                    System.out.println("Enter email");
                    String email = sc.next();
                    System.out.println("Enter password");
                    String password = sc.next();
                    if (bank.login(email,password)) {
                        userPriviteChoice(email);
                    } else {
                        System.out.println("Wrong email or password");
                    }
                    break;
                case "2":
                    bank.registerCustomer();
                    break;
                case "3":
                    break aa;
                default:
                    System.out.println("Wrong input");
                    break;
            }
        }
        bank.connection.getConnection().close();
    }

    private void userPriviteChoice(String email) throws SQLException, ClassNotFoundException {
        Scanner sc1 = new Scanner(System.in);
        bb:
        while (true) {
            menu.printUserMenu();
            switch (sc1.next()) {
                case "1":
                    bank.getAccount(email);
                    //Accounts and balance
                    break;
                case "2":
                    //Transaction history
                    bank.getTransactionsHistory(email);
                    break;
                case "3":
                    System.out.println("Enter amount:");
                    double amount =sc1.nextDouble();
                    bank.deposit(email,amount);
                    //Deposit a money
                    break;
                case "4":
                    System.out.println("Enter amount:");
                    double amount1 =sc1.nextDouble();
                    bank.withdraw(email,amount1);
                    //Withdraw a money
                    break;
                case "5":
                    System.out.println("Enter recipeint account:");
                    String recipient = sc1.next();
                    System.out.println("Enter amount:");
                    double amount2 =sc1.nextDouble();
                    bank.sendMoney(sc1.next(),amount2);
                    //A money transfer
                    break;
                case "6":
                    bank.writeFile(email);
                    //Write transactions history to file
                    break;
                case "7":
                    //Order credit card
                    break;
                case "8":
                    break bb;
                default:
                    System.out.println("Wrong input");
                    break;
            }
        }
    }
}
