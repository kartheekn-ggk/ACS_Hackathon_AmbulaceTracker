import net.minidev.json.JSONObject;
import net.minidev.json.parser.JSONParser;
import net.minidev.json.parser.ParseException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class AmbulanceService {
    RestClient restClient = new RestClient();

    // updateAmbulanceStatus

    @RequestMapping(value="/{AmbulanceId}/status", method= RequestMethod.PUT)
    public void updateAmbulanceStatus (Ambulance ambulance) {
        // STORE THIS IN SQL SERVER ambulance.setDestination();
    }

    @RequestMapping(value="/{AmbulanceId}/status/ETA", method= RequestMethod.GET)
    public void ETAOfAmbulance (Ambulance ambulance) throws FileNotFoundException, ParseException {
        String st ="";
        String wholeJSON = restClient.get("https://maps.googleapis.com/maps/api/distancematrix/json?origin="+ ambulance.getLatitude()+","+ambulance.getLongitude()+"&destination="+ambulance.getDestination()+"&key=AIzaSyAMvz10odETnRkFHvrOYeUtlIVzAKns6lU");
        Object obj = new JSONParser().parse(new FileReader(wholeJSON));
        JSONObject jo = (JSONObject) obj;
        String duration = (String) jo.get("duration");

        // assign duration to eta in ambulance database
    }

}
