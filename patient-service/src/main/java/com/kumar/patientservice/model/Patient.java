package com.kumar.patientservice.model;

public class Patient implements Location{
    String name;
    int id;
    float x, y;

    public Patient() {
    }

    public Patient(String name, int id, float a, float y) {
        this.name = name;
        this.x = x;
        this.y = y;
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

    @Override
    public void setCordinates(float x, float y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}
