package designpatterns.headfirstdp.chap10_state;

public class NoQuarterState implements State {
	
	private GumballMachine gumballMachine;
	
	public NoQuarterState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}
	
	@Override
	public void insertQuarter() {
		System.out.println("You have inserted a quarter");
		gumballMachine.setState(null); //TODO
		
	}
	
	@Override
	public void ejectQuarter() {
		System.out.println("You have not inserted the coin");
	}
	
	@Override
	public void turnCrank() {
		System.out.println("You turned, but no quarter");
	}
	
	@Override
	public void dispense() {
		System.out.println("You need to pay first");
	}
}
