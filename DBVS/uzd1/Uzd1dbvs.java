package DBVS.uzd1;

import java.io.Reader;
import java.sql.*;
import java.util.Scanner;

public class Uzd1dbvs {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        final String JDBC_DRIVER = "org.h2.Driver";
        final String DB_URL = "jdbc:h2:~/new5/db";

        final String USER = "";
        final String PASS = "";

        Class.forName(JDBC_DRIVER);

        System.out.println("Connecting to database...");
        Connection con = DriverManager.getConnection(DB_URL, USER, PASS);
        if (con != null) {
            System.out.println("Successfully connected to MySQL database test");
        }

        System.out.println("adding test data...\n");
        Statement stmt = con.createStatement();

       /* printUsersInProject(stmt);
        insertUserInTable(stmt);*/
        assignUserToProject(stmt);
        con.close();
    }
    private static void printUsersInProject(Statement stmt) throws SQLException {

        for (int i=1;i<=3;i++){
            String selectProjektas = "SELECT PAVADINIMAS FROM PROJEKTAS WHERE ID = "+Integer.toString(i);
            String select = "select VARDAS, PAVARDE\n" +
                    "from DARBUOTOJAS join PROJEKTAS on DARBUOTOJAS.PROJEKTAS_ID = PROJEKTAS.ID " +
                    "WHERE ID="+Integer.toString(i);

            ResultSet rs = stmt.executeQuery(selectProjektas);
            while (rs.next()) {
                String project = rs.getString("PAVADINIMAS");
                System.out.println("="+project.toUpperCase()+"=");
            }

            ResultSet rs1 = stmt.executeQuery(select);
            while (rs1.next()) {
                int j = rs1.getRow();
                String name = rs1.getString("VARDAS");
                String lastname = rs1.getString("PAVARDE");
                System.out.println(j+"."+name + ", " + lastname);
            }
        }
    }
    private static void insertUserInTable(Statement stmt) throws SQLException {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter new User\n"+"+++++++++++++++++++++++++");
        System.out.println("Enter user id");
        int personId = sc.nextInt();
        System.out.println("Enter user name");
        String name = sc.next();
        System.out.println("Enter user lastname");
        String lastname = sc.next();
        System.out.println("Enter user working since");
        String workingSince = sc.next();
        System.out.println("Enter user Birthday");
        String birthday = sc.next();
        System.out.println("Enter user position in project");
        String position = sc.next();
        System.out.println("Enter departament name ");
        String department = sc.next();
        System.out.println("Enter project ID");
        int projectID = sc.nextInt();

        String select ="INSERT INTO DARBUOTOJAS(ASMENSKODAS, VARDAS, PAVARDE, DIRBANUO, GIMIMOMETAI, " +
                "PAREIGOS, SKYRIUS_PAVADINIMAS, PROJEKTAS_ID)\n" +
                "VALUES ("+personId+", '"+name+"', '"+lastname+"','"+workingSince+"','"+birthday+"','"+
                position+"','"+department+"',"+projectID+")";
        stmt.executeUpdate(select);
    }
    private static void assignUserToProject(Statement stmt) throws SQLException{
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Method assignUserToProject".toUpperCase());
        String users = "SELECT ASMENSKODAS, VARDAS, PAVARDE, PROJEKTAS_ID, PAVADINIMAS \n" +
                "FROM DARBUOTOJAS JOIN PROJEKTAS P ON P.ID = DARBUOTOJAS.PROJEKTAS_ID";

        ResultSet rsUsers = stmt.executeQuery(users);
        while (rsUsers.next()) {
            int j = rsUsers.getRow();
            String  userID = rsUsers.getString("ASMENSKODAS");
            String name1 = rsUsers.getString("VARDAS");
            String lastname1 = rsUsers.getString("PAVARDE");
            int projectId = rsUsers.getInt("PROJEKTAS_ID");
            String projectName = rsUsers.getString("PAVADINIMAS");
            System.out.println(j+"."+userID+", "+name1 + ", " + lastname1+", " + projectId+
                    ", " + projectName);
        }
        System.out.println("Enter user name:");
        String name = sc1.next();
        System.out.println("Enter user id number: ");
        int userId = sc1.nextInt();

        System.out.println("Enter new project ID");
        int newId = sc1.nextByte();
        String newProject = "UPDATE DARBUOTOJAS SET PROJEKTAS_ID="+newId+" WHERE ASMENSKODAS="+userId;
        stmt.executeUpdate(newProject);
        rsUsers.close();
    }
}
 /*Kad kodas butu grazesnis reikia susikurti klases: Project, Employee, Department,
        Controller[metodai informacijos valdymui].
        Pabandyti iterpyti Genric ir stream()*/