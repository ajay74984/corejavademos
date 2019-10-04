package designpatterns.headfirstdp.chap4_factory;

public class NonVegPizza extends Pizza {
	
	@Override
	public void prepare() {
		System.out.println("Preparing NV Pizza");
	}
	
	@Override
	public void bake() {
		System.out.println("Baking NV Pizza");
	}
	
	@Override
	public void cut() {
		System.out.println("Cut NV Pizza");
	}
	
	@Override
	public void box() {
		System.out.println("Boxing NV Pizza");
	}
}
