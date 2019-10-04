package designpatterns.headfirstdp.chap4_factory;

public class PizzaOrderTest {
	
	public static void main(String[] args) {
		PizzaStore kortrijkStore = new KortrijkPizzaStore();
		PizzaStore ghentStore = new GhentPizzaStore();
		Pizza veggieKortrijkStyle = kortrijkStore.orderPizza("Veggie");
		Pizza veggieGhentStyle = ghentStore.orderPizza("Veggie");
		System.out.println("veggieKortrijkStyle " + veggieKortrijkStyle);
		System.out.println("veggieGhentStyle " + veggieGhentStyle);
	}
}
