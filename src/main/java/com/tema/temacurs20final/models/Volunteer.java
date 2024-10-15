package com.tema.temacurs20final.models;

public class Volunteer {
    private String name;
    private String email;
    private String phone;
    private String event;

    // Constructor
    public Volunteer() {}

    public Volunteer(String name, String email, String phone, String event) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.event = event;
    }

    // Getters and Setters
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }
}