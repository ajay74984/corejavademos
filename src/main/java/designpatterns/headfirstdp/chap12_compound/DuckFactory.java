package designpatterns.headfirstdp.chap12_compound;

public class DuckFactory extends AbstractDuckFactory {
	@Override
	public Quackable createMallradDuck() {
		return new MallardDuck();
	}
	
	@Override
	public Quackable createRedHeadDuck() {
		return new RedHeadDuck();
	}
	
	@Override
	public Quackable createRubberDuck() {
		return new RubberDuck();
	}
	
	@Override
	public Quackable createDuckCall() {
		return new DuckCall();
	}
}
