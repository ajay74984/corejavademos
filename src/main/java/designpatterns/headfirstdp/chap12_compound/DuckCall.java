package designpatterns.headfirstdp.chap12_compound;

public class DuckCall implements Quackable {
	@Override
	public void quack() {
		System.out.println("duckcall");
	}
	
	@Override
	public void registerObserver(Observer observer) {
	
	}
	
	@Override
	public void notifyObservers() {
	
	}
}
