package designpatterns.headfirstdp.chap2_observer.weatherstation;

public class StaticDataDisplay implements DisplayElement, Observer {
	@Override
	public void display() {
		System.out.println("This will show mi/max/avg of all values");
	}
	
	
	@Override
	public void update(float temp, float humidity, float pressure) {
	
	}
}
