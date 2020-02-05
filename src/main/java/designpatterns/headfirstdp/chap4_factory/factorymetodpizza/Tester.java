package designpatterns.headfirstdp.chap4_factory.factorymetodpizza;

public class Tester {
	
	public static void main(String[] args) {
		PizzaStore nycStore = new NycPizzaStore();
		PizzaStore caliStore = new CaliforniaPizzaStore();
		nycStore.orderPizza("veg");
		caliStore.orderPizza("cheese");
	}
}
