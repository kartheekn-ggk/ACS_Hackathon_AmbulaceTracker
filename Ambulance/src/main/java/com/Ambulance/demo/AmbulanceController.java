package com.Ambulance.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping("/api/v1/ambulances")
public class AmbulanceController {
	//RestRepository repo = new RestRepository();
	@Autowired
    private DbService service = new DbService();
	
	@RequestMapping(method = RequestMethod.GET, value = "")
	public List<Ambulance> getAmbulance() {
		return service.getAllAmbulances();
		
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "{Id}")
	public Optional<Ambulance> getAmbulance(@PathVariable Long Id) {
		return service.getAmbulance(Id);
		
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "")
    public Ambulance updateAmbulance(@RequestBody Ambulance ambul) {
        return service.saveAmbulance(ambul);
    }
	
	@RequestMapping(method = RequestMethod.POST, value = "", consumes = APPLICATION_JSON_VALUE)
    public void createTask(@RequestBody Ambulance ambul) {
        service.saveAmbulance(ambul);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "{Id}")
    public void deleteTask(@PathVariable Long Id) {
        service.deleteAmbulance(Id);
    }
}
