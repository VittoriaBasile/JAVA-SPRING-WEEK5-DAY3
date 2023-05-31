package epicode.SPRINGWEEK5DAY3.entities;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Product {
	protected double price;
	protected String name;
}