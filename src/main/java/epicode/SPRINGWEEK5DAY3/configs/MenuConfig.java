package epicode.SPRINGWEEK5DAY3.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import epicode.SPRINGWEEK5DAY3.entities.Consummation;
import epicode.SPRINGWEEK5DAY3.entities.Menu;
import epicode.SPRINGWEEK5DAY3.entities.drinks.Coke;
import epicode.SPRINGWEEK5DAY3.entities.drinks.Sprite;
import epicode.SPRINGWEEK5DAY3.entities.drinks.Water;
import epicode.SPRINGWEEK5DAY3.entities.merchandise.Cartolina;
import epicode.SPRINGWEEK5DAY3.entities.merchandise.Gadget;
import epicode.SPRINGWEEK5DAY3.entities.merchandise.Spilla;
import epicode.SPRINGWEEK5DAY3.entities.pizzas.Pizza;
import epicode.SPRINGWEEK5DAY3.entities.pizzas.PizzaXL;
import epicode.SPRINGWEEK5DAY3.entities.toppings.HamTopping;
import epicode.SPRINGWEEK5DAY3.entities.toppings.OnionTopping;
import epicode.SPRINGWEEK5DAY3.entities.toppings.SalameTopping;

@Configuration
public class MenuConfig {
	@Bean
	Menu getMenu() {
		Menu menu = new Menu();

		menu.getMenuEntries().add(getMargherita());
		menu.getMenuEntries().add(getMargheritaXL());
		menu.getMenuEntries().add(getPizzaSalame());
		menu.getMenuEntries().add(getPizzaProsciutto());
		menu.getMenuEntries().add(getPizzaCipolla());
		menu.getMenuEntries().add(getPizzaProsciuttoCipolla());
		menu.getMenuEntries().add(getCoke());
		menu.getMenuEntries().add(getSprite());
		menu.getMenuEntries().add(getWater());
		menu.getMenuEntries().add(getSpilla());
		menu.getMenuEntries().add(getCartolina());

		return menu;
	}

	@Bean(name = "margherita")
	@Scope("prototype")
	Consummation getMargherita() {
		return new Pizza();
	}

	@Bean(name = "margheritaXL")
	@Scope("prototype")
	Consummation getMargheritaXL() {
		return new PizzaXL();
	}

	@Bean(name = "pizzaProsciutto")
	Consummation getPizzaProsciutto() {
		return new HamTopping(new Pizza());
	}

	@Bean(name = "pizzaCipolla")
	Consummation getPizzaCipolla() {
		return new OnionTopping(new Pizza());
	}

	@Bean(name = "pizzaProsciuttoCipolla")
	Consummation getPizzaProsciuttoCipolla() {
		return new HamTopping(new OnionTopping(new Pizza()));
	}

	@Bean(name = "diavola")
	Consummation getPizzaSalame() {
		return new SalameTopping(new Pizza());
	}

	@Bean(name = "coca cola")
	Consummation getCoke() {
		return new Coke(0.5);
	}

	@Bean(name = "sprite")
	Consummation getSprite() {
		return new Sprite(0.5);
	}

	@Bean(name = "acqua")
	Consummation getWater() {
		return new Water(0.5);
	}

	@Bean(name = "spilla")
	Gadget getSpilla() {
		return new Spilla("spilla");
	}

	@Bean(name = "cartolina")
	Gadget getCartolina() {
		return new Cartolina("cartolina");
	}

}
