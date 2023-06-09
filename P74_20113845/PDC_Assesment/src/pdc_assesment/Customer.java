/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pdc_assesment;

/**
 *
 * @author eh155
 */
public class Customer {
    
    //variables for the customer
    private String name;
    private int guests;
//    DBManager dbManager;
//    Connection conn;
//    Statement statement;

    public String getName() {
        return name;
    }

    public int getGuests() {
        return guests;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGuests(int guests) {
        this.guests = guests;
    }
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