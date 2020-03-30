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
public class CustomerDirectory {
    private ArrayList<Customer> customersList;

    public CustomerDirectory(){
        this.customersList = new ArrayList<Customer>();
    }
    
    public ArrayList<Customer> getCustomersList() {
        return this.customersList;
    }


    
    
    // To create
    public Customer createCustomer(String name, String usName, String pwd){
        Customer res = new Customer(name, usName, pwd);
        //res.setName(name);
        customersList.add(res);
        return res;
    }    
    
    
    // To delete
    public boolean deleteCustomer(Customer res){
        
        //res.setName(name);
        return customersList.remove(res);
        
    }   
    
    
    // To check Uniqueness of name
    public boolean searchCustomer(Customer res){
        //res.setName(name);
        return customersList.contains(res);
        
    }     
    
    
    // To Update
    public Customer getCustomer(Customer res){
        //res.setName(name);
        for(Customer rs : customersList){
            if(res.equals(rs)) return rs;
            else return null;
        }
        return null;
    }     

    
    
    
    
}
