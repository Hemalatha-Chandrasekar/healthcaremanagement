package com.healthcaremanagement.service;

import com.healthcaremanagement.model.Doctor;
import com.healthcaremanagement.repository.DoctorRepositoryImpl;

import java.util.List;

public class DoctorService {
    private DoctorRepositoryImpl doctorRepositoryImpl;

    // Constructor
    public DoctorService() {
        this.doctorRepositoryImpl = new DoctorRepositoryImpl();
    }

    // Create a new doctor
    public void createDoctor(Doctor doctor) {
        doctorRepositoryImpl.createDoctor(doctor);
    }

    // Get a doctor by ID
    public Doctor getDoctorById(int doctorId) {
        return getDoctorById(doctorId);
    }
// Update a doctor
    public void updateDoctor(Doctor doctor) {
        doctorRepositoryImpl.updateDoctor(doctor);
    }
    // Delete a doctor
    public void deleteDoctor(int doctorId) {
        doctorRepositoryImpl.deleteDoctorById(doctorId);
    }
    // Get all doctors
    public List<Doctor> getAllDoctors() {
        return doctorRepositoryImpl.getAllDoctors();
    }

}