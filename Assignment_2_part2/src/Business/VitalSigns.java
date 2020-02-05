/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.Date;

/**
 *
 * @author Rohit
 */
public class VitalSigns {
    private double respiratoryRt;
    private double heartRt;
    private double sysBP;
    private double wght;
    private double wghtP;
    private Date date;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    

    public VitalSigns(double respiratoryRt, double heartRt, double sysBP, double wght, Date date) {
        this.respiratoryRt = respiratoryRt;
        this.heartRt = heartRt;
        this.sysBP = sysBP;
        this.wght = wght;
        this.wghtP = 2.2 * wght;
        this.date = date;
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

    @Override
    public String toString() {
        return "\nVitalSigns{" + "\nrespiratoryRt=" + respiratoryRt + "\n, heartRt=" + heartRt + "\n, sysBP=" + sysBP + "\n, wght=" + wght + "\n, wghtP=" + wghtP + '}';
    }
    
    
    
    
}
