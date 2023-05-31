package epicode.SPRINGWEEK5DAY3.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import epicode.SPRINGWEEK5DAY3.entities.Consummation;
import epicode.SPRINGWEEK5DAY3.entities.Menu;
import epicode.SPRINGWEEK5DAY3.entities.drinks.Coke;
import epicode.SPRINGWEEK5DAY3.entities.drinks.Sprite;
import epicode.SPRINGWEEK5DAY3.entities.drinks.Water;
import epicode.SPRINGWEEK5DAY3.entities.pizzas.Pizza;
import epicode.SPRINGWEEK5DAY3.entities.toppings.HamTopping;
import epicode.SPRINGWEEK5DAY3.entities.toppings.OnionTopping;

@Configuration
public class MenuConfig {
	@Bean
	Menu getMenu() {
		Menu menu = new Menu();

		menu.getMenuEntries().add(getMargherita());
		menu.getMenuEntries().add(getPizzaProsciutto());
		menu.getMenuEntries().add(getPizzaCipolla());
		menu.getMenuEntries().add(getPizzaProsciuttoCipolla());
		menu.getMenuEntries().add(getCoke());
		menu.getMenuEntries().add(getSprite());
		menu.getMenuEntries().add(getWater());

		return menu;
	}

	@Bean
	Consummation getMargherita() {
		return new Pizza();
	}

	@Bean
	Consummation getPizzaProsciutto() {
		return new HamTopping(new Pizza());
	}

	@Bean
	Consummation getPizzaCipolla() {
		return new OnionTopping(new Pizza());
	}

	@Bean
	Consummation getPizzaProsciuttoCipolla() {
		return new HamTopping(new OnionTopping(new Pizza()));
	}

	@Bean
	Consummation getCoke() {
		return new Coke(0.5);
	}

	@Bean
	Consummation getSprite() {
		return new Sprite(0.5);
	}

	@Bean
	Consummation getWater() {
		return new Water(0.5);
	}

}
