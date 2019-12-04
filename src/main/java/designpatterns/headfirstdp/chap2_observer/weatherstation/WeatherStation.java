package designpatterns.headfirstdp.chap2_observer.weatherstation;

public class WeatherStation {
	
	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		DisplayElement currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
		weatherData.setMeasurements(12, 23, 33);
		weatherData.setMeasurements(45, 2343, 4333);
		weatherData.setMeasurements(1234, 253, 343);
	}
}
