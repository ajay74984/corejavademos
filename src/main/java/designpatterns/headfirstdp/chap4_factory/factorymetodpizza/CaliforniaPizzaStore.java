package designpatterns.headfirstdp.chap4_factory.factorymetodpizza;

public class CaliforniaPizzaStore extends PizzaStore {
	@Override
	Pizza createPizza(String type) {
		Pizza pizza;
		if (type.equals("cheese")) {
			pizza = new CaliforniaCheesePizza(type);
		} else if (type.equals("veg")) {
			pizza = new CaliforniaVegPizza(type);
		} else {
			pizza = null;
		}
		return pizza;
	}
}
