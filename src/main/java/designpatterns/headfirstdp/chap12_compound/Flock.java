package designpatterns.headfirstdp.chap12_compound;

import java.util.ArrayList;
import java.util.List;

public class Flock implements Quackable {
	
	List<Quackable> ducks;
	private FlockObservable flockObservable;
	
	public Flock() {
		ducks = new ArrayList<>();
		flockObservable = new FlockObservable(ducks);
	}
	
	public void addDuck(Quackable duck) {
		ducks.add(duck);
	}
	
	@Override
	public void quack() {
		for (Quackable duck : ducks) {
			duck.quack();
			notifyObservers();
		}
	}
	
	@Override
	public void registerObserver(Observer observer) {
		flockObservable.registerObserver(observer);
	}
	
	@Override
	public void notifyObservers() {
		flockObservable.notifyObservers();
	}
}
