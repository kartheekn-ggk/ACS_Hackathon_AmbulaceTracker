package com.kumar.patientservice.controler;

import com.kumar.patientservice.model.Patient;
import com.kumar.patientservice.model.PatientResource;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
@RequestMapping(value = "/patient")
public class PatientController {

    @GetMapping("/all")
    public HashMap<Integer, Patient> getList(){
        PatientResource patientList = new PatientResource();
        return patientList.getPatientList();
    }

    @GetMapping("{id}")
    public Patient get(@PathVariable(value = "id") Integer id) {
        PatientResource patientList = new PatientResource();
        return patientList.getPatientList().get(id);
    }

    @PostMapping("/add")
    public boolean add(@RequestBody Patient patient){
        PatientResource patientList = new PatientResource();
        if(null !=patientList.getPatientList().put(1, patient)){
            return true;
        }
        return false;
    }

    public PatientController() {
    }
}
