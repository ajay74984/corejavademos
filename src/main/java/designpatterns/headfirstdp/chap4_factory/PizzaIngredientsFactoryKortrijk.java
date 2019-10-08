package designpatterns.headfirstdp.chap4_factory;

import designpatterns.headfirstdp.chap4_factory.ingredients.Cheese;
import designpatterns.headfirstdp.chap4_factory.ingredients.Dough;
import designpatterns.headfirstdp.chap4_factory.ingredients.Sauce;
import designpatterns.headfirstdp.chap4_factory.ingredients.Veggie;

import java.util.List;

public class PizzaIngredientsFactoryKortrijk implements PizzaIngredientsFactory {
	@Override
	public Dough createDough() {
		return null;
	}
	
	@Override
	public Sauce createSauce() {
		return null;
	}
	
	@Override
	public Cheese createCheese() {
		return null;
	}
	
	@Override
	public List<Veggie> createVeggies() {
		return null;
	}
}
