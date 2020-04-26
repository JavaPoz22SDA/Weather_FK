package pl.sda.weather;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.exc.UnrecognizedPropertyException;

import java.io.IOException;
import java.net.URL;
import java.util.Optional;

public class WeatherService {
    private String finalURL;
    ObjectMapper mapper = new ObjectMapper();

    public WeatherService(String url, String key) {
        finalURL = url + "?access_key=" + key;
    }
    public Optional<Weather> getCityWeather(String city) throws IOException {
        finalURL = finalURL + "&query=" + city.replace(" ", "%20");
        Weather weather;
        Optional<Weather> opt;
        try {
            weather = mapper.readValue(new URL(finalURL), Weather.class);
            opt = Optional.of(weather);
            return opt;
        }catch (UnrecognizedPropertyException e){
            ErrorException errorException = mapper.readValue(new URL(finalURL), ErrorException.class);
            System.out.println("Podane miasto nie istnieje. ");
            System.out.println("Błąd: " + errorException.getError().getCode() + " Info " + errorException.getError().getInfo());
            return Optional.empty();
       }
    }
}