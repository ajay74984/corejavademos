package designpatterns.headfirstdp.chap1_strategypattern.duckexample;

public class RedDuck extends Duck {
	
	@Override
	public void display() {
		System.out.println("Red Duck");
	}
	
	public RedDuck() {
		flyBehaviour = new FlyingHigh();
		quackBehaviour = new Sqweak();
	}
}
