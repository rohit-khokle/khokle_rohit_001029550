/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;

import Business.Employee.Employee;
import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class RestaurantDirectory {
    private ArrayList<Restaurant> restaurantsList;

    public ArrayList<Restaurant> getRestaurantsList() {
        return restaurantsList;
    }

    public RestaurantDirectory(){
    
        restaurantsList = new ArrayList<Restaurant>();
    }
    
    
    public void setRestaurantsList(ArrayList<Restaurant> restaurantsList) {
        this.restaurantsList = restaurantsList;
    }
    
    
    // To create
    public Restaurant createRestaurant(String name, int cap){
        Restaurant res = new Restaurant(name, cap);
        //res.setName(name);
        restaurantsList.add(res);
        return res;
    }    
    
    
    // To delete
    public boolean deleteRestaurant(Restaurant res){
        
        //res.setName(name);
        return restaurantsList.remove(res);
        
    }   
    
    
    // To check Uniqueness of name
    public boolean checkRestaurantExists(String resName){
        //res.setName(name);
         for(Restaurant rs : restaurantsList){
            if(resName.equals(rs.getName())) return true;
        } 
         return false;
    }     
    
    
    // To Update
    public Restaurant getRestaurant(Restaurant res){
        //res.setName(name);
        for(Restaurant rs : restaurantsList){
            if(res.equals(rs)) return rs;
            else return null;
        }
        return null;
    }     

    
    
}
