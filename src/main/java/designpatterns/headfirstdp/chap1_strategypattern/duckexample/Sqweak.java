package designpatterns.headfirstdp.chap1_strategypattern.duckexample;

public class Sqweak implements QuackBehaviour {
	
	@Override
	public void quack() {
		System.out.println("Hello! I am sqweaking");
		
	}
}
