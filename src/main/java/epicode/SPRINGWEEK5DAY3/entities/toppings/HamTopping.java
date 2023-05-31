package epicode.SPRINGWEEK5DAY3.entities.toppings;

import epicode.SPRINGWEEK5DAY3.entities.Consummation;

public class HamTopping extends ToppingDecorator {
	public HamTopping(Consummation c) {
		super(c);
		this.name = "Prosciutto";
		this.price = 2.00;
		this.calories = 200;
	}
}
