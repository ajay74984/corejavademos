package designpatterns.headfirstdp.chap4_factory.factorymetodpizza;

public class NycPizzaStore extends PizzaStore {
	
	@Override
	Pizza createPizza(String type) {
		Pizza pizza;
		if (type.equals("cheese")) {
			pizza = new NycCheesePizza(type);
		} else if (type.equals("veg")) {
			pizza = new NycVegPizza(type);
		} else {
			pizza = null;
		}
		return pizza;
	}
}
