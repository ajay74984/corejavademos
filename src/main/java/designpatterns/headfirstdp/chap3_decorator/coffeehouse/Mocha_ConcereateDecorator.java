package designpatterns.headfirstdp.chap3_decorator.coffeehouse;

import java.util.HashMap;
import java.util.Map;

public class Mocha_ConcereateDecorator extends CondimentDecorator {
	
	private Map<Size, Double> sizeToPriceMap = new HashMap<>();
	
	private Beverage_MainComponent beverageMainComponent;
	
	public Mocha_ConcereateDecorator(Beverage_MainComponent beverageMainComponent) {
		this.beverageMainComponent = beverageMainComponent;
		sizeToPriceMap.put(Size.SMALL, 10d);
		sizeToPriceMap.put(Size.MEDIUM, 15d);
		sizeToPriceMap.put(Size.LARGE, 20d);
	}
	
	@Override
	String getDescription() {
		return beverageMainComponent.getDescription() + "Mocha_ConcereateDecorator";
	}
	
	@Override
	double getCost() {
		return beverageMainComponent.getCost() + sizeToPriceMap.get(beverageMainComponent.getSize());
	}
}
