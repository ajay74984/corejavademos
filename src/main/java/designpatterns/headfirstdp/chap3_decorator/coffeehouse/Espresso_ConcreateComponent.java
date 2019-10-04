package designpatterns.headfirstdp.chap3_decorator.coffeehouse;

public class Espresso_ConcreateComponent extends Beverage_MainComponent {
	@Override
	String getDescription() {
		return "I am an Espresso_ConcreateComponent";
	}
	
	@Override
	double getCost() {
		return 1.99;
	}
}
