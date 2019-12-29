package designpatterns.headfirstdp.chap7_adapter.duckprob;

public class DuckAdapter implements Duck {
	
	private Turkey turkey;
	
	public DuckAdapter(Turkey turkey) {
		this.turkey = turkey;
	}
	
	@Override
	public void fly() {
		turkey.fly();
	}
	
	@Override
	public void quack() {
		turkey.gobble();
	}
}
