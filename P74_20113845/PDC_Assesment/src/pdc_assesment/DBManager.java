/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pdc_assesment;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Hampton1
 */
public class DBManager {

    private static final String URL = "jdbc:derby://localhost:1527/Cafe;create=true";
    private static final String USER_NAME = "pdc"; //DB username
    private static final String PASSWORD = "pdc"; // DB password

    Connection conn;

    public DBManager() {
        establishConnection();
    }

    public Connection getConnection() {
        return this.conn;
    }

    //Establishing connection
    public void establishConnection() {
        if (this.conn == null) {
            try {
                conn = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
                System.out.println(URL + " Is Connected Successfully. ");
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }

    //method to close the connection 
    public void closeConnections() {
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }

    public void updateDB(String sql) {
        Connection connection = this.conn;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            statement = connection.createStatement();
            statement.executeUpdate(sql);

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public ResultSet queryDB(String sql) {
        Connection connection = this.conn;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sql);

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return resultSet;
    }

    public boolean checkExistedTable(String name) {
        try {
            DatabaseMetaData dbmd = this.conn.getMetaData();
            String[] types = {"TABLE"};
            Statement statement = this.conn.createStatement();
            ResultSet rs = dbmd.getTables(null, null, null, types);

            while (rs.next()) {
                String table_name = rs.getString("TABLE_NAME");
                System.out.println(table_name);
                if (table_name.equalsIgnoreCase(name)) {
                    return true;
                }
            }
            rs.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        return false;
    }

    public boolean loadCustomer(Customer customer) {

        try {
            Statement statement = conn.createStatement();
            String tableName = "CustomerTable";

            //Check if table exists
            if (checkExistedTable("CustomerTable")) {
                //Select data
                String selectData = "SELECT name, guests FROM " + tableName;
                //send statement

                ResultSet rs = queryDB(selectData);
                while (rs.next()) {
//                    if(rs.getString("name") != null)
//                    {
//                     return false;
//                    }
                    customer.setName(rs.getString("name"));

                    customer.setGuests(Integer.parseInt(rs.getString("guests")));
                    return true;
                }
            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return false;
    }

    public boolean addCustomer(Customer customer) {
        try {
            if(customer.getName().isEmpty() || customer.getGuests() == 0)
            {
            //throw new IllegalArgumentException("Data not found");
                return false;
            }            
            
            Statement statement = conn.createStatement();
            String tableName = "CustomerTable";

            //Create table if it does not exist
            if (!checkExistedTable("CustomerTable")) {
                String createTable = "CREATE TABLE " + tableName + " (name VARCHAR(50)," + "guests  VARCHAR(20))";
                statement.executeUpdate(createTable);
            }

            //Insert data
            String insertData = "INSERT INTO " + tableName + " VALUES ('" + customer.getName() + "', '" + customer.getGuests() + "')";
            statement.addBatch(insertData);
            statement.executeBatch();
            return true;
        } catch (SQLException ex) {
            //System.out.println(ex.getMessage());
            return false;
        }
    }
}
