/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pdc_assesment;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author eh155
 */
public class Cart {
    
    //variable - List for the items for customers
    private final List<CafeItem> items;

    //constructor 
    public Cart() {
        this.items = new ArrayList<>();
    }
    
    //adding the items to the cart
    public void addToCart(CafeItem item)
    {
      this.items.add(item);
    }
    
    public List<CafeItem> getCafeItem()
    {
        return this.items;
    }
}
