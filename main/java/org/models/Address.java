package org.models;

//Nepanaudota
public class Address {
    private int addressId;
    private String street;
    private String houseNr;
    private String zipCode;
    private String City;
    private boolean registered;

    public Address(String street, String houseNr, String zipCode, String city, boolean registered) {
        this.street = street;
        this.houseNr = houseNr;
        this.zipCode = zipCode;
        City = city;
        this.registered = registered;
    }

    public Address(int addressId) {
        this.addressId = addressId;
    }

    public int getAddressId() {
        return addressId;
    }

    public String getStreet() {
        return street;
    }

    public String getHouseNr() {
        return houseNr;
    }

    public String getZipCode() {
        return zipCode;
    }

    public String getCity() {
        return City;
    }

    public boolean isRegistered() {
        return registered;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setHouseNr(String houseNr) {
        this.houseNr = houseNr;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public void setCity(String city) {
        City = city;
    }

    public void setRegistered(boolean registered) {
        this.registered = registered;
    }

    @Override
    public String toString() {
        return "Address{" +
                "addressId=" + addressId +
                ", street='" + street + '\'' +
                ", houseNr='" + houseNr + '\'' +
                ", zipCode='" + zipCode + '\'' +
                ", City='" + City + '\'' +
                ", registered=" + registered +
                '}';
    }
}
