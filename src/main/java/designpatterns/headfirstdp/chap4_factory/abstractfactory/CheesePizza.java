package designpatterns.headfirstdp.chap4_factory.abstractfactory;

public class CheesePizza extends Pizza {
	
	PizzaIngredientsFactory ingredientsFactory;
	private String name;
	
	public CheesePizza(String name, PizzaIngredientsFactory ingredientsFactory) {
		super(name);
		this.name = name;
		this.ingredientsFactory = ingredientsFactory;
	}
	
	@Override
	void prepare() {
		System.out.println("Preparing : " + name);
		ingredientsFactory.createDough();
		ingredientsFactory.createSauce();
		ingredientsFactory.createCheese();
		ingredientsFactory.createVeggies();
	}
}
