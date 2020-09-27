package org.controllers;

import org.apache.commons.lang3.RandomStringUtils;
import org.models.Account;
import org.models.Customer;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
//==OPTIMIZACIJA==:
//--1--Pataisyti: Info is lenteliu deti i List [List<Address>, List<Customer> ir taip toliau],
// kad dirbti su objektais.
//--2--Visus metodus su komentaru #Nepanaudota itraukti.
//--3--Itraukti korteles ir debit[true/false]
//--4--sukurti ir prideti exception klases
//--5-- daug kur kartojasi kodas: Select, update, insert into
public class Bank {
    Connection connection = new Connection();
    Statement statement = connection.getConnection().createStatement();
    PreparedStatement pStatement;

    List<Account> accounts;//nepanaudota
    List<Customer> customers;//nepanaudota

    public Bank() throws SQLException, ClassNotFoundException {
        this.accounts = new ArrayList<>();
        this.customers = new ArrayList<>();
    }
//Nepanaudota
    public void addAccount(Account account) {
        accounts.add(account);
    }
//Nepanaudota
    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    //VEIKIA
    public boolean login(String email, String password) throws SQLException {
        String selectPasEmail = "SELECT email, password FROM CONTACT";
        ResultSet rs = statement.executeQuery(selectPasEmail);
        while (rs.next()) {
            String emailRS = rs.getString("EMAIL");
            String passwordRS = rs.getString("PASSWORD");
            if (email.equals(emailRS) && password.equals(passwordRS)) {
                System.out.println("Welcome");
                return true;
            }
        }
        return false;
    }

    //VEIKIA
    public void registerCustomer() throws SQLException, ClassNotFoundException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ID:");
        int userID = sc.nextInt();
        System.out.println("Enter name:");
        String name = sc.next();
        System.out.println("Enter lastname:");
        String lastname = sc.next();
        System.out.println("Enter gender");
        String gender = sc.next();
        System.out.println("Enter nationality");
        String nationality = sc.next();
        System.out.println("Enter birthday");
        String birthdate = sc.next();
        String selectCustomer = "INSERT INTO CUSTOMER(CUSTOMER_ID, CUST_NAME, CUST_LASTNAME, BIRTHDATE, GENDER, NATIONALITY) " +
                "VALUES(" + userID + ",'" + name + "','" + lastname + "','" + birthdate + "','" + gender + "','" + nationality + "'" + ")";
        statement.executeUpdate(selectCustomer);

        System.out.println("Enter street");
        String street = sc.next();
        System.out.println("Enter house number");
        String hounr = sc.next();
        System.out.println("Enter zip code:");
        String zipCode = sc.next();
        System.out.println("Enter City");
        String city = sc.next();
        System.out.println("Enter registered addrees or no [true/false]");
        boolean registered = sc.nextBoolean();
        String selectAddress = "INSERT INTO ADDRESS(street, house_number, zip_code, city, registered) VALUES ('" +
                street + "','" + hounr + "','" + zipCode + "','" + city + "'," + registered + ")";
        pStatement = connection.getConnection().prepareStatement(selectAddress, Statement.RETURN_GENERATED_KEYS);
        pStatement.execute();
        //Get automaticly generated key
        int risultato = 0;
        ResultSet rs = pStatement.getGeneratedKeys();
        if (rs.next()) {
            risultato = rs.getInt(1);
        }
        pStatement = connection.getConnection().prepareStatement(selectAddress);
        String selectAddressCustomer = "INSERT INTO ADDRESS_CUSTOMER(CUSTOMER_ID, ADDRESS_ID) VALUES (" +
                userID + "," + risultato + ")";
        pStatement = connection.getConnection().prepareStatement(selectAddressCustomer);
        pStatement.execute();

        System.out.println("Enter email");
        String email = sc.next();
        System.out.println("Enter phone number");
        String phone = sc.next();
        System.out.println("Enter password");
        String password = sc.next();
        String selectContact = "INSERT INTO CONTACT(email, phone_number, password, customer_id) VALUES ('" +
                email + "','" + phone + "','" + password + "'," + userID + ")";
        pStatement = connection.getConnection().prepareStatement(selectContact);
        pStatement.execute();

        String accounNr = "LT" + RandomStringUtils.randomNumeric(18);
        String currency = "€";
        double balance = 0;
        String otherDetails = null;
        String pinNr = randomGenerator();
        String selectAccount = "INSERT INTO ACCOUNT(ACCOUNT_ID, CURRENCY, BALANCE, OTHER_DETAIL, CUSTOMER_ID, PIN) " +
                "VALUES('" + accounNr + "','" + currency + "'," + balance + "," + otherDetails + "," + userID + ",'" +
                pinNr + "'" + ")";
        statement.executeUpdate(selectAccount);
        System.out.println("INFO: Information Successfully recorded");
    }

    public void createCard() {

    }

    //VEIKIA
    private String getCustomerID(String email) throws SQLException {
        String customerID = null;
        String customerAccount = "SELECT CUSTOMER_ID from CONTACT where EMAIL=" + "'" + email + "'";
        ResultSet rs = statement.executeQuery(customerAccount);
        while (rs.next()) {
            customerID = rs.getString("CUSTOMER_ID");
        }
        return customerID;
    }

    //VEIKIA
    public void getAccount(String email) throws SQLException {
        //1
        String customerAccount = "SELECT * from ACCOUNT where CUSTOMER_ID=" + "'" + getCustomerID(email) + "'";
        ResultSet rs = statement.executeQuery(customerAccount);
        while (rs.next()) {
            String accounID = rs.getString("ACCOUNT_ID");
            String currency = rs.getString("CURRENCY");
            String balance = rs.getString("BALANCE");
            String otherDetails = rs.getString("OTHER_DETAIL");
            String customerID = rs.getString("CUSTOMER_ID");
            String pin = rs.getString("PIN");
            System.out.println("Account id: " + accounID +
                    ", Currency: " + currency +
                    ", Balance: " + balance +
                    ", Other Details: " + otherDetails +
                    ", Customer ID: " + customerID +
                    ", pin number: " + pin);
        }
    }

    //VEIKIA
    public void getCustomer(String email) throws SQLException {
        //2
        String customerinfo = "SELECT * from CUSTOMER where CUSTOMER_ID=" + "'" + getCustomerID(email) + "'";
        ResultSet rs = statement.executeQuery(customerinfo);
        while (rs.next()) {
            String customerId = rs.getString("CUSTOMER_ID");
            String name = rs.getString("CUST_NAME");
            String lastname = rs.getString("CUST_LASTNAME");
            String birthdate = rs.getString("BIRTHDATE");
            String gender = rs.getString("GENDER");
            String nationality = rs.getString("NATIONALITY");
            System.out.println("Customer id: " + customerId +
                    ", Name: " + name +
                    ", Lastname: " + lastname +
                    ", Birthdate: " + birthdate +
                    ", gender: " + gender +
                    ", nationality: " + nationality);
        }
        rs.close();
    }
    //Ideti jei reikes
    public void getAddress() {
        //3
    }
    //Ideti jei reikes
    public void getContact() {
        //4
    }
//VEIKIA
    public void deposit(String email, double amount) throws SQLException, ClassNotFoundException {
        double balance = 0;
        String accountID = null;
        String customerBalance = "SELECT BALANCE,ACCOUNT_ID from ACCOUNT where CUSTOMER_ID=" + "'" + getCustomerID(email) + "'";
        ResultSet rs = statement.executeQuery(customerBalance);
        while (rs.next()) {
            balance = Double.parseDouble(rs.getString("BALANCE"));
            accountID = rs.getString("ACCOUNT_ID");
        }
        String newBalance = "UPDATE ACCOUNT SET BALANCE="+(balance+amount)+" WHERE CUSTOMER_ID="+getCustomerID(email);
        statement.executeUpdate(newBalance);
        //Transactions
        String transHistory = "INSERT INTO TRANSACTIONS(AMOUNT_TRANSACTION, DATE_TRANSACTION, ACCOUNT_ID, " +
                "RECIPIENT_ID, OTHER_DETAIL) VALUES ("+amount+",'"+getDatenow()+"', '"+accountID+"',"+0+",'"+"deposit"+"')";
        pStatement=connection.getConnection().prepareStatement(transHistory);
        pStatement.execute();

        System.out.println("Money added to acount");
        rs.close();
    }
    //Papildyti
    public void withdraw(String email, double amount) throws SQLException, ClassNotFoundException {
        double balance = 0;
        String accountID = null;
        String customerBalance = "SELECT BALANCE,ACCOUNT_ID from ACCOUNT where CUSTOMER_ID=" + "'" + getCustomerID(email) + "'";
        ResultSet rs = statement.executeQuery(customerBalance);
        while (rs.next()) {
            balance = Double.parseDouble(rs.getString("BALANCE"));
            accountID = rs.getString("ACCOUNT_ID");
        }
        if (balance>=amount) {
            String newBalance = "UPDATE ACCOUNT SET BALANCE=" + (balance - amount) + " WHERE CUSTOMER_ID=" + getCustomerID(email);
            statement.executeUpdate(newBalance);
            //Transactions
            String transHistory = "INSERT INTO TRANSACTIONS(AMOUNT_TRANSACTION, DATE_TRANSACTION, ACCOUNT_ID, " +
                    "RECIPIENT_ID, OTHER_DETAIL) VALUES ("+amount+",'"+getDatenow()+"', '"+accountID+"',"+0+",'"+"withdraw"+"')";
            pStatement=connection.getConnection().prepareStatement(transHistory);
            pStatement.execute();
            System.out.println("Money to charge from the acount");
        }else {
            System.out.println("Not enough money in the account");
        }
        rs.close();
    }

    //Papildyti
    public void sendMoney(String recipientAccount, double amount) throws SQLException, ClassNotFoundException {
        double balance = 0;
        String accountID = null;
        String recipientBalance = "SELECT BALANCE,ACCOUNT_ID from ACCOUNT where ACCOUNT_ID=" + "'" + recipientAccount + "'";
        ResultSet rs = statement.executeQuery(recipientBalance);
        while (rs.next()) {
            balance = Double.parseDouble(rs.getString("BALANCE"));
            accountID = rs.getString("ACCOUNT_ID");
        }
        if (balance>=amount) {
            String recipient = "UPDATE ACCOUNT SET BALANCE=" + (balance + amount) + " WHERE ACCOUNT_ID=" + "'" + recipientAccount + "'";
            statement.executeUpdate(recipient);
            //Transactions
            String transHistory = "INSERT INTO TRANSACTIONS(AMOUNT_TRANSACTION, DATE_TRANSACTION, ACCOUNT_ID, " +
                    "RECIPIENT_ID, OTHER_DETAIL) VALUES ("+amount+",'"+getDatenow()+"', '"+accountID+"',"+0+",'"+"send money"+"')";
            pStatement=connection.getConnection().prepareStatement(transHistory);
            pStatement.execute();
            System.out.println("Money send to acount");
        }else {
            System.out.println("Not enough money in the account");
        }
        rs.close();
    }
    public void getTransactionsHistory(String email) throws SQLException {
        String accounID = null;
        String customerBalance = "SELECT ACCOUNT_ID from ACCOUNT where CUSTOMER_ID=" + "'" + getCustomerID(email) + "'";
        ResultSet rs = statement.executeQuery(customerBalance);
        while (rs.next()) {
            accounID = rs.getString("ACCOUNT_ID");
        }
        String transactionHistory = "SELECT AMOUNT_TRANSACTION, DATE_TRANSACTION," +
                "RECIPIENT_ID from TRANSACTIONS where ACCOUNT_ID=" + "'" + accounID +"'";
        ResultSet rs1 = statement.executeQuery(transactionHistory);
        while (rs1.next()) {
            /*String transactionID = rs1.getString("TRANSACTION_ID");*/
            String amount = rs1.getString("AMOUNT_TRANSACTION");
            String transDate = rs1.getString("DATE_TRANSACTION");
            String recipientID = rs1.getString("RECIPIENT_ID");
            System.out.println(/*"Transaction id: "+transactionID+*/
                    ", amount: "+amount+
                    ", Transaction date: "+transDate+
                    ", Recipient ID" +recipientID);
        }
        rs.close();
        rs1.close();
    }
    public void writeFile(String email) throws SQLException {
        ArrayList<String> list = new ArrayList<>();
        String accounID = null;
        String customerBalance = "SELECT ACCOUNT_ID from ACCOUNT where CUSTOMER_ID=" + "'" + getCustomerID(email) + "'";
        ResultSet rs = statement.executeQuery(customerBalance);
        while (rs.next()) {
            accounID = rs.getString("ACCOUNT_ID");
        }
        String transactionHistory = "SELECT AMOUNT_TRANSACTION, DATE_TRANSACTION," +
                "RECIPIENT_ID from TRANSACTIONS where ACCOUNT_ID=" + "'" + accounID +"'";
        ResultSet rs1 = statement.executeQuery(transactionHistory);
        while (rs1.next()) {
            /*String transactionID = "ID: "+rs1.getString("TRANSACTION_ID");*/
            String amount = "Amount: "+rs1.getString("AMOUNT_TRANSACTION");
            String transDate = "Transaction date:"+rs1.getString("DATE_TRANSACTION");
            String recipientID = "Recipient account id: "+rs1.getString("RECIPIENT_ID");
            /*list.add(transactionID);*/
            list.add(amount);
            list.add(transDate);
            list.add(recipientID);
        }
        fileWrite(list);
        rs.close();
        rs1.close();
    }
    //Nepanaudota
    public List<Account> getAccounts() {
        return accounts;
    }
    //Nepanaudota
    public List<Customer> getCustomers() {
        return customers;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "accounts=" + accounts +
                ", customers=" + customers +
                '}';
    }

    //VEIKIA
    private static String randomGenerator() {
        Random rn = new Random();
        String pin = "";
        int i = 0;
        for (i = 0; i < 4; i++) {
            pin += rn.nextInt(9) + 1;
        }
        return pin;
    }
    private static String getDatenow(){
        Date date = Calendar.getInstance().getTime();
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        return dateFormat.format(date);
    }
    private static void fileWrite(ArrayList<String> list) {
        try {
            File file = new File("C:\\Users\\Deividas\\IdeaProjects\\EgzaminoUzd1\\src\\main\\java\\orgtarnsactionsHistory.csv");
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file.getAbsoluteFile());
            BufferedWriter bw = new BufferedWriter(fw);

            for (String trans:list) {
                bw.write(trans);
                bw.newLine();
            }
            System.out.println("Done");
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
