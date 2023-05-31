package epicode.SPRINGWEEK5DAY3;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import epicode.SPRINGWEEK5DAY3.configs.MenuConfig;
import epicode.SPRINGWEEK5DAY3.entities.Menu;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class MenuRunner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(MenuConfig.class);
		Menu menu = ctx.getBean(Menu.class);

		menu.print();
		System.out.println("ciaooooooooooo");
		ctx.close();

	}

}
