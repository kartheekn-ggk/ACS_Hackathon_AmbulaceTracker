package com.kumar.patientservice.model;

import java.util.HashMap;

public class PatientResource {
    private static HashMap<Integer,Patient> patientList = new  HashMap<Integer,Patient>() ;

    public PatientResource() {
        this.init();
    }

    private void  init(){
        patientList.put(1, new Patient("Anderson", 1,10, 20));
        patientList.put(2, new Patient("Anderson", 2,10, 20));
        patientList.put(3, new Patient("Anderson", 3,10, 20));
        patientList.put(4, new Patient("Anderson", 4,10, 20));
        patientList.put(4, new Patient("Anderson", 5,10, 20));
    }
    public static HashMap<Integer, Patient> getPatientList() {
        return patientList;
    }

    public static void setPatientList(HashMap<Integer, Patient> patientList) {
        PatientResource.patientList = patientList;
    }
}
