package designpatterns.headfirstdp.chap12_compound;

import java.util.ArrayList;
import java.util.List;

public class Observable implements Subject {
	
	Subject duck;
	
	public Observable(Subject duck) {
		this.duck = duck;
	}
	
	private List<Observer> observers = new ArrayList<>();
	
	public void registerObserver(Observer observer) {
		observers.add(observer);
	}
	
	public void notifyObservers() {
		observers.forEach(observer -> observer.update(duck));
	}
}
