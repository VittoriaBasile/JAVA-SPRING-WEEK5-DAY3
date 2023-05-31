package epicode.SPRINGWEEK5DAY3.entities.drinks;

public class Water extends Drink {
	public Water(double size) {
		super(size);
		this.calories = 70;
		this.name = "Acqua";
		this.price = 1.50;
	}
}
