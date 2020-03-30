/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class Customer {
    private String name;
    private String userName;
    private String password;
    private static int  id = 0;
    private ArrayList<FoodItem> orderHistory;
    private static int count = 1;

    public Customer(String name, String userName, String pwd){
       
       this.id++;
       this.count++;
       this.name =  name;
       this.userName = userName;
       this.password = pwd;
       orderHistory=new ArrayList<FoodItem>();
       
    }

    public ArrayList<FoodItem> getOrderHistory() {
        return orderHistory;
    }
    

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Customer.count = count;
    }

    @Override
    public String toString() {
        return this.name;
    }
    
    
    public void orderPlaced(FoodItem oi){
        orderHistory.add(oi);
    }
    
    public ArrayList<FoodItem> viewOrderHistory(){
        return orderHistory;
    }

    
    
    
}
