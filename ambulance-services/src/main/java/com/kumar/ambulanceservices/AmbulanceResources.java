package com.kumar.ambulanceservices;

import java.util.ArrayList;

public class AmbulanceResources {
    private ArrayList<Ambulance> ambulances = new ArrayList<Ambulance>();

    public AmbulanceResources() {
        ambulances.add(new Ambulance(1, "Camel", true, 20, 40));
        ambulances.add(new Ambulance(2, "Camel", true, 20, 40));
        ambulances.add(new Ambulance(3, "Camel", true, 20, 40));
        ambulances.add(new Ambulance(4, "Camel", true, 20, 40));
    }

    public AmbulanceResources(ArrayList<Ambulance> ambulances) {
        this.ambulances = ambulances;
    }

    public ArrayList<Ambulance> getAmbulances() {
        return ambulances;
    }

    public void setAmbulances(ArrayList<Ambulance> ambulances) {
        this.ambulances = ambulances;
    }
}
