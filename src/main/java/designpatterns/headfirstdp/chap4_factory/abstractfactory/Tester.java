package designpatterns.headfirstdp.chap4_factory.abstractfactory;

public class Tester {
	public static void main(String[] args) {
		PizzaStore store = new KortrijkPizzaStore();
		store.orderPizza("cheese");
		PizzaStore store2 = new JindPizzaStore();
		store2.orderPizza("veg");
	}
}
