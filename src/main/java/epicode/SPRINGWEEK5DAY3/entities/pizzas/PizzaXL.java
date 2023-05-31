package epicode.SPRINGWEEK5DAY3.entities.pizzas;

public class PizzaXL extends Pizza {
	public PizzaXL() {
		setName("Spigolata");
		setPrice(getPrice() * 2);
		setCalories(getCalories() * 2);
		getIngredientsList();
	}

	@Override
	public String toString() {
		return super.toString();
	}

}
