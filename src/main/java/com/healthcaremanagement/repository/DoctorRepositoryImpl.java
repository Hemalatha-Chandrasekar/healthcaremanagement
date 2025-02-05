package com.healthcaremanagement.repository;

import com.healthcaremanagement.model.Doctor;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.List;

public class DoctorRepositoryImpl {

    private SessionFactory sessionFactory;

    // Constructor to initialize SessionFactory
    public DoctorRepositoryImpl() {
        // Assuming Hibernate configuration is in hibernate.cfg.xml
        this.sessionFactory = new Configuration().configure().addAnnotatedClass(Doctor.class).buildSessionFactory();
    }

    // Create Method
    public void createDoctor(Doctor doctor) {
        Session session = sessionFactory.openSession();
        Transaction transaction = null;
        // Begin a transaction
        transaction = session.beginTransaction();
        // Save the doctor object
        session.save(doctor);
        // Commit the transaction
        transaction.commit();
        session.close(); // Ensure session is closed
    }
    // Read Method
    public void getDoctorById(int doctorId) {
        Session session = sessionFactory.openSession();
        Doctor doctor = null;
        // Get the doctor object using primary key
        doctor = session.get(Doctor.class, doctorId);
        session.close();
    }
    // Update Method
    public void updateDoctor(Doctor doctor) {
        Session session = sessionFactory.openSession();
        Transaction transaction = null;
        transaction = session.beginTransaction();
        session.update(doctor);
        transaction.commit();
        session.close();
    }
    // Delete Method
    public void deleteDoctorById(int doctorId) {
        Session session = sessionFactory.openSession();
        Doctor doctor = null;
        Transaction transaction = null;
        transaction = session.beginTransaction();
        // Get the doctor object to delete
        doctor = session.get(Doctor.class, doctorId);
        session.delete(doctor);
        transaction.commit();
        session.close();
    }
    // List All Doctors Method
    public List<Doctor> getAllDoctors() {
        Session session = sessionFactory.openSession();
        List<Doctor> doctors = null;
        Query<Doctor> query = session.createQuery("from Doctor", Doctor.class);
        doctors = query.list();
        session.close();
        return doctors;
    }


}