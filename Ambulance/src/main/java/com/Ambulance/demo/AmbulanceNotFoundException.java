package com.Ambulance.demo;

class AmbulanceNotFoundException extends RuntimeException {

	AmbulanceNotFoundException(Long id) {
	    super("Could not find ambulance " + id);
	  }
	}