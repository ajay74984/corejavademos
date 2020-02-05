package designpatterns.headfirstdp.chap4_factory;

public interface PizzaIngredientsFactory {
	
	void createDough();
	
	void createSauce();
	
	void createCheese();
	
	void createVeggies();
}
