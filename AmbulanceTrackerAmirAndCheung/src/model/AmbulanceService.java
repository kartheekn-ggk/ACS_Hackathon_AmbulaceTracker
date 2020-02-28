package cho.hackathon.model;

import java.io.IOException;
import java.util.Date;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import cho.hackathon.data.AmbulanceStatusResponse;
import cho.hackathon.data.Response;



@Service
@RestController
@RequestMapping("/ambulance")

public class AmbulanceService {

	private final AtomicLong counter = new AtomicLong();

	
	public AmbulanceService() {
		// TODO Auto-generated constructor stub
	}

	

	@GetMapping(path="/{ambulanceId}") 
	@ResponseBody
	public AmbulanceStatusResponse getAmbulanceStatus (@PathVariable("ambulanceId") final String ambulanceId ) throws IOException {
		System.out.println("receive /execute/" + ambulanceId );
		AmbulanceStatusResponse resp = new AmbulanceStatusResponse();
		resp.setRequestStatus("SUCCESS");
		resp.setTransactionId(new Date().toString());
		resp.setAmbulanceId(ambulanceId);
		resp.setPatienceStatus("Severe");
		resp.setEtaOfAmbulance("etaOfAmbulance");
		return resp;
	}

	
	
//@PostMapping(path="/hello", produces="application/json",consumes ="application/json")

	@GetMapping(path="/hello")
	@ResponseBody
	public Response sayHello(@RequestParam(name="name", required=false,defaultValue="defaultvalue") String name) {
		System.out.println("getting request on /hello");
		return new Response("OK",name, ""+counter.incrementAndGet());
	}
	
	
}
