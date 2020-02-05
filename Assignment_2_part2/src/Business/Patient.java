/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author Rohit
 */
public class Patient {
    String name;
    int age;
    float height;
    VitalSigns currVitalSign;
    private ArrayList<VitalSigns> vitalSignHistory;
    
    
    public Patient(String name, int age, float height, VitalSigns vitalSigns) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.currVitalSign = vitalSigns;
        this.vitalSignHistory = new ArrayList<>();
        vitalSignHistory.add(this.currVitalSign);
    }

    public VitalSigns getCurrVitalSign() {
        return currVitalSign;
    }

    public void setCurrVitalSign(VitalSigns currVitalSign) {
        this.currVitalSign = currVitalSign;
    }

    public ArrayList<VitalSigns> getVitalSignHistory() {
        return vitalSignHistory;
    }

    public void setVitalSignHistory(ArrayList<VitalSigns> vitalSignHistory) {
        this.vitalSignHistory = vitalSignHistory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(short age) {
        this.age = age;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public VitalSigns getVitalSigns() {
        return currVitalSign;
    }

    public void setVitalSigns(VitalSigns vitalSigns) {
        this.currVitalSign = vitalSigns;
        this.vitalSignHistory.add(vitalSigns);
    }
    
    public boolean isPatientNormal()
    {
        int age = this.age;
        VitalSigns vitals = this.currVitalSign;
        
        double heartRt = vitals.getHeartRt();
        double resRt = vitals.getRespiratoryRt();
        double bp = vitals.getSysBP();
        double wt = vitals.getWght();
        double wtp = vitals.getWghtP();
        
        // converting age to months
        // age = age*12;
        
        // New Born
        if(age < 1 ){            
                if((resRt >= 30 && resRt <= 50) && 
                  ( heartRt >= 120 && heartRt <= 160) &&
                  ( bp >= 50 && bp<= 70) && (wt >= 2 && wt <= 3) &&
                 (wtp >= 4.5 && wtp <= 7)){
                    return true;
                }
        }
        // Infant (1-12 months)
        if(age >= 1 && age < 12){
                  if((resRt >= 20 && resRt <= 30 ) && 
                  ( heartRt >= 80 && heartRt <= 140) && 
                  ( bp >= 70 && bp<= 100) && (wt >= 4 && wt <= 10) &&
                 (wtp >= 9 && wtp <= 22)){
                    return true;
                }      
        }
        
        
        // Toodler (1-3 years)
        if(age >= 12 && age < 36){
                  if((resRt >= 20 && resRt <= 30 ) &&
                  ( heartRt >= 80  && heartRt <= 130 ) && 
                  ( bp >= 80  && bp<= 110 ) && (wt >= 10  && wt <= 14  ) &&
                 (wtp >= 22  && wtp <= 31)){
                    return true;
                }      
        }        
        
        
        // Preschooler (3-5 years)

        if(age >= 36 && age <= 60){
                  if((resRt >= 20 && resRt <= 30 ) &&
                  ( heartRt >= 80  && heartRt <= 120 ) && 
                  ( bp >= 80  && bp<= 110) && (wt >= 14 && wt <= 18) &&
                 (wtp >= 31 && wtp <= 40)){
                    return true;
                }      
        }        




        
        // School age (6-12)

        if(age >= 72  && age <= 144){
                  if((resRt >= 20 && resRt <= 30) && 
                  ( heartRt >= 70 && heartRt <= 110) && 
                  ( bp >= 80 && bp<= 120) && (wt >= 20 && wt <= 42) &&
                 (wtp >= 40 && wtp <= 93)){
                    return true;
                }      
        }        


        
        
        // Adolescent (13+)
        
        if(age >= 156){
                  if((resRt >= 12 && resRt <= 20) && 
                  ( heartRt >= 55  && heartRt <= 105 ) && 
                  ( bp >= 110 && bp<= 120) && 
                  (wt > 50) &&
                  (wtp > 110)){
                    return true;
                }      
        }        


        
    
    return false;
    }

    
    public boolean thisVitalSignNormal(String vitalName){
        vitalName = vitalName.toLowerCase();
        // Checking for respiratory rate
        if(vitalName.equals("respiratory rate"))
        {
                int age = this.age;
                VitalSigns vitals = this.currVitalSign;
                double resRt = vitals.getRespiratoryRt();

                
                // New Born
                if(age < 1 ){            
                        if((resRt >= 30 && resRt <= 50)){
                            return true;
                        }
                }
                // Infant (1-12 months)
                if(age >= 1 && age < 12){
                          if((resRt >= 20 && resRt <= 30 )){
                            return true;
                        }      
                }


                // Toodler (1-3 years)
                if(age >= 12 && age < 36){
                          if((resRt >= 20 && resRt <= 30 )){
                            return true;
                        }      
                }        


                // Preschooler (3-5 years)

                if(age >= 36 && age <= 60){
                          if((resRt >= 20 && resRt <= 30 )){
                            return true;
                        }      
                }        





                // School age (6-12)

                if(age >= 72  && age <= 144){
                          if((resRt >= 20 && resRt <= 30)){
                            return true;
                        }      
                }        




                // Adolescent (13+)

                if(age >= 156){
                          if((resRt >= 12 && resRt <= 20)){
                            return true;
                        }      
                }        




            
            
        
        }
        
        
        
        // Checking for heart rate
        if(vitalName.equals("heart rate"))
        {
                int age = this.age;
                VitalSigns vitals = this.currVitalSign;
                double heartRt = vitals.getHeartRt();

                
                // New Born
                if(age < 1 ){            
                        if((heartRt >= 120 && heartRt <= 160)){
                            return true;
                        }
                }
                // Infant (1-12 months)
                if(age >= 1 && age < 12){
                          if((heartRt >= 80 && heartRt <= 140 )){
                            return true;
                        }      
                }


                // Toodler (1-3 years)
                if(age >= 12 && age < 36){
                          if((heartRt >= 80 && heartRt <= 130 )){
                            return true;
                        }      
                }        


                // Preschooler (3-5 years)

                if(age >= 36 && age <= 60){
                          if((heartRt >= 80 && heartRt <= 120 )){
                            return true;
                        }      
                }        

                // School age (6-12)

                if(age >= 60  && age <= 144){
                          if((heartRt >= 70 && heartRt <= 110)){
                            return true;
                        }      
                }        

                // Adolescent (13+)

                if(age >= 144){
                          if((heartRt >= 55 && heartRt <= 105)){
                            return true;
                        }      
                }              
        }
        
        
        //Checking for blood pressure
        if(vitalName.equals("blood pressure")){
                int age = this.age;
                VitalSigns vitals = this.currVitalSign;
                double bp = vitals.getSysBP();

                
                // New Born
                if(age < 1 ){            
                        if((bp >= 50 && bp <= 70)){
                            return true;
                        }
                }
                // Infant (1-12 months)
                if(age >= 1 && age < 12){
                          if((bp >= 70 && bp <= 100 )){
                            return true;
                        }      
                }


                // Toodler (1-3 years)
                if(age >= 12 && age < 36){
                          if((bp >= 80 && bp <= 110 )){
                            return true;
                        }      
                }        


                // Preschooler (3-5 years)

                if(age >= 36 && age <= 60){
                          if((bp >= 80 && bp <= 110 )){
                            return true;
                        }      
                }        





                // School age (6-12)

                if(age >= 72  && age <= 144){
                          if((bp >= 80 && bp <= 120)){
                            return true;
                        }      
                }        
                // Adolescent (13+)

                if(age >= 156){
                          if((bp >= 110 && bp <= 120)){
                            return true;
                        }      
                }        



        
        }
        
        
        // Checking for weight
        if(vitalName.equals("weight")){
                int age = this.age;
                VitalSigns vitals = this.currVitalSign;
                double wt = vitals.getWght();

                
                // New Born
                if(age < 1 ){            
                        if((wt >= 2 && wt <= 3)){
                            return true;
                        }
                }
                // Infant (1-12 months)
                if(age >= 1 && age < 12){
                          if((wt >= 4 && wt <= 10 )){
                            return true;
                        }      
                }


                // Toodler (1-3 years)
                if(age >= 12 && age < 36){
                          if((wt >= 10 && wt <= 14 )){
                            return true;
                        }      
                }        


                // Preschooler (3-5 years)

                if(age >= 36 && age <= 60){
                          if((wt >= 14 && wt <= 18 )){
                            return true;
                        }      
                }        





                // School age (6-12)

                if(age >= 60  && age <= 144){
                          if((wt >= 20 && wt <= 42)){
                            return true;
                        }      
                }        

                // Adolescent (13+)

                if(age >= 144){
                          if((wt > 50)){
                            return true;
                        }      
                }                
        }
        
        
    
    
    return false;
    }
    
    @Override
    public String toString() {
        return "Patient{" + "name=" + name + ", age=" + age/12 + ", height=" + height + ", vitalSigns=" + currVitalSign + '}';
    }
    
    
}
