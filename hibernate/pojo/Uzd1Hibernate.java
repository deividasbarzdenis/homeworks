package hibernate.pojo;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.io.File;
import java.util.List;

public class Uzd1Hibernate {
    private static SessionFactory factory;
    public static void main(String[] args) {

        try {
            factory = new Configuration().configure(new File("src/main/resources/hibernate.cfg.xml")).buildSessionFactory();
        } catch (Throwable ex) {
            System.err.println("Failed to create sessionFactory object." + ex);
            throw new ExceptionInInitializerError(ex);
        }

        Uzd1Hibernate ME = new Uzd1Hibernate();

        /* Add few employee records in database */
  /*      Integer empID1 = ME.addEmployee("Zara", "Ali", 1000);
        Integer empID2 = ME.addEmployee("Daisy", "Das", 5000);
        Integer empID3 = ME.addEmployee("John", "Paul", 10000);*/

        /* List down all the employees */
        ME.listEmployees();

      /*  *//* Update employee's records *//*
        ME.updateEmployee(empID1, 5000);

        *//* Delete an employee from the database *//*
        ME.deleteEmployee(empID2);

        *//* List down new list of the employees *//*
        ME.listEmployees();*/
    }

    /* Method to CREATE an employee in the database */
   /* public Integer addEmployee(String fname, String lname, int salary){
        Session session = factory.openSession();
        Transaction tx = null;
        Integer employeeID = null;

        try {
            tx = session.beginTransaction();
            Employee employee = new Employee(fname, lname, salary);
            employeeID = (Integer) session.save(employee);
            tx.commit();
        } catch (HibernateException e) {
            if (tx!=null) tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
        return employeeID;
    }*/

    /* Method to  READ all the employees */
    public void listEmployees( ){
        Transaction tx=null;
        try (Session session = factory.openSession()) {
            tx = session.beginTransaction();
            List employees = session.createQuery("FROM hibernate.pojo.Employee").list();
            for (Object o : employees) {
                Employee employee = (Employee) o;
                System.out.print("First Name: " + employee.getName());
                System.out.print("  Last Name: " + employee.getLastname());
                System.out.println("  Salary: " + employee.getSalary());
            }
            tx.commit();
        } catch (HibernateException e) {
            if (tx != null) tx.rollback();
            e.printStackTrace();
        }
    }

   /* *//* Method to UPDATE salary for an employee *//*
    public void updateEmployee(Integer EmployeeID, int salary ){
        Session session = factory.openSession();
        Transaction tx = null;

        try {
            tx = session.beginTransaction();
            Employee employee = (Employee)session.get(Employee.class, EmployeeID);
            employee.setSalary( salary );
            session.update(employee);
            tx.commit();
        } catch (HibernateException e) {
            if (tx!=null) tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
    }

    *//* Method to DELETE an employee from the records *//*
    public void deleteEmployee(Integer EmployeeID){
        Session session = factory.openSession();
        Transaction tx = null;

        try {
            tx = session.beginTransaction();
            Employee employee = (Employee)session.get(Employee.class, EmployeeID);
            session.delete(employee);
            tx.commit();
        } catch (HibernateException e) {
            if (tx!=null) tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
    }*/
}
