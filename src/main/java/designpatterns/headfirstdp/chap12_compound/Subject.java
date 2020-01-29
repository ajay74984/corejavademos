package designpatterns.headfirstdp.chap12_compound;

public interface Subject {
	
	void registerObserver(Observer observer);
	
	void notifyObservers();
	
}
