/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medicalsystem;

import java.util.HashMap;

/**
 *
 * @author Jianpeng Ji
 */
public class EncounterHistory {
    
    private HashMap<String, Encounter> encounterMap;

    public EncounterHistory() {
        this.encounterMap = new HashMap<String, Encounter>();
    }
    
    public void addEncounter(Encounter encounter) {
        encounterMap.put(encounter.getId(), encounter);
    }
    public void addEncounter(int highPressure, int lowPressure, String encounterId, int doctorId, int patientId) {
        VitalSign vitalSign = new VitalSign(highPressure, lowPressure);
        Encounter encounter = new Encounter(encounterId,  doctorId, patientId, vitalSign);
        encounterMap.put(encounter.getId(), encounter);
    }
    
    
    public void updateEncounter(Encounter encounter) {
        encounterMap.remove(encounter.getId());
        encounterMap.put(encounter.getId(), encounter);
    }
    public void deleteEncounter(Encounter encounter) {
        encounterMap.remove(encounter.getId(), encounter);
    }

    public HashMap<String, Encounter> getEncounterMap() {
        return encounterMap;
    }

    public void setEncounterMap(HashMap<String, Encounter> encounterHistory) {
        this.encounterMap = encounterHistory;
    }
    
    
    
            
}
