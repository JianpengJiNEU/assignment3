/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medicalsystem;

import java.util.Objects;

/**
 *
 * @author Jianpeng Ji
 */
public class Encounter {
    
    private String id;
    private VitalSign vitalSign;
    private int doctorId;
    private int patientId;
    private String date;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    

    public Encounter(String id, int doctorId, int patientId, VitalSign vitalSign) {
        this.doctorId = doctorId;
        this.patientId = patientId;
        this.vitalSign = vitalSign;
        this.id = id;
    }
    
    public Encounter(String date, String id, int doctorId, int patientId, VitalSign vitalSign) {
        this.date = date;
        this.doctorId = doctorId;
        this.patientId = patientId;
        this.vitalSign = vitalSign;
        this.id = id;
    }

    public Encounter(String id) {
        this.id = id;
    }
    

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public VitalSign getVitalSign() {
        return vitalSign;
    }

    public void setVitalSign(VitalSign vitalSign) {
        this.vitalSign = vitalSign;
    }

    public int getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(int doctorId) {
        this.doctorId = doctorId;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }
    
    @Override
    public String toString(){
        return date;
    
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Encounter other = (Encounter) obj;
        if (this.doctorId != other.doctorId) {
            return false;
        }
        if (this.patientId != other.patientId) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.date, other.date)) {
            return false;
        }
        return Objects.equals(this.vitalSign, other.vitalSign);
    }
    
    
}
