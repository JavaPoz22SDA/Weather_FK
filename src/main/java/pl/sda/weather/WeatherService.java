package pl.sda.weather;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.exc.UnrecognizedPropertyException;

import java.io.IOException;
import java.net.URL;

public class WeatherService {
    private String finalURL;
    ObjectMapper mapper = new ObjectMapper();

    public WeatherService(String url, String key) {
        finalURL = url + "?access_key=" + key;
    }
    public Weather getCityWeather(String city) throws IOException {
       try {
           finalURL = finalURL + "&query=" + city.replace(" ", "%20");
           return mapper.readValue(new URL(finalURL), Weather.class);

       }catch (UnrecognizedPropertyException e){
            ErrorException errorException = mapper.readValue(new URL(finalURL), ErrorException.class);
            System.out.println("Podane miasto nie istnieje. ");
            System.out.println("Błąd: " + errorException.getError().getCode() + " Info " + errorException.getError().getInfo());
            return null;
       }
    }
}