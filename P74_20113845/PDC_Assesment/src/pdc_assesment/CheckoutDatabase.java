/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pdc_assesment;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author eh155
 */
public class CheckoutDatabase {

    DBManager dbManager;
    Connection conn;
    Statement statement;

    //details of a debit card
    private String cardName;
    private double cardNumber;
    private double cardPin;
    
    public CheckoutDatabase(String cardName, double cardNumber, double cardPin)
    {
        this.cardName = cardName;
        this.cardNumber = cardNumber;
        this.cardPin = cardPin;
        
    }
    
     public CheckoutDatabase() {
        dbManager = new DBManager();
        conn = dbManager.getConnection();
        try {
            statement = conn.createStatement();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    //create table with checkoutdetails for payment
    public void createCheckoutTable() {
        try {
            this.checkExistedTable("Checkout Details");
            String tableName = "CheckoutTable";
            String createTable = "CREATE TABLE " + tableName + "(cardName VARCHAR(50)," + "cardNumber VARCHAR(20)," + "cardPin VARCHAR(4))";
            this.statement = conn.createStatement();
            this.statement.addBatch(createTable);
            this.statement.executeBatch();
        }
            catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
     }
    
    public void checkExistedTable(String name) {
        try {
            DatabaseMetaData dbmd = this.conn.getMetaData();
            String[] types = {"TABLE"};
            statement = this.conn.createStatement();
            ResultSet rs = dbmd.getTables(null, null, null, types);

            while (rs.next()) {
                String table_name = rs.getString("TABLE_NAME");
                System.out.println(table_name);
                if (table_name.equalsIgnoreCase(name)) {
                    statement.executeUpdate("Drop table " + name);
                    System.out.println("Table " + name + " has been deleted.");
                    break;
                }
            }
            rs.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void closeConnection() {
        this.dbManager.closeConnections();
    }
}
    
//    //tester
//    public static void main(String[] args) {
//        Checkout checkout = new Checkout();
//
//        // Create the checkout table
//        checkout.createCheckoutTable();
//
//        // Perform some checkout operations
//         checkout.cardName = "John Doe";
//         checkout.cardNumber = 123456789;
//        checkout.cardPin = 1234;
//        
//        // Close the database connection
//        checkout.closeConnection();

//    //asking the user their information for payment 
//     public void checkout() {
//        //asking the user to enter their payment details
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Pay by card? 'Y' to continue. If Not, Payment cannot proceed.");
//        String answer = scan.nextLine();
//        //if their answer is equal to Y , it will proceed to ask the questions
//        if (answer.equals("Y") || answer.equals("y")) {
//            try {
//                System.out.println("Cards Number:");
//                cardNumber = scan.nextDouble();
//                System.out.println("Cards Pin:");
//                cardPin = scan.nextDouble();
//                System.out.println("Thank you for ordering. Your payment has been processed & your food will arive shortly!");
//                //no letters in card information - therefore will ask user to try again
//            } catch (InputMismatchException ex) {
//                scan.next();
//                System.out.println("Sorry, You have entered an invalid Number. Please ensure that there is no letters in your input. Retry payment:");
//                checkout();
//            }
//        } else {
//            //if user cannot enter Y , they will be unsucessful
//            System.out.println("Payment was unsucessful");
//        }
//
//    }   
//tester
//    public static void main(String[] args) {
//        Checkout co = new Checkout();
//        co.checkout();
//    }
//    
