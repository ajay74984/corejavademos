package designpatterns.headfirstdp.chap12_compound;

public class CountingDuckFactory extends AbstractDuckFactory {
	@Override
	public Quackable createMallradDuck() {
		return new QuackCountDecorator(new MallardDuck());
	}
	
	@Override
	public Quackable createRedHeadDuck() {
		return new QuackCountDecorator(new RedHeadDuck());
	}
	
	@Override
	public Quackable createRubberDuck() {
		return new QuackCountDecorator(new RubberDuck());
	}
	
	@Override
	public Quackable createDuckCall() {
		return new QuackCountDecorator(new DuckCall());
	}
}
