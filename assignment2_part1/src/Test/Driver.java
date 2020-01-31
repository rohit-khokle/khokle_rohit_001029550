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
        while(true)
        { 
         System.out.println("##################################");
         System.out.println("           Welcome                  ");
         System.out.println("Please enter name of the patient: ");
         String name = sc.nextLine(); 
         

/*
         System.out.println("Is "+ name+" a newborn (less than one month baby? (Y/N): ");
         char c = sc.next().charAt(0);
         short age;
         if(c == 'Y'){
             age = 0;
         }
         
         else{
            System.out.println("Please enter age (in months)  of "+ name+" : ");
             age = sc.nextShort();
         }
 */     
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
         
         
        }while(check);
         
//         else{
//            System.out.println("Please enter age (in months)  of "+ name+" : ");
//             age = sc.nextShort();
//         }


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
