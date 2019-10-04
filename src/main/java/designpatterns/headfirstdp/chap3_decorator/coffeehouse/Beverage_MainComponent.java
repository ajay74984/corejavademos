package designpatterns.headfirstdp.chap3_decorator.coffeehouse;

public abstract class Beverage_MainComponent {
	
	public enum Size {
		SMALL,
		MEDIUM,
		LARGE
	}
	
	private Size size = Size.LARGE;
	
	public Size getSize() {
		return size;
	}
	
	public void setSize(Size size) {
		this.size = size;
	}
	
	abstract String getDescription();
	
	abstract double getCost();
}
