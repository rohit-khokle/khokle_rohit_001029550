/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author Rohit
 */
public class PersonalInfo {
   private DemoInfo demoInfo;
   private AddressInfo addInfo;
   private CheckAccountInfo checkAccInfo;
   private SavingsAccountInfo savingsAccInfo;
   private MedicalInfo medInfo;
   private DriversLicenceInfo driversLicInfo;

   public PersonalInfo(DemoInfo demoInfo, AddressInfo addInfo, CheckAccountInfo checkAccInfo, SavingsAccountInfo savingsAccInfo, MedicalInfo medInfo, DriversLicenceInfo driversLicInfo)
   {
       this.demoInfo = demoInfo;
       this.addInfo = addInfo;
       this.checkAccInfo = checkAccInfo;
       this.savingsAccInfo = savingsAccInfo;
       this.medInfo = medInfo;
       this.driversLicInfo = driversLicInfo;
   
   
   }
   
   
   
    public DemoInfo getDemoInfo() {
        return demoInfo;
    }

    public DriversLicenceInfo getDriversLicInfo() {
        return driversLicInfo;
    }

    public void setDriversLicInfo(DriversLicenceInfo driversLicInfo) {
        this.driversLicInfo = driversLicInfo;
    }

    public void setDemoInfo(DemoInfo demoInfo) {
        this.demoInfo = demoInfo;
    }

    public AddressInfo getAddInfo() {
        return addInfo;
    }

    public void setAddInfo(AddressInfo addInfo) {
        this.addInfo = addInfo;
    }

    public CheckAccountInfo getCheckAccInfo() {
        return checkAccInfo;
    }

    public void setCheckAccInfo(CheckAccountInfo checkAccInfo) {
        this.checkAccInfo = checkAccInfo;
    }

    public SavingsAccountInfo getSavingsAccInfo() {
        return savingsAccInfo;
    }

    public void setSavingsAccInfo(SavingsAccountInfo savingsAccInfo) {
        this.savingsAccInfo = savingsAccInfo;
    }

    public MedicalInfo getMedInfo() {
        return medInfo;
    }

    public void setMedInfo(MedicalInfo medInfo) {
        this.medInfo = medInfo;
    }
   
   
    
    
}
