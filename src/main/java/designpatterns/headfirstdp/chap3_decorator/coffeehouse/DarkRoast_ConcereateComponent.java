package designpatterns.headfirstdp.chap3_decorator.coffeehouse;

public class DarkRoast_ConcereateComponent extends Beverage_MainComponent {
	@Override
	String getDescription() {
		return "I am a DarkRoast_ConcereateComponent";
	}
	
	@Override
	double getCost() {
		return 0.99;
	}
}
