package designpatterns.headfirstdp.chap4_factory.factorymetodpizza;

public abstract class PizzaStore {
	
	public void orderPizza(String type) {
		Pizza pizza = createPizza(type);
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
	}
	
	abstract Pizza createPizza(String type);
}
