public class Ambulance {
    private String longitude;
    private String latitude;
    private String destination;
    private String ambulanceID;
    private String code;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getLongitude() {
        return longitude;
    }

    private void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getLatitude() {
        return latitude;
    }

    private void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getDestination() {
        return destination;
    }

    private void setDestination(String destination) {
        this.destination = destination;
    }

    public String getAmbulanceID() {
        return ambulanceID;
    }

    private void setAmbulanceID(String ambulanceID) {
        this.ambulanceID = ambulanceID;
    }

    public Ambulance(String longitude, String latitude, String destination, String ambulanceID, String code ) {
        setAmbulanceID(ambulanceID);
        setDestination(destination);
        setLatitude(latitude);
        setLongitude(longitude);
        setCode(code);
    }
}
