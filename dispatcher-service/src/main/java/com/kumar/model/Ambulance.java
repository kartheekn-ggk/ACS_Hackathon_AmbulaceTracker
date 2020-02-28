package com.kumar.model;

public class Ambulance implements Location{
    private Integer id;
    private String name;
    private boolean available =false;
    private float x, y;

    public Ambulance(Integer id, String name, boolean available, float x, float y) {
        this.id = id;
        this.name = name;
        this.available = available;
        this.x = x;
        this.y = y;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    @Override
    public void setCordinates(float x, float y) {
        this.x = x;
        this.y = y;
    }
}
