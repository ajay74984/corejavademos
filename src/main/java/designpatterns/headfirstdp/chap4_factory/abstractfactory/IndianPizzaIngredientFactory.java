package designpatterns.headfirstdp.chap4_factory.abstractfactory;

import designpatterns.headfirstdp.chap4_factory.abstractfactory.ingredients.Cheese;
import designpatterns.headfirstdp.chap4_factory.abstractfactory.ingredients.Dough;
import designpatterns.headfirstdp.chap4_factory.abstractfactory.ingredients.Sauce;
import designpatterns.headfirstdp.chap4_factory.abstractfactory.ingredients.Veggie;
import designpatterns.headfirstdp.chap4_factory.abstractfactory.ingredients.indian.IndianCheese;
import designpatterns.headfirstdp.chap4_factory.abstractfactory.ingredients.indian.IndianDough;
import designpatterns.headfirstdp.chap4_factory.abstractfactory.ingredients.indian.IndianSauce;
import designpatterns.headfirstdp.chap4_factory.abstractfactory.ingredients.veggie.Onion;
import designpatterns.headfirstdp.chap4_factory.abstractfactory.ingredients.veggie.Tomato;

public class IndianPizzaIngredientFactory implements PizzaIngredientsFactory {
	@Override
	public Dough createDough() {
		return new IndianDough();
	}
	
	@Override
	public Sauce createSauce() {
		return new IndianSauce();
	}
	
	@Override
	public Cheese createCheese() {
		return new IndianCheese();
	}
	
	@Override
	public Veggie[] createVeggies() {
		return new Veggie[]{new Tomato(), new Onion()};
	}
}
