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


        System.out.println("##############################################################################");        
       // Patient one details below...
        
        Date d1 = new Date(System.currentTimeMillis());          // Setting the date of the Patient
        VitalSigns vsP1 = new VitalSigns(124, 90, 95, 55, d1);   
        Patient p1 = new Patient("Jon Snow", 23, 5.7F, vsP1);   // 2 years old, Toodler
        
        
        Date d2 = new Date(System.currentTimeMillis());          // Setting a forward date
        VitalSigns vsP2 = new VitalSigns(224, 190, 295, 255, d2);
        p1.setVitalSigns(vsP2);
        
        Date d3 = new Date(System.currentTimeMillis());          // Setting a forward date, latest one
        VitalSigns vsP3 = new VitalSigns(25, 110, 90, 11, d3);
        p1.setVitalSigns(vsP3);    
    
       System.out.println("##################### Patient Name : "+p1.getName()+" ##############################"); 
        
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
        
          System.out.println("#######################################");
        
        if(p1.thisVitalSignNormal("weight") && p1.thisVitalSignNormal("Heart Rate") 
         && p1.thisVitalSignNormal("Blood Pressure") && p1.thisVitalSignNormal("Respiratory Rate")  ){ 
        
            System.out.println("Patient "+  p1.getName()  +"'s vitals are normal");
        
        }
        else{
        
            System.out.println("Patient "+p1.getName()+"'s vitals are not normal. Please consult a doctor.");
        
        }
        
        
        
        System.out.println("##############################################################################");
        
        
        // Patient two details below : Infant details
        
                
        Date d4 = new Date(System.currentTimeMillis());                 // Setting the date of the Patient
        VitalSigns vsP4 = new VitalSigns(25, 90, 95, 55, d4);          // Taking vital sign
        Patient p2 = new Patient("Tyrion Lannister", 11, 5.7F, vsP4);   // 2 years old, Toodler
        
        
        Date d5 = new Date(System.currentTimeMillis());                 // Setting a forward date
        VitalSigns vsP5 = new VitalSigns(29, 99, 99, 60, d5);       // Latest vital  Vitals have abnormal weight
        p1.setVitalSigns(vsP5);                                         // Setting new vital sign
        
       System.out.println("##################### Patient Name : "+p2.getName()+" ##############################"); 
   
        
        System.out.println("#######################################");
        
        System.out.println(p2.getName()+"'s vital history is as follows:  ");
        System.out.println(p2.getVitalSignHistory());
        
        
        System.out.println("#######################################");
        
        System.out.println("Current Vital signs are :"+p2.getCurrVitalSign());
        
        System.out.println("#######################################");
        
        
        // Checking Respiratory, Heart Rate, Blood pressure and weight vital signs normal or not, individually.
    
        System.out.println("Is "+ p2.getName() +" Respiratory Rate normal?  "+p2.thisVitalSignNormal("Respiratory Rate"));
        
        
        System.out.println("Is "+ p2.getName() +" Blood Pressure rate normal?  "+p2.thisVitalSignNormal("Blood Pressure"));
        
        
        System.out.println("Is "+ p2.getName() +" Heart Rate normal?  "+p2.thisVitalSignNormal("Heart Rate"));
        
        
        System.out.println("Is "+ p2.getName() +" weight (kilograms) normal?  "+p2.thisVitalSignNormal("weight"));
        
        System.out.println("#######################################");
        
        
        
        if(p1.thisVitalSignNormal("weight") && p2.thisVitalSignNormal("Heart Rate") 
         && p1.thisVitalSignNormal("Blood Pressure") && p2.thisVitalSignNormal("Respiratory Rate")  ){ 
        
            System.out.println("Patient "+  p2.getName()  +"'s vitals are normal");
        
        }
        else{
        
            System.out.println("Patient "+p2.getName()+"'s vitals are not normal. Please consult a doctor.");
        
        }
        
       
       System.out.println("##############################################################################"); 
        
        
        
        // Patient 3 Preschooler 
        
        
                        
        Date d6 = new Date(System.currentTimeMillis());                   // Setting the date of the Patient
        VitalSigns vsP6 = new VitalSigns(25, 130, 105, 15, d6);           // Taking vital sign
        Patient p3 = new Patient("Jamie Lannister", 48, 5.7F, vsP6);      // Preschooler
        
        
        Date d7 = new Date(System.currentTimeMillis());                   // Setting a forward date
        VitalSigns vsP7 = new VitalSigns(31, 115, 105, 15, d7);           // Latest vital  Vitals have abnormal Respiratory Rate
        p3.setVitalSigns(vsP7);                                           // Setting new vital sign
        
       System.out.println("##################### Patient Name : "+p3.getName()+" ##############################"); 
   
        
        System.out.println("#######################################");
        
        System.out.println(p3.getName()+"'s vital history is as follows:  ");
        System.out.println(p3.getVitalSignHistory());
        
        
        System.out.println("#######################################");
        
        System.out.println("Current Vital signs are :"+p3.getCurrVitalSign());
        
        System.out.println("#######################################");
        
        
        // Checking Respiratory, Heart Rate, Blood pressure and weight vital signs normal or not, individually.
    
        System.out.println("Is "+ p3.getName() +" Respiratory Rate normal?  "+p3.thisVitalSignNormal("Respiratory Rate"));
        
        
        System.out.println("Is "+ p3.getName() +" Blood Pressure rate normal?  "+p3.thisVitalSignNormal("Blood Pressure"));
        
        
        System.out.println("Is "+ p3.getName() +" Heart Rate normal?  "+p3.thisVitalSignNormal("Heart Rate"));
        
        
        System.out.println("Is "+ p3.getName() +" weight (kilograms) normal?  "+p3.thisVitalSignNormal("weight"));
        
        System.out.println("#######################################");
        
        
        
        if(p3.thisVitalSignNormal("weight") && p3.thisVitalSignNormal("Heart Rate") 
         && p3.thisVitalSignNormal("Blood Pressure") && p3.thisVitalSignNormal("Respiratory Rate")  ){ 
        
            System.out.println("Patient "+  p3.getName()  +"'s vitals are normal");
        
        }
        else{
        
            System.out.println("Patient "+p3.getName()+"'s vitals are not normal. Please consult a doctor.");
        
        }
        
       
       System.out.println("##############################################################################"); 

       
                        
        Date d8 = new Date(System.currentTimeMillis());                   // Setting the date of the Patient
        VitalSigns vsP8 = new VitalSigns(25, 130, 115, 25, d8);           // Taking vital sign
        Patient p4 = new Patient("Cercie Lannister", 84, 5.7F, vsP8);      // School Age
        
        
        Date d9 = new Date(System.currentTimeMillis());                   // Setting a forward date
        VitalSigns vsP9 = new VitalSigns(28, 112, 121, 25, d9);           // Latest vital  Vitals have abnormal Respiratory Rate
        p4.setVitalSigns(vsP9);                                           // Setting new vital sign
        
   
        System.out.println("##################### Patient Name : "+p4.getName()+" ##############################"); 
         
        System.out.println("#######################################");
        
        System.out.println(p4.getName()+"'s vital history is as follows:  ");
        System.out.println(p4.getVitalSignHistory());
        
        
        System.out.println("#######################################");
        
        System.out.println("Current Vital signs are :"+p4.getCurrVitalSign());
        
        System.out.println("#######################################");
        
        
        // Checking Respiratory, Heart Rate, Blood pressure and weight vital signs normal or not, individually.
    
        System.out.println("Is "+ p4.getName() +" Respiratory Rate normal?  "+p4.thisVitalSignNormal("Respiratory Rate"));
        
        
        System.out.println("Is "+ p4.getName() +" Blood Pressure rate normal?  "+p4.thisVitalSignNormal("Blood Pressure"));
        
        
        System.out.println("Is "+ p4.getName() +" Heart Rate normal?  "+p4.thisVitalSignNormal("Heart Rate"));
        
        
        System.out.println("Is "+ p4.getName() +" weight (kilograms) normal?  "+p4.thisVitalSignNormal("weight"));
        
        System.out.println("#######################################");
        
        
        
        if(p4.thisVitalSignNormal("weight") && p4.thisVitalSignNormal("Heart Rate") 
         && p4.thisVitalSignNormal("Blood Pressure") && p4.thisVitalSignNormal("Respiratory Rate")  ){ 
        
            System.out.println("Patient "+  p4.getName()  +"'s vitals are normal");
        
        }
        else{
        
            System.out.println("Patient "+p4.getName()+"'s vitals are not normal. Please consult a doctor.");
        
        }
        
       
         System.out.println("##############################################################################"); 
                    
        Date d10 = new Date(System.currentTimeMillis());                   // Setting the date of the Patient
        VitalSigns vsP10 = new VitalSigns(15, 56, 115, 65, d10);           // Taking vital sign
        Patient p5 = new Patient("Sansa Stark", 168, 5.7F, vsP10);      // Adolescent Age
        
        
        Date d11 = new Date(System.currentTimeMillis());                   // Setting a forward date
        VitalSigns vsP11 = new VitalSigns(16, 57, 111, 70, d11);           // Latest vital  Vitals have abnormal Respiratory Rate
        p5.setVitalSigns(vsP11);                                           // Setting new vital sign
        
   
        System.out.println("##################### Patient Name : "+p5.getName()+" ##############################"); 
         
        System.out.println("#######################################");
        
        System.out.println(p5.getName()+"'s vital history is as follows:  ");
        System.out.println(p5.getVitalSignHistory());
        
        
        System.out.println("#######################################");
        
        System.out.println("Current Vital signs are :"+p5.getCurrVitalSign());
        
        System.out.println("#######################################");
        
        
        // Checking Respiratory, Heart Rate, Blood pressure and weight vital signs normal or not, individually.
    
        System.out.println("Is "+ p5.getName() +" Respiratory Rate normal?  "+p5.thisVitalSignNormal("Respiratory Rate"));
        
        
        System.out.println("Is "+ p5.getName() +" Blood Pressure rate normal?  "+p5.thisVitalSignNormal("Blood Pressure"));
        
        
        System.out.println("Is "+ p5.getName() +" Heart Rate normal?  "+p5.thisVitalSignNormal("Heart Rate"));
        
        
        System.out.println("Is "+ p5.getName() +" weight (kilograms) normal?  "+p5.thisVitalSignNormal("weight"));
        
        System.out.println("#######################################");
        
        
        
        if(p5.thisVitalSignNormal("weight") && p5.thisVitalSignNormal("Heart Rate") 
         && p5.thisVitalSignNormal("Blood Pressure") && p5.thisVitalSignNormal("Respiratory Rate")  ){ 
        
            System.out.println("Patient "+  p5.getName()  +"'s vitals are normal");
        
        }
        else{
        
            System.out.println("Patient "+p5.getName()+"'s vitals are not normal. Please consult a doctor.");
        
        }
        
       
       System.out.println("##############################################################################"); 
        
                    
        Date d12 = new Date(System.currentTimeMillis());                   // Setting the date of the Patient
        VitalSigns vsP12 = new VitalSigns(15, 125, 65, 2.5, d12);           // Taking vital sign
        Patient p6 = new Patient("Arya Stark", 0, 5.7F, vsP12);      // Adolescent Age
        
        
        Date d13 = new Date(System.currentTimeMillis());                   // Setting a forward date
        VitalSigns vsP13 = new VitalSigns(16, 161, 65, 2.5, d13);           // Latest vital  Vitals have abnormal Respiratory Rate
        p6.setVitalSigns(vsP13);                                           // Setting new vital sign
        
   
        System.out.println("##################### Patient Name : "+p6.getName()+" ##############################"); 
         
        System.out.println("#######################################");
        
        System.out.println(p6.getName()+"'s vital history is as follows:  ");
        System.out.println(p6.getVitalSignHistory());
        
        
        System.out.println("#######################################");
        
        System.out.println("Current Vital signs are :"+p6.getCurrVitalSign());
        
        System.out.println("#######################################");
        
        
        // Checking Respiratory, Heart Rate, Blood pressure and weight vital signs normal or not, individually.
    
        System.out.println("Is "+ p6.getName() +" Respiratory Rate normal?  "+p6.thisVitalSignNormal("Respiratory Rate"));
        
        
        System.out.println("Is "+ p6.getName() +" Blood Pressure rate normal?  "+p6.thisVitalSignNormal("Blood Pressure"));
        
        
        System.out.println("Is "+ p6.getName() +" Heart Rate normal?  "+p6.thisVitalSignNormal("Heart Rate"));
        
        
        System.out.println("Is "+ p6.getName() +" weight (kilograms) normal?  "+p6.thisVitalSignNormal("weight"));
        
        System.out.println("#######################################");
        
        
        
        if(p6.thisVitalSignNormal("weight") && p6.thisVitalSignNormal("Heart Rate") 
         && p6.thisVitalSignNormal("Blood Pressure") && p6.thisVitalSignNormal("Respiratory Rate")  ){ 
        
            System.out.println("Patient "+  p6.getName()  +"'s vitals are normal");
        
        }
        else{
        
            System.out.println("Patient "+p6.getName()+"'s vitals are not normal. Please consult a doctor.");
        
        }
        
       
       System.out.println("##############################################################################"); 
        
         
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
    
}
