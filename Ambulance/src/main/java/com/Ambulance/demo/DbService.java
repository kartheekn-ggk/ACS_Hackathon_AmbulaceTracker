package com.Ambulance.demo;

//import com.Ambulance.demo.RestRepository;
//import com.Ambulance.demo.Ambulance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DbService {
    @Autowired
    private RestRepository repository;

    public List<Ambulance> getAllAmbulances() {
        return repository.findAll();
    }

    public Optional<Ambulance> getAmbulance(final Long id) {
        return repository.findById(id);
    }

    public void deleteAmbulance(final Long id) {
        repository.deleteById(id);
    }

    public Ambulance saveAmbulance(final Ambulance amb) {
        return repository.save(amb);
    }
}
