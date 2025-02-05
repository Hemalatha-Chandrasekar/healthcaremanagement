package com.healthcaremanagement.service;

import com.healthcaremanagement.model.Appointment;
import com.healthcaremanagement.repository.AppointmentRepositoryImpl;

import java.util.List;

public class AppointmentService {
    private AppointmentRepositoryImpl appointmentRepository;

    public AppointmentService(){
        this.appointmentRepository = new AppointmentRepositoryImpl();
    }
    public void createAppointment(Appointment appointment){
        appointmentRepository.createAppointment(appointment);
    }

    public Appointment getAppointmentById(int appointmentId){
        return appointmentRepository.getAppointmentById(appointmentId);
    }

    public void updateAppointment(Appointment appointment){
        appointmentRepository.updateAppointment(appointment);
    }

    public void deleteAppointment(int appointmentId){
        appointmentRepository.deleteAppointment(appointmentId);
    }

    public List<Appointment> getAllAppointments() {
        return appointmentRepository.getAllAppointments();
    }
}
