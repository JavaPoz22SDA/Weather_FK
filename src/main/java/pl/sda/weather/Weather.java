package pl.sda.weather;

public class Weather {

    // private double temperature;
    // private String city;
    private Request request;
    private Location location;
    private Current current;


    public Weather() { }

    public Weather(Request request, Location location, Current current) {
        //this.temperature = temperature;
        //this.city = city;
        this.request = request;
        this.location = location;
        this.current = current;
    }

//    public double getTemperature() {
//        return temperature;
//    }
//
//    public void setTemperature(double temperature) {
//        this.temperature = temperature;
//    }

//    public String getCity() {
//        return city;
//    }
//
//    public void setCity(String city) {
//        this.city = city;
//    }

    public Request getRequest() {
        return request;
    }

    public void setRequest(Request request) {
        this.request = request;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Current getCurrent() {
        return current;
    }

    public void setCurrent(Current current) {
        this.current = current;
    }
}