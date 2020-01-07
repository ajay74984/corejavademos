package designpatterns.headfirstdp.chap8_template;

public abstract class AbstractClass {
	
	final void templateMethod() {
		method1();
		method2();
		implementedMethod();
	}
	
	private void implementedMethod() {
		System.out.println("I an implemented");
	}
	
	abstract void method1();
	
	abstract void method2();
}
