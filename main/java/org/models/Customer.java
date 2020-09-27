package org.models;

//Nepanaudota
public class Customer {

    private int customerId;
    private String Username;
    private String lastname;
    private String birthdate;
    private String gender;//optional
    private String nationality;//optional

    public Customer(int customerId, String username, String lastname, String birthdate, String gender, String nationality) {
        this.customerId = customerId;
        Username = username;
        this.lastname = lastname;
        this.birthdate = birthdate;
        this.gender = gender;
        this.nationality = nationality;
    }

    public int getCustomerId() {
        return customerId;
    }

    public String getUsername() {
        return Username;
    }

    public String getLastname() {
        return lastname;
    }

    public String getGender() {
        return gender;
    }

    public String getNationality() {
        return nationality;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }


    @Override
    public String toString() {
        return "Customer{" +
                "customerId=" + customerId +
                ", Username='" + Username + '\'' +
                ", lastname='" + lastname + '\'' +
                ", gender='" + gender + '\'' +
                ", nationality='" + nationality + '\'' +
                ", birthdate=" + birthdate +
                '}';
    }
    public String toDB() {
        return customerId +
                ",'" + Username +
                "','" + lastname +
                "','" + gender +
                "','" + nationality +
                "','" + birthdate + ")";
    }
}
