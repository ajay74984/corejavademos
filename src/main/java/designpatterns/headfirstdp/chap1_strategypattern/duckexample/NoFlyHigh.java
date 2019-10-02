package designpatterns.headfirstdp.chap1_strategypattern.duckexample;

public class NoFlyHigh implements FlyBehaviour {
	
	@Override
	public void fly() {
		System.out.println("Can not fly High");
	}
}
