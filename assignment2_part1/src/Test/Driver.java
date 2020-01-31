/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import Business.Patient;
import Business.VitalSigns;
import java.util.Scanner;

/**
 *
 * @author Rohit
 */
public class Driver {
    
    public static void main(String[] args){
//        String name = "Jon Snow";
//        short age = 2;
//        float wgt = 12;
//        float wgtp = 12;
//        float height = 1;
//        double resRt =1.2;
//        double heartRt = 1.2;
//        double bp = 1.2;

        
        Scanner sc = new Scanner(System.in); 
        // String input
         System.out.println("Test cases for 1) Hard coded? 2) User selection? ");
 //       char choice = sc.nextLine();
        char choice = sc.next().charAt(0);
        if(choice == '1'){
        
        //double respiratoryRt, double heartRt, double sysBP, double wght, double wghtP    
        VitalSigns newBornVital = new VitalSigns(35, 130, 60, 2, 6);  // Normal
        Patient newBorn = new Patient("New_Born_Name", 0, 1.1F , newBornVital);
        
           
        VitalSigns infantVital = new VitalSigns(25, 90, 110, 6, 20); // Not normal. 110, BP high
        Patient infant = new Patient("Infant_Name", 5, 1.1F , infantVital);
        
        
           
        VitalSigns toodlerVital = new VitalSigns(25, 90, 90, 13, 32); // Not normal, weight.
        Patient toodler = new Patient("toodler_Name", 13 , 1.1F , toodlerVital);
        
        
           
        VitalSigns prescholVital = new VitalSigns(25, 110, 90, 15, 38); // Normal
        Patient preschol = new Patient("preschol_Name", 48, 1.1F , prescholVital);
        
           
        VitalSigns schoolVital = new VitalSigns(25, 100, 115, 40, 90);   // Normal
        Patient school = new Patient("school_Name",84 , 1.1F , schoolVital);
        
           
        VitalSigns adolVital = new VitalSigns(25, 65, 115, 60, 120); // Not normal
        Patient adol = new Patient("adol_Name",168, 1.1F , adolVital);
        

        
        System.out.println("......For New Born............");
        System.out.println(newBorn+" with vitals : "+newBornVital);
        if(newBorn.isPatientNormal())
            System.out.println(newBorn.getName()+"'s vitals are normal");
        else 
            System.out.println(newBorn.getName()+"'s vitals are not normal");    
        
        
        
        
        System.out.println("......Infant............");
        System.out.println("Patient : "+infant);
        System.out.println(" with vitals : "+infantVital);
        if(infant.isPatientNormal())
            System.out.println(infant.getName()+"'s vitals are normal");
        else 
            System.out.println(infant.getName()+"'s vitals are not normal");    
        
        
        
        System.out.println("......Toodler............");
        System.out.println("Patient : "+toodler);
        System.out.println(" with vitals : "+toodlerVital);
        if(toodler.isPatientNormal())
            System.out.println(toodler.getName()+"'s vitals are normal");
        else 
            System.out.println(toodler.getName()+"'s vitals are not normal");    
        
        
        
        System.out.println("......Preschooler............");
        System.out.println("Patient : "+preschol);
        System.out.println(" with vitals : "+prescholVital);
        if(preschol.isPatientNormal())
            System.out.println(preschol.getName()+"'s vitals are normal");
        else 
            System.out.println(preschol.getName()+"'s vitals are not normal");    
        
        
        
        
        
        
        System.out.println("......schooler............");
        System.out.println("Patient : "+school);
        System.out.println(" with vitals : "+schoolVital);
        if(school.isPatientNormal())
            System.out.println(school.getName()+"'s vitals are normal");
        else 
            System.out.println(school.getName()+"'s vitals are not normal");    
        
        
        
        
        
        System.out.println("......Adol............");
        System.out.println("Patient : "+adol);
        System.out.println(" with vitals : "+adolVital);
        if(adol.isPatientNormal())
            System.out.println(adol.getName()+"'s vitals are normal");
        else 
            System.out.println(adol.getName()+"'s vitals are not normal");    
        
         
        
        }
        
        
        else if(choice == '2'){
        while(true)
        { 
         System.out.println("##################################");
         System.out.println("           Welcome                  ");
         System.out.println("##################################");
         sc.nextLine(); 
         
         System.out.println("Please enter name of the patient: ");
         String name = sc.nextLine(); 
         


         System.out.println("Is "+ name+" a newborn (less than one month baby) or an infant(1-3)? (Y/N): ");
         char c = sc.next().charAt(0);
         int age = 0;
         if(c == 'Y'){
                System.out.println("Is "+ name+" a newborn? (Y/N): ");
                char t = sc.next().charAt(0);
                if(t == 'Y')
                    age = 0;
                else
                    age = 24;
         }
         

  /*   
        boolean check = true;
        short age = 0;
        do
        {   
         System.out.println("What age group "+ name+" belongs to? Please enter appropriate number: ");
         System.out.println("1. Newborn (less than a month) ");
         System.out.println("2. Infant (1 to 12 months) ");
         System.out.println("3. Toddler (1-3 years) ");
         System.out.println("4. Preschooler (3-5 years) ");
         System.out.println("5. School age (6-12 years) ");
         System.out.println("6. Adolescent (13+ years) ");         
         int c = sc.nextInt();
         
         
         
         if(c == 1){
             age = 0;   // new born
             break;// check = false;
         }
         if(c == 2){
             age = 5;   // infant
             break;

         }         
         if(c == 3){
             age = 13;  // Toddler
             break;

         } 
         if(c == 4){
             age = 48;  // preschooler
             break;           

         }         
         if(c == 5){
             age = 84;  // school age
             break;   

         }         
         if(c == 6){
             age = 168;  // adolescent
             break;

         }
         else{
             check = true;
             System.out.println("Please enter correct value.");  // adolescent
         }                  
         
         
        }while(check ); */ 
         
         else{
            System.out.println("Please enter age (in years)  of "+ name+" : ");
             age = sc.nextShort();
             age =  age*12;
        }


         System.out.println(" ");
         System.out.println("Enter height  of "+ name+" : ");
         float height = sc.nextFloat();

         System.out.println(" ");         
         System.out.println("Enter weight (kgs)  of "+ name+" : ");
         double wgt = sc.nextFloat();
         double wgtp = wgt * 2.2;
         
         System.out.println(" ");         
         System.out.println("Enter respiratory rate of "+ name+" : ");
         double resRt = sc.nextDouble();
         
         System.out.println(" ");         
         System.out.println("Enter heart rate of "+ name+" : ");
         double heartRt = sc.nextDouble();
         
         
         System.out.println(" ");         
         System.out.println("Enter blood pressure of "+ name+" : ");
         double bp = sc.nextDouble();


         System.out.println(" ");         
         VitalSigns vitals = new VitalSigns(resRt,heartRt,bp,wgt,wgtp);
         Patient patient = new Patient(name,age ,height, vitals);
         
         if(patient.isPatientNormal()){
         
             System.out.println(patient.getName() + "'s vitals are normal.");
         
         }
         else{
             
             System.out.println(patient.getName() + "'s vitals are not normal. Please consult a doctor.");
             System.out.println();
             System.out.println();
         }
         sc.nextLine();
         System.out.println("##################################");        
         System.out.println();
         System.out.println();


        }
         
    }
    }
}
