package com.practice.registration.entity;


import jakarta.persistence.*;

@Entity
@Table(name = "user_info")
public class user {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int empId;
    private String name;
    private String email;
    private String details;

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "user{" +
                "id=" + id +
                ", empId=" + empId +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", details='" + details + '\'' +
                '}';
    }
}
