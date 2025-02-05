package com.healthcaremanagement.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table

public class Dotor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name="DoctorID")
    private int doctorId;

    @Column(name="FirstName")
    private String firstname;

    @Column(name = "LastName")
    private String lastname;

    @Column(name="Specialty")
    private String specialty;

    @Column(name="Email")
    private String email;

    public int getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(int doctorId) {
        this.doctorId = doctorId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    @Override
    public String toString() {
        return "Dotor{" +
                "doctorId=" + doctorId +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", specialty='" + specialty + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
