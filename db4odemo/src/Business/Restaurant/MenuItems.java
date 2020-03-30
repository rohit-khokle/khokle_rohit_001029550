/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;

import Business.Customer.FoodItem;
import java.util.ArrayList;

/**
 *
 * @author rohit
 */
public class MenuItems {
    private ArrayList<FoodItem> menu;

    public MenuItems() {
        this.menu = new ArrayList<FoodItem>();
    }

    public ArrayList<FoodItem> getMenu() {
        return menu;
    }

    public void setMenu(ArrayList<FoodItem> menu) {
        this.menu = menu;
    }
    

    public FoodItem addToMenu(String name, String cuisine){
        FoodItem foodItem = new FoodItem(name, cuisine);
        menu.add(foodItem);
        return foodItem;
    }
    
    
    
    // To delete
    public boolean deleteFromMenu(FoodItem foodItem){
        
        //res.setName(name);
        return menu.remove(foodItem);
        
    }   
    
    
    // To check Uniqueness of name
    public boolean checkIfExists(FoodItem foodItem){
        //res.setName(name);
        return menu.contains(foodItem);
        
    }     
    
    
    // To Update
    public FoodItem getMenuItem(FoodItem foodItem){
        //res.setName(name);
        for(FoodItem em : menu){
            if(foodItem.equals(em)) return em;
            else return null;
        }
        return null;
    }     

    
}
