package designpatterns.headfirstdp.chap3_decorator.coffeehouse;

public class HouseBlend_ConcreateComponent extends Beverage_MainComponent {
	@Override
	String getDescription() {
		return "I am a HouseBlend_ConcreateComponent";
	}
	
	@Override
	double getCost() {
		return 0.89;
	}
}
