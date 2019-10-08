package designpatterns.headfirstdp.chap4_factory;

import designpatterns.headfirstdp.chap4_factory.ingredients.Cheese;
import designpatterns.headfirstdp.chap4_factory.ingredients.Dough;
import designpatterns.headfirstdp.chap4_factory.ingredients.Sauce;
import designpatterns.headfirstdp.chap4_factory.ingredients.Veggie;

import java.util.List;

public abstract class Pizza {
	
	private Dough dough;
	private Sauce sauce;
	private List<Veggie> veggies;
	private Cheese cheese;
	
	abstract void prepare();
	
	abstract void bake();
	
	abstract void cut();
	
	abstract void box();
}