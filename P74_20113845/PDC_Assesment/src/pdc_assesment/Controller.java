/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pdc_assesment;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyListener;
import javax.swing.Action;

/**
 *
 * @author Hampton1
 */
public class Controller{
    
    public Customer customer;
    public DBManager db;
    public Cafe_GUI gui;
    private final Cafe_GUI Cafe_GUI;
    
    //starting gui
    public Controller()
    {
        this.Cafe_GUI = new Cafe_GUI(this);
        this.db = new DBManager();
        this.customer = new Customer();
        this.Cafe_GUI.getPayment().setVisible(false);
        this.Cafe_GUI.getOrder().setVisible(false);
        this.Cafe_GUI.getMenu().setVisible(false);
        boolean loaded = this.db.loadCustomer(customer);
        if (loaded == true)
        {
           this.Cafe_GUI.getDetails().setVisible(false);
           this.Cafe_GUI.getMenu().setVisible(true);
        }        
  }
    
    public static void main(String[] args) {
        Controller controller = new Controller();
    }
    
    public void createCustomer()
    {
       this.customer = new Customer();

    }

}
