package designpatterns.headfirstdp.chap9_iterator.composite;

public class MenuItem implements MenuComponent {
	private String name;
	private String description;
	private boolean vegetarian;
	private double price;
	
	public MenuItem(String name, String description, boolean vegeterian, double price) {
		this.name = name;
		this.description = description;
		this.vegetarian = vegeterian;
		this.price = price;
	}
	
	@Override
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	@Override
	public boolean isVegetarian() {
		return vegetarian;
	}
	
	public void setVegetarian(boolean vegetarian) {
		this.vegetarian = vegetarian;
	}
	
	@Override
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	@Override
	public void print() {
		System.out.println("MenuItem{" +
				                   "name='" + name + '\'' +
				                   ", description='" + description + '\'' +
				                   ", vegetarian=" + vegetarian +
				                   ", price=" + price +
				                   '}');
	}
}
