package com.Ambulance.demo;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;

class RestRepositoryTest {

	@Test
	void test() {
		DbService crud = new DbService();
		assertNotEquals(null,crud, "Repository needs to be instantiated with the new class.");
		//fail("Not yet implemented");
	}
	
	@Test
	void PostTest() {
		DbService crud = new DbService();
		fail("Not yet implemented");
	}
	
	@Test
	void GetTest() {
		//DbService rest = new DbService();
		DbService rest = mock(DbService.class);
		
		RestRepository restRepo = mock(RestRepository.class);
		Ambulance amb = new Ambulance();
		amb.setId((long)20);
		amb.setxCoord((long) 14);
		amb.setyCoord((long) 55);
		//rest.saveAmbulance(amb);
		restRepo.save(amb);
		Optional<Ambulance> ambReq = restRepo.findById((long)20);//Optional<Ambulance> ambReq = rest.getAmbulance((long) 20);
		Ambulance ambResult = ambReq.get();
		assertEquals(ambReq, amb, "All values of Ambulances need to be the same after a post and subsequent get.");
	}
	
	@Test
	void GetAllTest() {
		DbService crud = new DbService();
		fail("Not yet implemented");

	}
	
	@Test
	void PutTest() {
		DbService crud = new DbService();
		fail("Not yet implemented");

	}

}
