package designpatterns.headfirstdp.chap9_iterator.composite;

import java.util.ArrayList;
import java.util.List;

public class Menu implements MenuComponent {
	private String name;
	private String description;
	
	private List<MenuComponent> menuComponents;
	
	public Menu(String name, String description) {
		this.name = name;
		this.description = description;
		menuComponents = new ArrayList<>();
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
	public void add(MenuComponent component) {
		menuComponents.add(component);
	}
	
	@Override
	public void remove(MenuComponent component) {
		menuComponents.remove(component);
	}
	
	@Override
	public MenuComponent getChild(int node) {
		return menuComponents.get(node);
	}
	
	@Override
	public void print() {
		System.out.println("Menu{" +
				                   "name='" + name + '\'' +
				                   ", description='" + description + '\'' +
				                   '}');
		menuComponents.forEach(MenuComponent::print);
	}
}
