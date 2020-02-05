package designpatterns.headfirstdp.chap4_factory.factorymetodpizza;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
	private String name;
	private String dough;
	private String sauce;
	
	private List<String> toppings = new ArrayList<>();
	
	public Pizza(String name) {
		this.name = name;
	}
	
	void prepare() {
		System.out.println("Preparing  :" + name);
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
}
