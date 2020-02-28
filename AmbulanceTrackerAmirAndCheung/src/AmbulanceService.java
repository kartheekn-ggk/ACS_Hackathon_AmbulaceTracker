public class AmbulanceService {
    RestClient restClient = new RestClient();
    // updateAmbulanceStatus
    public void updateAmbulanceStatus (Ambulance ambulance) {

    }

    public String ETAOfAmbulance (Ambulance ambulance) {
        String wholeJSON = restClient.get("https://maps.googleapis.com/maps/api/directions/json?origin="+ ambulance.getLatitude()+","+ambulance.getLongitude()+"&destination="+ambulance.getDestination()+"&key=AIzaSyAMvz10odETnRkFHvrOYeUtlIVzAKns6lU");
        String lengthOfTime = wholeJSON.
    }
    // getListOfAmbulanceStatus

    // get Geolocation Data from google
    // https://maps.googleapis.com/maps/api/directions/outputFormat?parameters


    // Call Data Layer
    // Get Ambulance list
}
