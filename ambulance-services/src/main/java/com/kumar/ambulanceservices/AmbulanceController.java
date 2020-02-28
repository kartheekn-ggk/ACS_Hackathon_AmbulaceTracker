package com.kumar.ambulanceservices;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/ambulance")
public class AmbulanceController {
    @GetMapping("/all")
    public ArrayList<Ambulance> getAll(){
        AmbulanceResources ambulanceResources = new  AmbulanceResources();
        return ambulanceResources.getAmbulances();
    }
    @GetMapping("/{id}")
    public Ambulance get(@PathVariable(value = "id") Integer id){
        AmbulanceResources ambulanceResources = new  AmbulanceResources();
        return ambulanceResources.getAmbulances().get(id);
    }
}
