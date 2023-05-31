package epicode.SPRINGWEEK5DAY3;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import epicode.SPRINGWEEK5DAY3.configs.MenuConfig;
import epicode.SPRINGWEEK5DAY3.entities.Consummation;
import epicode.SPRINGWEEK5DAY3.entities.Menu;
import epicode.SPRINGWEEK5DAY3.entities.Product;
import epicode.SPRINGWEEK5DAY3.entities.drinks.Drink;
import epicode.SPRINGWEEK5DAY3.entities.merchandise.Gadget;
import epicode.SPRINGWEEK5DAY3.entities.orders.Order;
import epicode.SPRINGWEEK5DAY3.entities.orders.StatoOrdine;
import epicode.SPRINGWEEK5DAY3.entities.orders.StatoTavolo;
import epicode.SPRINGWEEK5DAY3.entities.orders.Table;
import epicode.SPRINGWEEK5DAY3.entities.pizzas.Pizza;
import epicode.SPRINGWEEK5DAY3.entities.toppings.SalameTopping;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class MenuRunner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(MenuConfig.class);
		Menu menu = ctx.getBean(Menu.class);

		menu.print();

		Consummation pizza1 = (Pizza) ctx.getBean("margherita");
		SalameTopping pizza2 = (SalameTopping) ctx.getBean("diavola");
		Gadget spilletta1 = (Gadget) ctx.getBean("spilla");
		Drink bibita1 = (Drink) ctx.getBean("sprite");

		List<Product> lista1 = new ArrayList<>();
		lista1.add(spilletta1);
		lista1.add(pizza1);
		lista1.add(pizza2);
		lista1.add(bibita1);

		Table tavolo1 = new Table(2, 4, StatoTavolo.OCCUPATO);

		Order ordine1 = new Order(1, tavolo1, lista1, StatoOrdine.INCORSO, 2, LocalDateTime.of(2023, 05, 30, 12, 30));
		log.info(ordine1.toString());

		ctx.close();

	}

}
