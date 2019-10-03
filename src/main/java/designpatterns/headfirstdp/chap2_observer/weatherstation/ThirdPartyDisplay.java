package designpatterns.headfirstdp.chap2_observer.weatherstation;

public class ThirdPartyDisplay implements DisplayElement, Observer {
	@Override
	public void display() {
		System.out.println("This will be used to display some third party data");
	}
	
	
	@Override
	public void update(float temp, float humidity, float pressure) {
	
	}
}
