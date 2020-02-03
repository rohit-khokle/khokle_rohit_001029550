/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package driver;

import Business.Patient;
import Business.VitalSigns;
import java.util.Date;

/**
 *
 * @author Rohit
 */
public class TestClass {
    
    public static void main(String[] args)
    {   
        
        
        Date d1 = new Date(System.currentTimeMillis());          // Setting the date of the Patient
        VitalSigns vsP1 = new VitalSigns(124, 90, 95, 55, d1);   
        Patient p1 = new Patient("Jon Snow", 23, 5.7F, vsP1);   // 2 years old, Toodler
        
        
        Date d2 = new Date(System.currentTimeMillis());          // Setting a forward date
        VitalSigns vsP2 = new VitalSigns(224, 190, 295, 255, d2);
        p1.setVitalSigns(vsP2);
        
        Date d3 = new Date(System.currentTimeMillis());          // Setting a forward date, latest one
        VitalSigns vsP3 = new VitalSigns(25, 110, 90, 11, d3);
        p1.setVitalSigns(vsP3);    
    
        
        System.out.println("#######################################");
        
        System.out.println(p1.getName()+"'s vital history is as follows:  ");
        System.out.println(p1.getVitalSignHistory());
        
        
        System.out.println("#######################################");
        
        System.out.println("Current Vital signs are :"+p1.getCurrVitalSign());
        
        System.out.println("#######################################");
        
        
        // Checking Respiratory, Heart Rate, Blood pressure and weight vital signs normal or not, individually.
    
        System.out.println("Is "+ p1.getName() +" Respiratory Rate normal?  "+p1.thisVitalSignNormal("Respiratory Rate"));
        
        
        System.out.println("Is "+ p1.getName() +" Blood Pressure rate normal?  "+p1.thisVitalSignNormal("Blood Pressure"));
        
        
        System.out.println("Is "+ p1.getName() +" Heart Rate normal?  "+p1.thisVitalSignNormal("Heart Rate"));
        
        
        System.out.println("Is "+ p1.getName() +" weight (kilograms) normal?  "+p1.thisVitalSignNormal("weight"));
        
    }
    
    
}
