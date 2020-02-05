package designpatterns.headfirstdp.chap4_factory.abstractfactory;

import designpatterns.headfirstdp.chap4_factory.abstractfactory.ingredients.Cheese;
import designpatterns.headfirstdp.chap4_factory.abstractfactory.ingredients.Dough;
import designpatterns.headfirstdp.chap4_factory.abstractfactory.ingredients.Sauce;
import designpatterns.headfirstdp.chap4_factory.abstractfactory.ingredients.Veggie;

public interface PizzaIngredientsFactory {
	
	Dough createDough();
	
	Sauce createSauce();
	
	Cheese createCheese();
	
	Veggie[] createVeggies();
}
