package com.kumar.model;

public class Hospital implements Location{
    private Integer id;
    private String name;
    private boolean available =false;
    private float x, y;

    public Hospital(Integer id, String name, int x, int y, boolean available) {
        this.id = id;
        this.name = name;
        this.available= available;
    }
    public Hospital() {}

    @Override
    public void setCordinates(float x, float y) {
        this.x = x;
        this.y = y;
    }
}
