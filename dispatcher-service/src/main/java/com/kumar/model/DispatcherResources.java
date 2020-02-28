package com.kumar.model;

import java.util.ArrayList;

public class DispatcherResources {
    ArrayList<Patient> patientList = new ArrayList<Patient>();
    ArrayList<Hospital> hospitalList = new ArrayList<Hospital>();
    ArrayList<Ambulance> ambulanceList = new ArrayList<Ambulance>();

    public DispatcherResources() {
    }

    public ArrayList<Patient> getPatientList() {
        // This is where the service call to Patient list
        return patientList;
    }

    public void setPatientList(ArrayList<Patient> patientList) {
        this.patientList = patientList;
    }

    public ArrayList<Hospital> getHospitalList() {
        // This is where the service call to Hospital list

        return hospitalList;
    }

    public void setHospitalList(ArrayList<Hospital> hospitalList) {
        this.hospitalList = hospitalList;
    }

    public ArrayList<Ambulance> getAmbulanceList() {
        // This is where the service call to Ambulance list

        return ambulanceList;
    }

    public void setAmbulanceList(ArrayList<Ambulance> ambulanceList) {
        this.ambulanceList = ambulanceList;
    }
}
