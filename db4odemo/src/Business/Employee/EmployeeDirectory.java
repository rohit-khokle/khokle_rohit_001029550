/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

import Business.Restaurant.Restaurant;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class EmployeeDirectory {
    
    private ArrayList<Employee> employeeList;

    public EmployeeDirectory() {
        employeeList = new ArrayList();
    }

    public ArrayList<Employee> getEmployeeList() {
        return employeeList;
    }
    
    public Employee createEmployee(String name, String userName, String pwd, String role){
        Employee employee = new Employee(name, userName, pwd, role);
       // employee.setName(name);
        employeeList.add(employee);
        return employee;
    }
    public Employee createEmployee(String name, String userName, String pwd, String role, Restaurant res){
        Employee employee = new Employee(name, userName, pwd, role, res);
       // employee.setName(name);
        employeeList.add(employee);
        return employee;
    }    
    
    
    // To delete
    public boolean deleteEmployee(Employee emp){
        
        //res.setName(name);
        return employeeList.remove(emp);
        
    }   
    
    
    // To check Uniqueness of name
    public boolean searchEmployee(Employee res){
        //res.setName(name);
        return employeeList.contains(res);
        
    }     
    
    
    // To Update
    public Employee getEmployee(Employee emp){
        //res.setName(name);
        
        for(Employee em : employeeList){
            if(emp.equals(em)) return em;
        }
        return null;
    }     

     
    
    
    
}