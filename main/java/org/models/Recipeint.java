package org.models;
//Nepanaudota
public class Recipeint {
    private int recipientId;
    private String nameRecipient;
    private String lastnameRecipient;

    public Recipeint() {
    }

    public Recipeint(int recipientId) {
        this.recipientId = recipientId;
    }

    public Recipeint(int recipientId, String nameRecipient, String lastnameRecipient) {
        this.recipientId = recipientId;
        this.nameRecipient = nameRecipient;
        this.lastnameRecipient = lastnameRecipient;
    }

    public int getRecipientId() {
        return recipientId;
    }

    public String getNameRecipient() {
        return nameRecipient;
    }

    public String getLastnameRecipient() {
        return lastnameRecipient;
    }

    public void setNameRecipient(String nameRecipient) {
        this.nameRecipient = nameRecipient;
    }

    public void setLastnameRecipient(String lastnameRecipient) {
        this.lastnameRecipient = lastnameRecipient;
    }

    @Override
    public String toString() {
        return "Recipeint{" +
                "recipientId=" + recipientId +
                ", nameRecipient='" + nameRecipient + '\'' +
                ", lastnameRecipient='" + lastnameRecipient + '\'' +
                '}';
    }
}
