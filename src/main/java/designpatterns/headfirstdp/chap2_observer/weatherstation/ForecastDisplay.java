package designpatterns.headfirstdp.chap2_observer.weatherstation;

public class ForecastDisplay implements DisplayElement, Observer {
	@Override
	public void display() {
		System.out.println("This will show the forecast");
	}
	
	@Override
	public void update(float temp, float humidity, float pressure) {
	
	}
}
