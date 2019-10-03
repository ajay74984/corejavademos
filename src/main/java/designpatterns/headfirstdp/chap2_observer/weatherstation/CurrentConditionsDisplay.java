package designpatterns.headfirstdp.chap2_observer.weatherstation;

public class CurrentConditionsDisplay implements DisplayElement, Observer {
	private float temp;
	private float pressure;
	private float humidity;
	
	private Subject weatherData;
	
	public CurrentConditionsDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}
	
	@Override
	public void display() {
		System.out.println("CurrentConditionsDisplay{" +
				                   "temp=" + temp +
				                   ", pressure=" + pressure +
				                   ", humidity=" + humidity
				                   + "}");
	}
	
	
	@Override
	public void update(float temp, float humidity, float pressure) {
		this.temp = temp;
		this.humidity = humidity;
		this.pressure = pressure;
		display();
	}
}
