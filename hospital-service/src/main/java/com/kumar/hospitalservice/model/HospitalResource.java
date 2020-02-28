package com.kumar.hospitalservice.model;

import java.util.ArrayList;

public class HospitalResource {
    private ArrayList<Hospital> hospitalList = new ArrayList<Hospital>();;

    public HospitalResource(ArrayList<Hospital> hospitalList) {
        this.hospitalList = hospitalList;
    }

    public HospitalResource() {
//        hospitalList.add(new Hospital(102, "Seaton", 400, 560, true));
//        hospitalList.add(new Hospital(103, "Seaton", 400, 560, true));
//        hospitalList.add(new Hospital(104, "Seaton", 400, 560, true));
//        hospitalList.add(new Hospital(105, "Seaton", 400, 560, true));
    }

    public ArrayList<Hospital> getHospitalList() {
        return hospitalList;
    }

    public void setHospitalList(ArrayList<Hospital> hospitalList) {
        this.hospitalList = hospitalList;
    }

    public Hospital addHospital(com.kumar.hospitalservice.model.Hospital hospital){
          hospitalList.add(hospital);
          return hospital;
    }
}
