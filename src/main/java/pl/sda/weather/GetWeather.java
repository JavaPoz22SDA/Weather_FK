package pl.sda.weather;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.net.URL;

public class GetWeather {

    public static void main(String[] args) throws IOException {

        ObjectMapper mapper = new ObjectMapper();
        String url = "http://api.weatherstack.com/current?access_key=a7c4fbeed5abd6ca490b193fab5d7651&query=New%20York";

        Weather object = mapper.readValue(new URL(url), Weather.class);
        System.out.println(object.getCurrent().getTemperature());


    }
}
