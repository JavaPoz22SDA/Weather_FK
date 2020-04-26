package pl.sda.weather;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

public class GetWeather {

    public static void main(String[] args) throws IOException {

      /*  ObjectMapper mapper = new ObjectMapper();
        String url = "http://api.weatherstack.com/current?access_key=a7c4fbeed5abd6ca490b193fab5d7651&query=New%20York";

        Weather object = mapper.readValue(new URL(url), Weather.class);
        System.out.println(object.getCurrent().getTemperature());*/
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj miejscowśc bez polskich znaków");

        WeatherService weatherService = new WeatherService("http://api.weatherstack.com/current", "a7c4fbeed5abd6ca490b193fab5d7651");

        String city = scan.nextLine();
        Weather weather = weatherService.getCityWeather(city);

        System.out.println("Temperatura w " + weather.getLocation().getName() + " wynosi: " +weather.getCurrent().getTemperature());
    }
}
