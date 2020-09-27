package org.models;

import org.apache.commons.lang3.RandomStringUtils;

import java.util.Random;

//Nepanaudota
public class Account {
    private String accountId;
    private String pin;
    private double amount;
    private String otherDetails;
    private int accountType; //saving and check
    private boolean jointAccount;

    public Account(String otherDetails, int accountType) {
        this.accountId ="LT" + RandomStringUtils.randomNumeric(18);
        this.pin =randomGenerator();
        this.amount = 0;
        this.otherDetails = otherDetails;
        this.accountType = accountType;
    }

    public String getAccountId() {
        return accountId;
    }

    public String getPin() {
        return pin;
    }

    public double getAmount() {
        return amount;
    }

    public String getOtherDetails() {
        return otherDetails;
    }

    public int getAccountType() {
        return accountType;
    }

    public boolean isJointAccount() {
        return jointAccount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setOtherDetails(String otherDetails) {
        this.otherDetails = otherDetails;
    }

    public void setAccountType(int accountType) {
        this.accountType = accountType;
    }


    public void setJointAccount(boolean jointAccount) {
        this.jointAccount = jointAccount;
    }

    public static String randomGenerator() {
        Random rn = new Random();
        String pin="";
        int i = 0;
        for (i = 0; i < 4; i++) {
            pin +=rn.nextInt(9) + 1;
        }
        return pin;
    }


    public boolean equals(Account accountCompare) {
        if (!accountCompare.getAccountId().equals(this.accountId)) return false;
        if (accountCompare.getPin() != this.getPin()) return false;
        return true;
    }

    @Override
    public String toString() {
        StringBuffer out = new StringBuffer();
        return "Account{" +
                "accountId='" + accountId + '\'' +
                ", pin=" + pin +
                ", amount=" + amount +
                ", otherDetails='" + otherDetails + '\'' +
                ", accountType=" + accountType +
                ", jointAccount=" + jointAccount +
                '}';
    }
}
