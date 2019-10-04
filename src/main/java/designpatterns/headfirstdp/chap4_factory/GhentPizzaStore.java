package designpatterns.headfirstdp.chap4_factory;

public class GhentPizzaStore extends PizzaStore {
	
	@Override
	Pizza createPizza(String type) {
		Pizza pizza = null;
		
		if (type.equals("Veggie")) {
			pizza = new VeggiePizza();
		} else if (type.equals("Greek")) {
			pizza = new GreekPizza();
		} else if (type.equals("NV")) {
			pizza = new NonVegPizza();
		}
		return pizza;
	}
}
