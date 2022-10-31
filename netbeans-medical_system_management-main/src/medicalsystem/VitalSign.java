/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medicalsystem;

/**
 *
 * @author Jianpneg Ji
 */
public class VitalSign {
    
    private int highPressure;
    private int lowPressure;
    private double bodyTemperature;
    private double pulseRate;
    private double respirationRate;

    public VitalSign(int highPressure, int lowPressure) {
        this.highPressure = highPressure;
        this.lowPressure = lowPressure;
    }

    public VitalSign(double bodyTemperature, double pulseRate, double respirationRate) {
        this.bodyTemperature = bodyTemperature;
        this.pulseRate = pulseRate;
        this.respirationRate = respirationRate;
    }

    public VitalSign(int highPressure, int lowPressure, double bodyTemperature, double pulseRate, double respirationRate) {
        this.highPressure = highPressure;
        this.lowPressure = lowPressure;
        this.bodyTemperature = bodyTemperature;
        this.pulseRate = pulseRate;
        this.respirationRate = respirationRate;
    }
    
    
    public int getHighPressure() {
        return highPressure;
    }

    public void setHighPressure(int highPressure) {
        this.highPressure = highPressure;
    }

    public int getLowPressure() {
        return lowPressure;
    }

    public void setLowPressure(int lowPressure) {
        this.lowPressure = lowPressure;
    }

    public double getBodyTemperature() {
        return bodyTemperature;
    }

    public void setBodyTemperature(double bodyTemperature) {
        this.bodyTemperature = bodyTemperature;
    }

    public double getPulseRate() {
        return pulseRate;
    }

    public void setPulseRate(double pulseRate) {
        this.pulseRate = pulseRate;
    }

    public double getRespirationRate() {
        return respirationRate;
    }

    public void setRespirationRate(double respirationRate) {
        this.respirationRate = respirationRate;
    }
    
    
}
