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
public class CafeItem {
    
    //creating variables for all types of cafe items 
    private double price;
    private String description;
    private String name;
    private Temperature temperature;

    //constructor 
    public CafeItem(double price, String description, String name, Temperature temperature) {
        this.price = price;
        this.description = description;
        this.name = name;
        this.temperature = temperature;
    }

    //getter and setters for each of the variables
    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public String getName()
    {
        return name;
    }

    public Temperature getTemperature() {
        return temperature;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTemperature(Temperature temperature) {
        this.temperature = temperature;
    }  
}
