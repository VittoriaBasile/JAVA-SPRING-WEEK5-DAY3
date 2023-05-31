package epicode.SPRINGWEEK5DAY3.entities.merchandise;

public class Spilla extends Gadget {

	public Spilla(String spilla) {
		super(spilla);
		setName("spilla");
		setPrice(3.00);

	}

	@Override
	public String toString() {
		return getName() + ", " + "prezzo: " + getPrice() + "€";
	}
}
