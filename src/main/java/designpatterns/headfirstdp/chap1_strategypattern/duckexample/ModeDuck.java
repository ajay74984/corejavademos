package designpatterns.headfirstdp.chap1_strategypattern.duckexample;

public class ModeDuck extends Duck {
	
	public ModeDuck() {
		flyBehaviour = new NoFlyHigh();
		quackBehaviour = new NoSqweak();
	}
	
	@Override
	public void display() {
		System.out.println("I am a mode duck");
	}
}
