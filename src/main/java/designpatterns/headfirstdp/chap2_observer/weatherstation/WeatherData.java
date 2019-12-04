package designpatterns.headfirstdp.chap2_observer.weatherstation;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {
	
	private List<Observer> observerList;
	private float temp;
	private float humidity;
	private float presssure;
	
	
	public WeatherData() {
		observerList = new ArrayList<>();
	}
	
	@Override
	public void registerObserver(Observer observer) {
		observerList.add(observer);
	}
	
	@Override
	public void removeObserver(Observer observer1) {
		observerList.removeIf(observer -> observerList.contains(observer1));
	}
	
	private void measurementsChanged() {
		notifyObservers();
	}
	
	@Override
	public void notifyObservers() {
		observerList.forEach(observer -> observer.update(temp, humidity, presssure));
	}
	
	/*
	Dummy method to set values, real life it would take data from weather station
	 */
	public void setMeasurements(float temp, float humidity, float presssure) {
		this.temp = temp;
		this.humidity = humidity;
		this.presssure = presssure;
		measurementsChanged(); //TODO : real life will be a listener?
	}
}
