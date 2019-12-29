package designpatterns.headfirstdp.chap7_adapter.duckprob;

public class Tester {
	
	public static void main(String[] args) {
		Turkey turkey = new WildTurkey();
		
		Duck turkeyDuck = new DuckAdapter(turkey);
		
		turkeyDuck.fly();
		turkeyDuck.quack();
	}
}
