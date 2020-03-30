/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DeliveryMan;

import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class DeliveryManDirectory {
    
    private ArrayList<DeliveryMan> deliveryList;

    public DeliveryManDirectory() {
        deliveryList = new ArrayList();
    }

    public ArrayList<DeliveryMan> getDeliveryList() {
        return deliveryList;
    }
    
    public DeliveryMan createDeliveryMan(String name){
        DeliveryMan delivery = new DeliveryMan();
        delivery.setName(name);
        deliveryList.add(delivery);
        return delivery;
    }
    
    
    
    // To delete
    public boolean deleteDeliveryMan(DeliveryMan emp){
        
        //res.setName(name);
        return deliveryList.remove(emp);
        
    }   
    
    
    // To check Uniqueness of name
    public boolean deliveryManExists(DeliveryMan res){
        //res.setName(name);
        return deliveryList.contains(res);
        
    }     
    
    
    // To Update
    public DeliveryMan getDeliveryMan(DeliveryMan emp){
        //res.setName(name);
        for(DeliveryMan em : deliveryList){
            if(emp.equals(em)) return em;
            else return null;
        }
        return null;
    }     

     
    
    
}
