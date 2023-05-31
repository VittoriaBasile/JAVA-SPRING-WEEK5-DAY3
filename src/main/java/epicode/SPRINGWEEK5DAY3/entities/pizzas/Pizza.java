package epicode.SPRINGWEEK5DAY3.entities.pizzas;

import epicode.SPRINGWEEK5DAY3.entities.Consummation;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Pizza extends Consummation {
	String ingredientsList;

	public Pizza() {
		this.name = "Margherita";
		this.calories = 1104;
		this.price = 4.99;
		this.ingredientsList = "Pomodoro, mozzarella";
	}

	public String toString() {
		return this.getName() + ", prezzo: " + this.getPrice() + "€, calorie:" + this.getCalories();
	}

}
