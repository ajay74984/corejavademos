package designpatterns.headfirstdp.chap4_factory;

import designpatterns.headfirstdp.chap4_factory.ingredients.Cheese;
import designpatterns.headfirstdp.chap4_factory.ingredients.Dough;
import designpatterns.headfirstdp.chap4_factory.ingredients.Sauce;
import designpatterns.headfirstdp.chap4_factory.ingredients.Veggie;

import java.util.List;

public interface PizzaIngredientsFactory {
	
	Dough createDough();
	
	Sauce createSauce();
	
	Cheese createCheese();
	
	List<Veggie> createVeggies();
}
