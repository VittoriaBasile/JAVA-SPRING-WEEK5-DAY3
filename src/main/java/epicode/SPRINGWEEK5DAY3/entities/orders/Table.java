package epicode.SPRINGWEEK5DAY3.entities.orders;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Table {
	private int numeroTavolo;
	private int copertiMassimi;
	private StatoTavolo statoTavolo;

}
