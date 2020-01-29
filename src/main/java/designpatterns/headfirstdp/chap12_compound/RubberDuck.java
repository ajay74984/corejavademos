package designpatterns.headfirstdp.chap12_compound;

public class RubberDuck implements Quackable {
	private Observable observable;
	
	public RubberDuck() {
		observable = new Observable(this);
	}
	
	@Override
	public void quack() {
		System.out.println("rubber");
		notifyObservers();
	}
	
	@Override
	public void registerObserver(Observer observer) {
		observable.registerObserver(observer);
	}
	
	@Override
	public void notifyObservers() {
		observable.notifyObservers();
	}
}
