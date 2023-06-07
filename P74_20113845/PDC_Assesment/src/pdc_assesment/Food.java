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

//inheritance class. Extends.  Food are a cafe item 


public abstract class Food extends CafeItem {

    //constructor 
    public Food(double price, String description, String name, Temperature temperature) {
        super(price, description, name, temperature);
    }
    
    public abstract double getGrams();
}
