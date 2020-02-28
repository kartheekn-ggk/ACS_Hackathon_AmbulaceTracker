package com.kumar.dispatcherservice.controler;

import com.kumar.model.Ambulance;
import com.kumar.model.DispatcherResources;
import com.kumar.model.Hospital;
import com.kumar.model.Patient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping(value = "/dispatcher")
public class DispatcherController{
    DispatcherResources dispatcherResources = new DispatcherResources();
    @GetMapping("/all/patients")
    public ArrayList<Patient> getAllPatients(){
        return dispatcherResources.getPatientList();
    }
    @GetMapping("/all/hospitals")
    public ArrayList<Hospital> getAllHospitals(){
        return dispatcherResources.getHospitalList();
    }
    @GetMapping("/all/ambulances")
    public ArrayList<Ambulance> getAllAmbulances(){
        return dispatcherResources.getAmbulanceList();
    }

    public boolean addPatientToPatientList(Patient p){
        return dispatcherResources.getPatientList().add(p);
    }
    public boolean assignAmbulance(){
        // Get the Ambulance list and select the available Ambulance and nearer hospital and
        // dispatch.
        return false;
    }
}