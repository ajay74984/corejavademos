package designpatterns.headfirstdp.chap5_singelton;

public class ChocolateBoiler {
	
	//Need to be used with double checked block only.
	
	private volatile static ChocolateBoiler instance;
	
	//Eager creation of the object
	//private static ChocolateBoiler instance1 = new ChocolateBoiler();
	private boolean empty;
	private boolean boiled;
	
	//Synchornize is expensive, dont use it until and unles critical piece of code is needed here
	/*public static synchronized ChocolateBoiler getInstance() {
		if (instance == null) {
			return new ChocolateBoiler();
		}
		return instance;
	}*/
	
	public static ChocolateBoiler getInstance() {
		if (instance == null) {
			synchronized (ChocolateBoiler.class) {
				if (instance == null) {
					return new ChocolateBoiler();
				}
			}
		}
		return instance;
	}
	
	private ChocolateBoiler() {
		empty = true;
		boiled = false;
	}
	
	public void fill() {
		if (isEmpty()) {
			empty = false;
			boiled = false;
		}
	}
	
	public void drain() {
		if (isBoiled() && !isEmpty()) {
			empty = true;
		}
	}
	
	public void boil() {
		if (!isEmpty() && !isBoiled()) {
			boiled = true;
		}
	}
	
	public boolean isEmpty() {
		return empty;
	}
	
	public boolean isBoiled() {
		return boiled;
	}
}
