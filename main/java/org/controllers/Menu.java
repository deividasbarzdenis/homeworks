package org.controllers;

public class Menu {
    public void printGeneralMenu(){
        System.out.println("[1]--Login\n"+
                "[2]--Register\n"+
                "[3]--Exit");
    }
    public void printUserMenu(){
        System.out.println("[1]--Accounts and balance\n"+
                "[2]--Transaction history\n"+
                "[3]--Deposit a money\n"+
                "[4]--Withdraw a money\n"+
                "[5]--A money transfer\n"+
                "[6]--Write transactions history to file\n"+
                "[7]--Order a credit card\n"+
                "[8]--Exit");
    }
}
