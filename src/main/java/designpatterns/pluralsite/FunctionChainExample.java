package designpatterns.pluralsite;

public class FunctionChainExample {
	public static void main(String[] args) {
		Meteo m = new Meteo(10);
		Function<Meteo, Integer> read = Meteo::getTemprature;
		Function<Integer, Double> f = integer -> integer * 9d / 5d + 32d;
		
		Function<Meteo, Double> intToFernehight = read.andThen(f);
		
		System.out.println(intToFernehight.apply(m));
	}
}
