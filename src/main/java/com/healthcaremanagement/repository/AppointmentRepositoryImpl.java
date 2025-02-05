package com.healthcaremanagement.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class AppointmentRepositoryImpl {
    private SessionFactory sessionFactory;

//    public SessionFactory (sessionFactory) {
//        this.sessionFactory = sessionFactory;
//    }
    public AppointmentRepositoryImpl() {
        this.sessionFactory = new Configuration().configure().buildSessionFactory();
    }

    public void createDoctor(Doctor doctor) {
        try (Session session = sessionFactory.openSession()) {
            Transaction transaction = session.beginTransaction();
            session.persist(doctor);
            transaction.commit();
        }
    }

    public Doctor getDoctorById(int id) {
        try (Session session = sessionFactory.openSession()) {
            return session.get(Doctor.class, id);
        }
    }

    public void updateDoctor(Doctor doctor) {
        try (Session session = sessionFactory.openSession()) {
            Transaction transaction = session.beginTransaction();
            session.update(doctor);
            transaction.commit();
        }
    }

    public void deleteDoctorById(int id) {
        try (Session session = sessionFactory.openSession()) {
            Transaction transaction = session.beginTransaction();
            Doctor doctor = session.get(Doctor.class, id);
            session.delete(doctor);
            transaction.commit();
        }

    }

    public List<Doctor> getAllDoctors() {
        try (Session session = sessionFactory.openSession()) {
            return session.createQuery("from Doctor",Doctor.class).list();
        }
    }
}