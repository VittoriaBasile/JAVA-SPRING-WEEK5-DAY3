package epicode.SPRINGWEEK5DAY3.entities.toppings;

import epicode.SPRINGWEEK5DAY3.entities.Consummation;

public class SalameTopping extends ToppingDecorator {

	public SalameTopping(Consummation c) {
		super(c);
		this.name = "Salame";
		this.price = 2.50;
		this.calories = 300;
	}

}
