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

//inheritance class. Extends.  Drinks are a cafe item 

public abstract class Drink extends CafeItem{

    //constructor 
    public Drink(double price, String description, String name, Temperature temperature) {
        super(price, description, name, temperature);
    }
    
    //using enum for the cup sizes - dirnks only 
    enum CupSize {
        SMALL,
        MEDIUM,
        LARGE;
    }
    
     public abstract CupSize getCupSize();
    
}