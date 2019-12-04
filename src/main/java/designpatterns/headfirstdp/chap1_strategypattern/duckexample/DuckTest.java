package designpatterns.headfirstdp.chap1_strategypattern.duckexample;

public class DuckTest {
	
	public static void main(String[] args) {
		Duck redDuck = new RedDuck();
		redDuck.setFlyBehaviour(new FlyingHigh());
		redDuck.setQuackBehaviour(new NoSqweak());
		redDuck.performFly();
		redDuck.performQuack();
		
	}
}
