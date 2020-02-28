public class Ambulance {
    private String longitude;
    private String latitude;
    private String destination;
    private String ambulanceID;
    private String code;
    private String status;

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

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getAmbulanceID() {
        return ambulanceID;
    }

    public void setAmbulanceID(String ambulanceID) {
        this.ambulanceID = ambulanceID;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Ambulance(String longitude, String latitude, String destination, String ambulanceID, String code, String status ) {
        setAmbulanceID(ambulanceID);
        setDestination(destination);
        setLatitude(latitude);
        setLongitude(longitude);
        setCode(code);

    }
}
