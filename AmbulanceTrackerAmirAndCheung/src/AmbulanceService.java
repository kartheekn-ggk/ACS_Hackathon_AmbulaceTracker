public class AmbulanceService {
    RestClient restClient = new RestClient();
    // updateAmbulanceStatus
    public void updateAmbulanceStatus (Ambulance ambulance) {

    }

    public int ETAOfAmbulance (Ambulance ambulance) {
        restClient.get("https://maps.googleapis.com/maps/api/directions/json?origin="+ ambulance.getLatitude()+","+ambulance.getLongitude()+"&destination="+ambulance.getDestination()+"&key=AIzaSyAMvz10odETnRkFHvrOYeUtlIVzAKns6lU");
    }
    // getListOfAmbulanceStatus

    private String path =
    // get Geolocation Data from google
    // https://maps.googleapis.com/maps/api/directions/outputFormat?parameters


    // Call Data Layer
    // Get Ambulance list
}
