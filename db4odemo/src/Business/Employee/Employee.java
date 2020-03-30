/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

import Business.Restaurant.Restaurant;

/**
 *
 * @author raunak
 */
public class Employee {
    
    private String name;
    private int id;
    private String userName;
    private String password;
    private String role;
    private Restaurant res;
    private static int count = 1;

    
    
    public Employee(String name, String userName, String pwd,String role) {
        
        this.name = name;
        this.userName = userName;
        this.password = pwd;
        this.role = role;
      //  this.res = res;
        id = count;
        count++;
    }
    
    
    
    public Employee(String name, String userName, String pwd,String role, Restaurant res) {
        
        this.name = name;
        this.userName = userName;
        this.password = pwd;
        this.role = role;
        this.res = res;
        id = count;
        count++;
    }

    public String getRole() {
        return role;
    }

    public Restaurant getRes() {
        return res;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
    
    
}
