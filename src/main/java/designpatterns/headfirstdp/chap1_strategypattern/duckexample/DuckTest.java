package designpatterns.headfirstdp.chap1_strategypattern.duckexample;

public class DuckTest {
	
	public static void main(String[] args) {
		Duck redDuck = new RedDuck();
		redDuck.performFly();
		redDuck.performQuack();
		
		Duck modeDuck = new ModeDuck();
		modeDuck.performFly();
		modeDuck.performQuack();
	}
}
