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
public class Controller {
 
    public Customer customer;
    public DBManager db;
    public Cafe_GUI gui;
   // private final Cafe_GUI Cafe_GUI;
    public Inventory inventory = Inventory.getInstance();

    //starting gui
    public Controller() {
        this.gui = new Cafe_GUI(this);
        this.db = new DBManager();
        this.customer = new Customer();
        this.gui.getPayment().setVisible(false);
        this.gui.getOrder().setVisible(false);
        this.gui.getMenu().setVisible(false);
        boolean loaded = this.db.loadCustomer(customer);
        if (loaded == true) {
            this.gui.getDetails().setVisible(false);
            this.gui.getMenu().setVisible(true);
        }
        this.setInventory();
    }
    
    //for testing
     public Controller(boolean test) {
        this.gui = new Cafe_GUI(this);
        this.setInventory();
    }


    public static void main(String[] args) {
        Controller controller = new Controller();
    }

    public void createCustomer() {
        this.customer = new Customer();

    }

    public void setInventory() {
        inventory.addCafeItem(new Food(9.00, "Chicken and lettuce", "Chicken Sandwhich", Temperature.COLD) {
            @Override
            public double getGrams() {
                return 4;
            }
        });
        inventory.addCafeItem(new Food(10.00, "Bacon and egg", "Pie", Temperature.WARM) {
            @Override
            public double getGrams() {
                return 5;
            }
        });
        inventory.addCafeItem(new Food(7.00, "Cake", "Red Velvet Cake", Temperature.WARM) {
            @Override
            public double getGrams() {
                return 3;
            }
        });

        inventory.addCafeItem(new Drink(4.00, "Small Hot Chocolate", "Small Hot Chocolate", Temperature.HOT) {
            @Override
            public Drink.CupSize getCupSize() {
                return Drink.CupSize.SMALL;
            }
        });

        inventory.addCafeItem(new Drink(5.00, "Medium Hot Chocolate", "Medium Hot Chocolate", Temperature.HOT) {
            @Override
            public Drink.CupSize getCupSize() {
                return Drink.CupSize.MEDIUM;
            }
        });
        inventory.addCafeItem(new Drink(6.00, "Large Coffee", "Large Coffee", Temperature.HOT) {
            @Override
            public Drink.CupSize getCupSize() {
                return Drink.CupSize.LARGE;
            }
        });
    }
    
    public boolean displayOrder(boolean Chicken, boolean Pie, boolean MediumHotChocolate, boolean SmallHotChocolate, boolean LargeCoffee, boolean Cake) {
    if (Chicken || MediumHotChocolate || SmallHotChocolate || Pie || Cake || LargeCoffee) {
        String order = " + -----------------Reciept:--------------------- + \n \n" ;
        float totalPrice = 0;
        if (Chicken == true) {
            order += "Chicken - $" + inventory.getCafeItem().get(0).getPrice() + "\n";
            totalPrice += inventory.getCafeItem().get(0).getPrice();
        }
        if (Pie == true) {
            order += "Pie - $" + inventory.getCafeItem().get(1).getPrice() + "\n";
            totalPrice += inventory.getCafeItem().get(1).getPrice();
        }
        if (MediumHotChocolate == true) {
            order += "Medium Hot Chocolate - $" + inventory.getCafeItem().get(4).getPrice() + "\n";
            totalPrice += inventory.getCafeItem().get(4).getPrice();
        }
        if (SmallHotChocolate == true) {
            order += "Small Hot Chocolate - $" + inventory.getCafeItem().get(3).getPrice() + "\n";
            totalPrice += inventory.getCafeItem().get(3).getPrice();
        }
        if (LargeCoffee == true) {
            order += "Large Coffee - $" + inventory.getCafeItem().get(5).getPrice() + "\n";
            totalPrice += inventory.getCafeItem().get(5).getPrice();
        }
        if (Cake == true) {
            order += "Cake - $" + inventory.getCafeItem().get(2).getPrice() + "\n";
            totalPrice += inventory.getCafeItem().get(2).getPrice();
        }
        
        this.gui.getMenu().setVisible(false);
        this.gui.getOrder().setVisible(true);
        this.gui.getPayment().setVisible(true);
        this.gui.getViewOrder().setText(order);
        this.gui.getTotal().setText("$" + totalPrice);
    
        return true;
    } else {
        return false;
    }
}
//    public String displayOrder(boolean Chicken, boolean Pie, boolean MediumHotChocolate, boolean SmallHotChocolate, boolean LargeCoffee, boolean cake) {
//        String order = "";
//        totalPrice = 0;
//        if (Chicken == true) {
//            order += "Chicken - $" + inventory.getCafeItem().get(0).getPrice() + "\n";
//            totalPrice += inventory.getCafeItem().get(0).getPrice();
//        }
//        if (Pie == true) {
//            order += "Pie - $" + inventory.getCafeItem().get(1).getPrice() + "\n";
//            totalPrice += inventory.getCafeItem().get(1).getPrice();
//        }
//        if (MediumHotChocolate == true) {
//            order += "MediumHotChocolate - $" + inventory.getCafeItem().get(4).getPrice() + "\n";
//            totalPrice += inventory.getCafeItem().get(4).getPrice();
//        }
//        if (SmallHotChocolate == true) {
//            order += "SmallHotChocolate - $" + inventory.getCafeItem().get(3).getPrice() + "\n";
//            totalPrice += inventory.getCafeItem().get(3).getPrice();
//        }
//        if (LargeCoffee == true) {
//            order += "LargeCoffee - $" + inventory.getCafeItem().get(5).getPrice() + "\n";
//            totalPrice += inventory.getCafeItem().get(5).getPrice();
//        }
//        if (cake == true) {
//            order += "Cake - $" + inventory.getCafeItem().get(2).getPrice() + "\n";
//            totalPrice += inventory.getCafeItem().get(2).getPrice();
//        }
//        return order;
//    }

}
