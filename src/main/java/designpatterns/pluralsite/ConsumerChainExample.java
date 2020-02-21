package designpatterns.pluralsite;

public class ConsumerChainExample {
	public static void main(String[] args) {
		
		java.util.function.Consumer<String> c4 = System.out::println;
		Consumer<String> c1 = s -> System.out.println("C1 = " + s);
		Consumer<String> c2 = s -> System.out.println("C2 = " + s);
		
		Consumer<String> c3 = c1.andThen(c2);
		
		
		c1.accept("Hello");
		c2.accept("Ajay");
	}
}
