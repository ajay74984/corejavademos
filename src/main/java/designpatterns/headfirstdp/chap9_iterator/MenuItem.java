package designpatterns.headfirstdp.chap9_iterator;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class MenuItem {
	private String name;
	private String description;
	private boolean vegeterian;
	private double price;
}
