package modell;

/**
 * Az �lelemszag objektum.
 */
public class FoodOdor extends Odor {
	
	public FoodOdor() {	}
	/**
	 * T�rli mag�t a mez�r�l.
	 */
	public void evaporate() {
		position.removeOdor(this);
	}
	
	/**
	 * A semlegesito metodus mivel a szag nem semlegesitheto nem csinal semmit.
	 * @return Hardcoded false.
	 */
	public void neutralize() {	}
}
