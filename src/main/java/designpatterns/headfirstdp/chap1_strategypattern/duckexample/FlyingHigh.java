package designpatterns.headfirstdp.chap1_strategypattern.duckexample;

public class FlyingHigh implements FlyBehaviour {
	
	@Override
	public void fly() {
		System.out.println("Flying High");
	}
}
