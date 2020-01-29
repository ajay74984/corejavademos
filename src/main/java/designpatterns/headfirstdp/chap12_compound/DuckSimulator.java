package designpatterns.headfirstdp.chap12_compound;

public class DuckSimulator {
	
	AbstractDuckFactory duckFactory = new CountingDuckFactory();
	
	public static void main(String[] args) {
		DuckSimulator duckSimulator = new DuckSimulator();
		duckSimulator.simulate();
	}
	
	private void simulate() {
		Quackable mallrad = duckFactory.createMallradDuck();
		Quackable red = duckFactory.createRedHeadDuck();
		Quackable duckcall = duckFactory.createDuckCall();
		Quackable rubber = duckFactory.createRubberDuck();
		Quackable goose = new GooseAdapter(new Goose());
		
		Observer quackologist = new Quackologist();
		
		Flock duckFlock = new Flock();
		duckFlock.addDuck(mallrad);
		duckFlock.addDuck(red);
		duckFlock.addDuck(duckcall);
		duckFlock.addDuck(rubber);
		//duckFlock.addDuck(goose);
		
		duckFlock.registerObserver(quackologist);
		
		simulate(duckFlock);
		
		System.out.println(QuackCountDecorator.getNumOFQuack());
	}
	
	private void simulate(Quackable duck) {
		duck.quack();
	}
}
