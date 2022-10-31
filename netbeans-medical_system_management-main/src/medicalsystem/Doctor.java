package medicalsystem;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Jianpeng Ji
 */
public class Doctor extends Person implements Comparable<Doctor>{

    private String hospitalName;
    private String medicalDepartment;
    private DiagnosisRequestDirectory diagnosisRequestDirectory;
    private EncounterHistory encounterHistory;
    private int yearsOfExperience;
    private String community;
    public Doctor(int id, String firstName, String lastName,String hospitalName, String medicalDepartment) {
        super(id, firstName, lastName);
        this.hospitalName = hospitalName;
        this.medicalDepartment = medicalDepartment;
    }
    
    public Doctor(int id, String firstName, String lastName) {
        super(id, firstName, lastName);
    }

    public String getCommunity() {
        return community;
    }

    public void setCommunity(String community) {
        this.community = community;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    
    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public DiagnosisRequestDirectory getDiagnosisRequestDirectory() {
        return diagnosisRequestDirectory;
    }

    public void setDiagnosisRequestDirectory(DiagnosisRequestDirectory diagnosisRequestDirectory) {
        this.diagnosisRequestDirectory = diagnosisRequestDirectory;
    }

    public EncounterHistory getEncounterHistory() {
        return encounterHistory;
    }

    public void setEncounterHistory(EncounterHistory encounterHistory) {
        this.encounterHistory = encounterHistory;
    }

   
    public String getMedicalDepartment() {
        return medicalDepartment;
    }

    public void setMedicalDepartment(String medicalDepartment) {
        this.medicalDepartment = medicalDepartment;
    }

    @Override
    public int compareTo(Doctor d) {
        if (super.getId()== d.getId())
            return 0;
        else if (super.getId() > d.getId())
            return 1;
        else
            return -1;
    
    }
    
    

}
