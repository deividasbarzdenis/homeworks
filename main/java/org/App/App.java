package org.App;

import org.controllers.UserChoice;

import java.sql.SQLException;
import java.text.ParseException;

public class App {
    public static void main( String[] args ) throws ParseException, SQLException, ClassNotFoundException {
        UserChoice userChoice = new UserChoice();
        userChoice.choice();
    }
}
