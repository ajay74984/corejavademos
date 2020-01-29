package designpatterns.headfirstdp.chap12_compound;

public class QuackCountDecorator implements Quackable {
	
	private Quackable duck;
	
	private static int numOFQuack;
	private Observable observable;
	
	public QuackCountDecorator(Quackable duck) {
		this.duck = duck;
		observable = new Observable(duck);
	}
	
	@Override
	public void quack() {
		duck.quack();
		numOFQuack++;
		notifyObservers();
	}
	
	public static int getNumOFQuack() {
		return numOFQuack;
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
