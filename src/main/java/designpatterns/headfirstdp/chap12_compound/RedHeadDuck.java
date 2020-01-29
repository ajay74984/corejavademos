package designpatterns.headfirstdp.chap12_compound;

public class RedHeadDuck implements Quackable {
	
	private Observable observable;
	
	public RedHeadDuck() {
		observable = new Observable(this);
	}
	
	@Override
	public void quack() {
		System.out.println("red");
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
