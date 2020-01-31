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
public class VitalSigns {
    double respiratoryRt;
    double heartRt;
    double sysBP;
    double wght;
    double wghtP;

    public VitalSigns(double respiratoryRt, double heartRt, double sysBP, double wght, double wghtP) {
        this.respiratoryRt = respiratoryRt;
        this.heartRt = heartRt;
        this.sysBP = sysBP;
        this.wght = wght;
        this.wghtP = wghtP;
    }

    public double getRespiratoryRt() {
        return respiratoryRt;
    }

    public void setRespiratoryRt(float respiratoryRt) {
        this.respiratoryRt = respiratoryRt;
    }

    public double getHeartRt() {
        return heartRt;
    }

    public void setHeartRt(float heartRt) {
        this.heartRt = heartRt;
    }

    public double getSysBP() {
        return sysBP;
    }

    public void setSysBP(float sysBP) {
        this.sysBP = sysBP;
    }

    public double getWght() {
        return wght;
    }

    public void setWght(float wght) {
        this.wght = wght;
    }

    public double getWghtP() {
        return wghtP;
    }

    public void setWghtP(float wghtP) {
        this.wghtP = wghtP;
    }
    
    
    
    
}
