package designpatterns.headfirstdp.chap4_factory.abstractfactory;

public class KortrijkPizzaStore extends PizzaStore {
	@Override
	Pizza createPizza(String type) {
		Pizza pizza;
		PizzaIngredientsFactory factory = new BelgianPizzaIngredientFactory();
		if (type.equals("cheese")) {
			pizza = new CheesePizza("Belgium Style Cheese Pizza", factory);
		} else if (type.equals("veg")) {
			pizza = new VegPizza("Belgium Style Cheese Pizza", factory);
		} else {
			pizza = null;
		}
		return pizza;
	}
}
