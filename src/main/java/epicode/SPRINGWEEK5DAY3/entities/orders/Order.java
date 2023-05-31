package epicode.SPRINGWEEK5DAY3.entities.orders;

import java.time.LocalDateTime;
import java.util.List;

import epicode.SPRINGWEEK5DAY3.entities.Product;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
//@Component
public class Order {
	private int numeroOrdine;
	private Table tavolo;
	private List<Product> comanda;
	private StatoOrdine statoOrdine;
	private int coperti;
	private LocalDateTime oraAcquisizione;
	// @Value("${application.costoCoperto}")
	private double costoCoperto = 2.00;
	private double costoCoperti;

	private double importoTotale;

	public Order(int numeroOrdine, Table tavolo, List<Product> comanda, StatoOrdine statoOrdine, int coperti,
			LocalDateTime oraAcquisizione) {
		super();
		this.numeroOrdine = numeroOrdine;
		this.tavolo = tavolo;
		this.comanda = comanda;
		this.statoOrdine = statoOrdine;
		this.coperti = coperti;
		this.oraAcquisizione = oraAcquisizione;
		this.costoCoperti = coperti * costoCoperto;
		setImportoTotale(totale(comanda) + this.costoCoperti);
	}

	// @PostConstruct
	public double totale(List<Product> lista) {
		return lista.stream().mapToDouble(Product::getPrice).sum();

	}
}
