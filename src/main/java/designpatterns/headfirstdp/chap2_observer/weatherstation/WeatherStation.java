package designpatterns.headfirstdp.chap2_observer.weatherstation;

import java.util.ArrayList;

public class WeatherStation {
	
	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData(new ArrayList<>());
		CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
		weatherData.setMeasurements(12, 23, 33);
		weatherData.setMeasurements(45, 2343, 4333);
		weatherData.setMeasurements(1234, 253, 343);
	}
}
