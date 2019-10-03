package designpatterns.headfirstdp.chap2_observer.weatherstation;

public interface Observer {
	
	void update(float temp, float humidity, float pressure);
}
