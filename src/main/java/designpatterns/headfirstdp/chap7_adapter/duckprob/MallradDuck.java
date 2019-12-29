package designpatterns.headfirstdp.chap7_adapter.duckprob;

public class MallradDuck implements Duck {
	@Override
	public void fly() {
		System.out.println("Mallrad can fly");
	}
	
	@Override
	public void quack() {
		System.out.println("Duck can quack");
	}
}
