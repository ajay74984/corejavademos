package designpatterns.headfirstdp.chap3_decorator.coffeehouse;

public class Decaf_ConcreateComponent extends Beverage_MainComponent {
	@Override
	String getDescription() {
		return "I am a Decaf_ConcreateComponent";
	}
	
	@Override
	double getCost() {
		return 1.05;
	}
}
