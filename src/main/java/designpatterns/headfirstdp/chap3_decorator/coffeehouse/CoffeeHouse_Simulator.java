package designpatterns.headfirstdp.chap3_decorator.coffeehouse;

public class CoffeeHouse_Simulator {
	
	public static void main(String[] args) {
		Beverage_MainComponent beverageMainComponent = new Espresso_ConcreateComponent();
		beverageMainComponent.setSize(Beverage_MainComponent.Size.MEDIUM);
		System.out.println(beverageMainComponent.getDescription());
		System.out.println("$" + beverageMainComponent.getCost());
		
		Beverage_MainComponent beverageMainComponent1 = new DarkRoast_ConcereateComponent();
		beverageMainComponent1.setSize(Beverage_MainComponent.Size.MEDIUM);
		Beverage_MainComponent beverageMainComponent2 = new Mocha_ConcereateDecorator(beverageMainComponent1);
		Beverage_MainComponent beverageMainComponent3 = new Mocha_ConcereateDecorator(beverageMainComponent2);
		Beverage_MainComponent beverageMainComponent4 = new Whip_ConcreateDecorator(beverageMainComponent3);
		
		System.out.println(beverageMainComponent4.getDescription());
		System.out.println("$" + Math.round(beverageMainComponent4.getCost()));
	}
}
