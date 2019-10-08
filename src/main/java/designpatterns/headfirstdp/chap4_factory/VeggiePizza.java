package designpatterns.headfirstdp.chap4_factory;

public class VeggiePizza extends Pizza {
	
	private PizzaIngredientsFactory pizzaIngredientsFactory;
	
	public VeggiePizza(PizzaIngredientsFactory pizzaIngredientsFactory) {
		this.pizzaIngredientsFactory = pizzaIngredientsFactory;
	}
	
	@Override
	public void prepare() {
		System.out.println("Preparing Veggi Pizza");
		pizzaIngredientsFactory.createDough();
		pizzaIngredientsFactory.createSauce();
		pizzaIngredientsFactory.createCheese();
		pizzaIngredientsFactory.createVeggies();
	}
	
	@Override
	public void bake() {
		System.out.println("Baking Veggi Pizza");
	}
	
	@Override
	public void cut() {
		System.out.println("Cut Veggi Pizza");
	}
	
	@Override
	public void box() {
		System.out.println("Boxing Veggi Pizza");
	}
}
