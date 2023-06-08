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
public class Customer {
    
    //variables for the customer
    private String name;
    private int guests;
//    private Cart cart; //type cart 
    DBManager dbManager;
    Connection conn;
    Statement statement;
    
      public Customer() {
        dbManager = new DBManager();
        conn = dbManager.getConnection();
        try {
            statement = conn.createStatement();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
      
          public void createCustomer() {
        try {
            this.checkExistedTable("Customer Details");
            String tableName = "CustomerTable";
            String createTable = "CREATE TABLE " + tableName + "(name VARCHAR(50)," + "guests  VARCHAR(20))";
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
    
    
    
    
    
    
    
    
//    //constructor , creating new cart for customer
//    public Customer(String name, int tableNumber) {
//        this.name = name;
//        this.tableNumber = tableNumber;
//        this.cart = new Cart();
//    }
//
//    //getters and setters
//    public String getName() {
//        return name;
//    }
//
//    public int getTableNumber() {
//        return tableNumber;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public void setTableNumber(int tableNumber) {
//        this.tableNumber = tableNumber;
//    }
//   
}
