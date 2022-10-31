/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package medicalsystem;

import java.util.HashMap;

/**
 *
 * @author Jianpeng Ji
 */
public class DoctorDirectory {

    private HashMap<Integer, Doctor> doctorMap;

    public DoctorDirectory() {
        this.doctorMap = new HashMap<Integer, Doctor>();
    }

    public void addDoctor(Doctor doctor) {
        doctorMap.put(doctor.getId(), doctor);
    }

    public void updateDoctor(Doctor doctor) {
        doctorMap.remove(doctor.getId());
        doctorMap.put(doctor.getId(), doctor);
    }

    public void deleteDoctor(Doctor doctor) {
        doctorMap.remove(doctor.getId());
    }

    public void deleteDoctor(Integer doctorId) {
        doctorMap.remove(doctorId);
    }

    public HashMap<Integer, Doctor> getDoctorMap() {
        return doctorMap;
    }

    public void setDoctorMap(HashMap<Integer, Doctor> doctorDirectory) {
        this.doctorMap = doctorDirectory;
    }

}
