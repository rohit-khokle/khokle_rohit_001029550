/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

/**
 *
 * @author rohit
 */
public class FoodItem {
    static private int id = 0;
    String foodName;
    int quantity;  // Only related with customer, not used by restaurant
    String cuisine;

    public FoodItem(String foodName, String cuisine) {
        this.id++;
        this.foodName = foodName;
 //       this.quantity = quantity;
        this.cuisine = cuisine;
    }

    
    public int getFoodId() {
        return id;
    }
    
    
    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getCuisine() {
        return cuisine;
    }

    public void setCuisine(String cuisine) {
        this.cuisine = cuisine;
    }

    @Override
    public String toString() {
        return foodName;
    }
    
    
    
    
}
