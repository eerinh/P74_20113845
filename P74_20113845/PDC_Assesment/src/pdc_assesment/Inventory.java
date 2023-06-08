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
public class Inventory {
    
    //variables 
    private List<CafeItem> items;
    private static Inventory instance;
    
    //setting instane to inventory if it is not null.
    public static Inventory getInstance()
    {
        if (instance == null)
        {
            instance = new Inventory();
        }
        return instance;    
    }
    //constructor
    public Inventory() {
        this.items = new ArrayList<CafeItem>();
    }
    
    //adding new item to the cafeitem 
    public void addCafeItem(CafeItem item)
    {
      this.items.add(item);
    }
    
    public List<CafeItem> getCafeItem()
    {
        return this.items;
    }
}
