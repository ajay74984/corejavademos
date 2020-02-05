package designpatterns.headfirstdp.chap4_factory.abstractfactory;

public class VegPizza extends Pizza {
	
	PizzaIngredientsFactory ingredientsFactory;
	private String name;
	
	
	public VegPizza(String name, PizzaIngredientsFactory ingredientsFactory) {
		super(name);
		this.ingredientsFactory = ingredientsFactory;
		this.name = name;
	}
	
	@Override
	void prepare() {
		System.out.println("Preparing : " + name);
		ingredientsFactory.createDough();
		ingredientsFactory.createCheese();
		ingredientsFactory.createSauce();
		ingredientsFactory.createVeggies();
	}
}
