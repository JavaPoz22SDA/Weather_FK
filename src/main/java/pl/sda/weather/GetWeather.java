package pl.sda.weather;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.exc.UnrecognizedPropertyException;

import java.io.IOException;
import java.util.Optional;
import java.util.Scanner;

public class GetWeather {

    public static void main(String[] args) throws IOException {

        String API_KEY = "a7c4fbeed5abd6ca490b193fab5d7651";
        ObjectMapper mapper = new ObjectMapper();
        Scanner scan = new Scanner(System.in);

        System.out.println("Podaj miejscowśc bez polskich znaków");

        WeatherService weatherService = new WeatherService("http://api.weatherstack.com/current", API_KEY);
        String city = scan.nextLine();

        Optional<Weather> weather = weatherService.getCityWeather(city);

        weather.ifPresent(weather1 -> System.out.println("Temperatura w " + weather1.getLocation().getName() + " wynosi: " + weather1.getCurrent().getTemperature()));

    }
}
