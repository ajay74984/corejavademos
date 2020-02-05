package designpatterns.headfirstdp.chap4_factory.abstractfactory;

public class JindPizzaStore extends PizzaStore {
	
	@Override
	Pizza createPizza(String type) {
		Pizza pizza;
		PizzaIngredientsFactory factory = new IndianPizzaIngredientFactory();
		if (type.equals("cheese")) {
			pizza = new CheesePizza("Indian Style Cheese Pizza", factory);
		} else if (type.equals("veg")) {
			pizza = new VegPizza("Indian Style Cheese Pizza", factory);
		} else {
			pizza = null;
		}
		return pizza;
	}
}
