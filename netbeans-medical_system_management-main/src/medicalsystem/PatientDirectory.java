/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medicalsystem;

import java.util.HashMap;

/**
 *
 * @author TT
 */
public class PatientDirectory {
    
    
    private HashMap<Integer, Patient> patientMap;

    public PatientDirectory() {
        this.patientMap = new HashMap<Integer, Patient>();
    }
    
    public void addPatient(Patient patient) {
        patientMap.put(patient.getId(), patient);
    }
    public void updatePatient(Patient patient){
        patientMap.remove(patient.getId());
        patientMap.put(patient.getId(), patient);
    }
    public void deletePatient(Patient patient) {
        patientMap.remove(patient.getId());
    }
    public void deletePatient(Integer patientId) {
        patientMap.remove(patientId);
    }

    public HashMap<Integer, Patient> getPatientMap() {
        return patientMap;
    }

    public void setPatientMap(HashMap<Integer, Patient> patientDirectory) {
        this.patientMap = patientDirectory;
    }
    
}
