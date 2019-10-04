package designpatterns.headfirstdp.chap3_decorator.coffeehouse;

import java.util.HashMap;
import java.util.Map;

public class Whip_ConcreateDecorator extends CondimentDecorator {
	
	private Beverage_MainComponent beverageMainComponent;
	
	private Map<Size, Double> sizeToPriceMap = new HashMap<>();
	
	
	public Whip_ConcreateDecorator(Beverage_MainComponent beverageMainComponent) {
		this.beverageMainComponent = beverageMainComponent;
		sizeToPriceMap.put(Size.SMALL, 20d);
		sizeToPriceMap.put(Size.MEDIUM, 25d);
		sizeToPriceMap.put(Size.LARGE, 30d);
	}
	
	@Override
	String getDescription() {
		return beverageMainComponent.getDescription() + "Whip_ConcreateDecorator";
	}
	
	@Override
	double getCost() {
		return beverageMainComponent.getCost() + sizeToPriceMap.get(beverageMainComponent.getSize());
	}
}
