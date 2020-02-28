package com.kumar.hospitalservice.controller;

import com.kumar.hospitalservice.model.Hospital;
import com.kumar.hospitalservice.model.HospitalResource;
import com.kumar.hospitalservice.model.Patient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping(value = "/hospital")
public class HospitalController {

    @GetMapping("/all")
    public ArrayList<Hospital> getPatientsList(){
        HospitalResource hospitalResource = new HospitalResource();
        return hospitalResource.getHospitalList();
    }

    @PostMapping
    public Hospital addHospital(@PathVariable  Hospital hospitalh){
        HospitalResource hospitalResource = new HospitalResource();
        return hospitalResource.addHospital(hospitalh);
    }
}
