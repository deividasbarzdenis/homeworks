package org.models;

import java.sql.Date;
import java.util.Objects;
//Nepanaudota
public class Transaction {
    private int transactionId;
    private int costumerId;
    private int recipientId;
    private String accountSender;
    private String accountRecipient;
    private int transactionType; // 1 | 2 | 3
    private int transactionRelation;
    private double transactionAmount;
    private Date transactionTime;
    private boolean byCard;

    public Transaction() {
    }

    public Transaction(int transactionId) {
        this.transactionId = transactionId;
    }

    public Transaction(int transactionId, int costumerId, int recipientId, String accountSender
            , String accountRecipient, int transactionType, double transactionAmount, Date transactionTime
            , boolean byCard) {
        this.transactionId = transactionId;
        this.costumerId = costumerId;
        this.recipientId = recipientId;
        this.accountSender = accountSender;
        this.accountRecipient = accountRecipient;
        this.transactionType = transactionType;
        this.transactionAmount = transactionAmount;
        this.transactionTime = transactionTime;
        this.byCard = byCard;
    }

    public int getTransactionId() {
        return transactionId;
    }

    public int getCostumerId() {
        return costumerId;
    }

    public int getRecipientId() {
        return recipientId;
    }

    public String getAccountSender() {
        return accountSender;
    }

    public String getAccountRecipient() {
        return accountRecipient;
    }

    public int getTransactionType() {
        return transactionType;
    }

    public double getTransactionAmount() {
        return transactionAmount;
    }

    public Date getTransactionTime() {
        return transactionTime;
    }

    public void setTransactionId(int transactionId) {
        this.transactionId = transactionId;
    }

    public void setCostumerId(int costumerId) {
        this.costumerId = costumerId;
    }

    public void setRecipientId(int recipientId) {
        this.recipientId = recipientId;
    }

    public void setAccountSender(String accountSender) {
        this.accountSender = accountSender;
    }

    public void setAccountRecipient(String accountRecipient) {
        this.accountRecipient = accountRecipient;
    }

    public void setTransactionType(int transactionType) {
        this.transactionType = transactionType;
    }

    public void setTransactionAmount(double transactionAmount) {
        this.transactionAmount = transactionAmount;
    }

    public void setTransactionTime(Date transactionTime) {
        this.transactionTime = transactionTime;
    }

    public boolean isByCard() {
        return byCard;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transaction that = (Transaction) o;
        return transactionId == that.transactionId &&
                costumerId == that.costumerId &&
                recipientId == that.recipientId &&
                transactionType == that.transactionType &&
                Double.compare(that.transactionAmount, transactionAmount) == 0 &&
                accountSender.equals(that.accountSender) &&
                accountRecipient.equals(that.accountRecipient) &&
                Objects.equals(transactionTime, that.transactionTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(transactionId, costumerId, recipientId, accountSender
                ,accountRecipient, transactionType, transactionAmount, transactionTime);
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "transactionId=" + transactionId +
                ", costumerId=" + costumerId +
                ", recipientId=" + recipientId +
                ", accountSender='" + accountSender + '\'' +
                ", accountRecipient='" + accountRecipient + '\'' +
                ", transactionType=" + transactionType +
                ", transactionAmount=" + transactionAmount +
                ", transactionTime=" + transactionTime +
                ", byCard=" + byCard +
                '}';
    }
}
