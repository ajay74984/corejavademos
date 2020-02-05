package designpatterns.headfirstdp.chap4_factory.abstractfactory;

import designpatterns.headfirstdp.chap4_factory.abstractfactory.ingredients.Dough;
import designpatterns.headfirstdp.chap4_factory.abstractfactory.ingredients.Sauce;
import designpatterns.headfirstdp.chap4_factory.abstractfactory.ingredients.Veggie;

public abstract class Pizza {
	private String name;
	private Dough dough;
	private Sauce sauce;
	private Veggie[] veggies;
	
	public Pizza(String name) {
		this.name = name;
	}
	
	void bake() {
		System.out.println("Baking : " + name);
	}
	
	void cut() {
		System.out.println("Cutting  : " + name);
	}
	
	void box() {
		System.out.println("Boxing : " + name);
	}
	
	abstract void prepare();
}
