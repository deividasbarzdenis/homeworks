package org.models;

import me.xdrop.jrand.JRand;
import me.xdrop.jrand.model.money.CardType;

//Nepanaudota
public class CardCustomer {
    private String cardNumber;
    private String expDate;
    private double limit;
    private String type;
    private boolean isDebit;

    public CardCustomer() {
        this.cardNumber = JRand.cardNo().format(true).gen();
        this.expDate = JRand.expiryDate().gen();
        this.type = String.valueOf(JRand.cardType().only(CardType.MAESTRO, CardType.VISA, CardType.MASTERCARD));
    }

    public CardCustomer(double limit, boolean isDebit) {
        this.limit = limit;
        this.isDebit = isDebit;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public String getExpDate() {
        return expDate;
    }

    public double getLimit() {
        return limit;
    }

    public String getType() {
        return type;
    }

    public void setLimit(double limit) {
        this.limit = limit;
    }

    public boolean isDebit() {
        return isDebit;
    }

    @Override
    public String toString() {
        return "CardCustomer{" +
                "cardNumber='" + cardNumber + '\'' +
                ", expDate='" + expDate + '\'' +
                ", limit=" + limit +
                ", type='" + type + '\'' +
                ", isDebit=" + isDebit +
                '}';
    }
}
