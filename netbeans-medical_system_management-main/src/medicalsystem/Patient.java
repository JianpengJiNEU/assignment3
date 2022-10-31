/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medicalsystem;


/**
 *
 * @author TT
 */
public class Patient extends Person {
    
    
    private EncounterHistory encounterHistory;
    private DiagnosisRequestDirectory diagnosisRequestDirectory;

    public Patient(int id, int age, String firstName, String lastName, int residenceId, int communityId) {
        super(id, age, firstName, lastName, residenceId, communityId);
        this.encounterHistory = new EncounterHistory();
        this.diagnosisRequestDirectory = new DiagnosisRequestDirectory();
    }

    public Patient(int id, String firstName, String lastName) {
        super(id, firstName, lastName);
        this.encounterHistory = new EncounterHistory();
        this.diagnosisRequestDirectory = new DiagnosisRequestDirectory();
    }
    

    public EncounterHistory getEncounterHistory() {
        return encounterHistory;
    }

    public void setEncounterHistory(EncounterHistory encounterHistory) {
        this.encounterHistory = encounterHistory;
    }
          
            
}
