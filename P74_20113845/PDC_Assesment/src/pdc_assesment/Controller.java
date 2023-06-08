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
public class Controller extends KeyAdapter implements ActionListener, KeyListener {
    
    public Customer customer;
    public Cafe_GUI gui;
    private final Cafe_GUI Cafe_GUI;
    
    public Controller(Customer customer, Cafe_GUI gui)
    {
        this.customer = customer;
        this.Cafe_GUI = gui;
    }
    
    @Override
    public void actionPerformed(Action Event e)
    {
         String command = e.getActionCommand();
            System.out.println("action command " +command );
            switch(command){
                
                
                case "CONFIRM STEP1":
                    String name = this.gui.name.getText();
                    String guests = this.gui.guests.getText();
                    break;
    }
}
}
