package designpatterns.headfirstdp.chap4_factory;

public class KortrijkPizzaStore extends PizzaStore {
	
	@Override
	Pizza createPizza(String type) {
		
		PizzaIngredientsFactory pizzaIngredientsFactory
				= new PizzaIngredientsFactoryKortrijk();
		Pizza pizza = null;
		
		if (type.equals("Veggie")) {
			pizza = new VeggiePizza(pizzaIngredientsFactory);
		} else if (type.equals("Greek")) {
			pizza = new GreekPizza();
		} else if (type.equals("NV")) {
			pizza = new NonVegPizza();
		}
		return pizza;
	}
}
