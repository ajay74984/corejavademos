package designpatterns.headfirstdp.chap12_compound;

public class Quackologist implements Observer {
	
	@Override
	public void update(Subject duck) {
		System.out.println("Duck : " + "I am observed");
		
	}
}
