package designpatterns.headfirstdp.chap2_observer.weatherstation;

public interface Subject {
	
	void registerObserver(Observer observer);
	
	void removeObserver(Observer observer);
	
	void notifyObservers();
}
