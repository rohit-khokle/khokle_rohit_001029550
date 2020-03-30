/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;


import Business.Customer.CustomerDirectory;
import Business.DeliveryMan.DeliveryManDirectory;
import Business.Employee.EmployeeDirectory;
import Business.Restaurant.RestaurantDirectory;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import Business.WorkQueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author MyPC1
 */
public class EcoSystem extends Organization{
    
    private static EcoSystem business;
    public RestaurantDirectory restaurantDirectory;
    private WorkQueue workQueue;
    public CustomerDirectory customerDirectory;
    public EmployeeDirectory employeeDirectory;
    public DeliveryManDirectory deliveryManDirectory;

    public EcoSystem(RestaurantDirectory restaurantDirectory, CustomerDirectory customerDirectory, DeliveryManDirectory deliveryManDirectory,EmployeeDirectory employeeDirectory, WorkQueue wq) {
        super(null);
        this.workQueue = wq;
        this.restaurantDirectory = restaurantDirectory;
        this.customerDirectory = customerDirectory;
        this.deliveryManDirectory = deliveryManDirectory;
        this.employeeDirectory= employeeDirectory;
    }
    
    
    public static EcoSystem getInstance(){
          
        if(business==null){
            WorkQueue wq =  new WorkQueue();
            RestaurantDirectory restaurantDirectory = new RestaurantDirectory();
            CustomerDirectory customerDirectory = new CustomerDirectory();
            DeliveryManDirectory deliveryManDirectory = new DeliveryManDirectory();
            EmployeeDirectory employeeDirectory = new EmployeeDirectory();
            
            business=new EcoSystem(restaurantDirectory,customerDirectory,deliveryManDirectory,employeeDirectory, wq);
        }
        return business;
    }

    
    
    public RestaurantDirectory getRestaurantDirectory(){
        return this.restaurantDirectory;
    }
    public CustomerDirectory getCustomerDirectory(){
        return this.customerDirectory;
    }
    public DeliveryManDirectory getDeliveryManDirectory()
    {
        return this.deliveryManDirectory;
    }
    
    
    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList=new ArrayList<Role>();
        roleList.add(new SystemAdminRole());
        return roleList;
    }
    private EcoSystem(){
            
        super(null);
       // networkList=new ArrayList<Network>();
    }

    
    public boolean checkIfUserIsUnique(String userName){
       //
       return false;
    }

    public void setRestaurantDirectory(RestaurantDirectory restaurantDirectory) {
        this.restaurantDirectory = restaurantDirectory;
    }

    public void setCustomerDirectory(CustomerDirectory customerDirectory) {
        this.customerDirectory = customerDirectory;
    }

    public void setDeliveryManDirectory(DeliveryManDirectory deliveryManDirectory) {
        this.deliveryManDirectory = deliveryManDirectory;
    }

    public void setEmployeeDirectory(EmployeeDirectory employeeDirectory) {
        this.employeeDirectory = employeeDirectory;
    }
    
    
    
}
