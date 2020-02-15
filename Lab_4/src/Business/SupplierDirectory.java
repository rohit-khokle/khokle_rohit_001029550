/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Abstract.User;
import Business.Users.Supplier;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author AEDSpring2019
 */
public class SupplierDirectory {
    
    private List<User> supplierList;
    
    public SupplierDirectory(){
        supplierList = new ArrayList<>();
    }

    public List<User> getSupplierList() {
        return supplierList;
    }

    public void setSupplierList(List<User> supplierList) {
        this.supplierList = supplierList;
    }
    
    
     
    public List<String> getSupplierName(){
        
        ArrayList<String> arr = new ArrayList<>();
            for(int i = 0; i < supplierList.size(); i++)
            {
                arr.add(supplierList.get(i).getUserName());
            }

        return arr;
    }
  
    
    
}
