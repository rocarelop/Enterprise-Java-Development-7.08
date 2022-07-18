package com.ironhack.lab708.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {

    @Id
    private long id;
    private String name;
    private String phoneNumber;
    private int officeNumber;
    private String position;
    private String manager;

    public Employee() {
    }

    public Employee(String name, String phoneNumber, int officeNumber, String position, String manager) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.officeNumber = officeNumber;
        this.position = position;
        this.manager = manager;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getOfficeNumber() {
        return officeNumber;
    }

    public void setOfficeNumber(int officeNumber) {
        this.officeNumber = officeNumber;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }
}
