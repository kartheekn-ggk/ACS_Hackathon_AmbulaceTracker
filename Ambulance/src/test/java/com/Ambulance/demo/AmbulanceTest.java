package com.Ambulance.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AmbulanceTest {
	
	@Test
	void testVarsId() {
		Ambulance amb = new Ambulance();
		assertEquals(null,amb.getId(), "Location must start with null ID before it gets set.");
	}

	@Test
	void testVarsxCoord() {
		Ambulance amb = new Ambulance();
		assertEquals(0,amb.getxCoord(), "Location must start with a default X coordinate");
	}
	
	@Test
	void testVarsyCoord() {
		Ambulance amb = new Ambulance();
		assertEquals(0,amb.getyCoord(), "Location must start with a default Y coordinate");
	}
}
