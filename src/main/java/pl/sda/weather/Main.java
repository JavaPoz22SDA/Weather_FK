package pl.sda.weather;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        ObjectMapper mapper = new ObjectMapper();

        /*Weather weather = new Weather(23.5, "Poznań",new Request("City", "Poznan, Poland","pl","m"),
                                                                        new Location("Poznań","Poland","Wielkopolska",40.5,48.7,"środkowo-europejski","coś",15,-4.0));
        System.out.println(weather.getTemperature());
        weather.setTemperature(34.33);
        System.out.println(weather.getTemperature());

        mapper.writeValue(new File("data.json"), weather);

        Weather readWeather = mapper.readValue(new File("data.json"), Weather.class);

        System.out.println(readWeather.getCity());

        Vehicle vehicle = new Vehicle(4,6,"Opel");
        System.out.println(vehicle.getModel());
        vehicle.setNumberCylinders(4);
        System.out.println(vehicle.getNumberCylinders());

        mapper.writeValue(new File("vehicle.json"), vehicle);*/

    }
}
