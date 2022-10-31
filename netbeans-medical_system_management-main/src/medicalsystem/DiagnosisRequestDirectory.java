/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package medicalsystem;

import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author Jianpeng Ji
 */
public class DiagnosisRequestDirectory {

//    private List<DiagnosisRequest> diagnosisRequestList;

    private HashMap<String, DiagnosisRequest> diagnosisRequestMap;

    public DiagnosisRequestDirectory() {
        this.diagnosisRequestMap = new HashMap<String, DiagnosisRequest>();
    }

    public void addDiagnosisRequest(DiagnosisRequest diagnosisRequest) {
        diagnosisRequestMap.put(diagnosisRequest.getUid(), diagnosisRequest);
    }

    public void updateDiagnosisRequest(DiagnosisRequest diagnosisRequest) {
        diagnosisRequestMap.remove(diagnosisRequest.getUid());
        diagnosisRequestMap.put(diagnosisRequest.getUid(), diagnosisRequest);
    }

    public void deleteDiagnosisRequest(DiagnosisRequest diagnosisRequest) {
        diagnosisRequestMap.remove(diagnosisRequest.getUid());
    }

    public void deleteDiagnosisRequest(String diagnosisUID) {
        diagnosisRequestMap.remove(diagnosisUID);
    }

    public HashMap<String, DiagnosisRequest> getDiagnosisRequestMap() {
        return diagnosisRequestMap;
    }

    public void setDiagnosisRequestMap(HashMap<String, DiagnosisRequest> diagnosisRequestDirectory) {
        this.diagnosisRequestMap = diagnosisRequestDirectory;
    }

//    public List<DiagnosisRequest> diagnosisRequestListByDoctor(int doctorID) {
//        List<DiagnosisRequest> result = new ArrayList<DiagnosisRequest>();
//        for (DiagnosisRequest d : diagnosisRequestList) {
//            if (d.getDoctorID() == doctorID) {
//                result.add(d);
//            }
//        }
//        return result;
//    }
//
//    public List<DiagnosisRequest> diagnosisRequestListByPatient(int patientID) {
//        List<DiagnosisRequest> result = new ArrayList<DiagnosisRequest>();
//        for (DiagnosisRequest d : diagnosisRequestList) {
//            if (d.getPatientID() == patientID) {
//                result.add(d);
//            }
//        }
//        return result;
//    }

}
