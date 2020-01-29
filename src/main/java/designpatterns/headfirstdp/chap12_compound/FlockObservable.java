package designpatterns.headfirstdp.chap12_compound;

import java.util.ArrayList;
import java.util.List;

public class FlockObservable implements Subject {
	
	List<Quackable> ducks;
	
	public FlockObservable(List<Quackable> ducks) {
		this.ducks = ducks;
	}
	
	private List<Observer> observers = new ArrayList<>();
	
	public void registerObserver(Observer observer) {
		observers.add(observer);
	}
	
	public void notifyObservers() {
		for (Observer observer : observers) {
			for (Subject duck : ducks) {
				observer.update(duck);
			}
		}
	}
}
