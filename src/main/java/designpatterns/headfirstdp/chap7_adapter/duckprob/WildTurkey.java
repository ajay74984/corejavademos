package designpatterns.headfirstdp.chap7_adapter.duckprob;

public class WildTurkey implements Turkey {
	@Override
	public void fly() {
		System.out.println("Turkey can fly");
	}
	
	@Override
	public void gobble() {
		System.out.println("Turkey can gobble");
	}
}
