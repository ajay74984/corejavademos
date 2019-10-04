package designpatterns.headfirstdp.chap3_decorator.coffeehouse;

public class Soy_ConcreateDecorator extends CondimentDecorator {
	
	private Beverage_MainComponent beverageMainComponent;
	
	public Soy_ConcreateDecorator(Beverage_MainComponent beverageMainComponent) {
		this.beverageMainComponent = beverageMainComponent;
	}
	
	@Override
	String getDescription() {
		return beverageMainComponent.getDescription() + "Soy_ConcreateDecorator";
	}
	
	@Override
	double getCost() {
		return beverageMainComponent.getCost() + .15;
	}
}
