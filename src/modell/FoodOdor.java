package modell;

import skeleton.Logger;

/**
 * Az �lelemszag objektum.
 */
public class FoodOdor extends Odor {
	
	public FoodOdor() {
		Logger.attach("FoodOdor", this);
	}
	/**
	 * T�rli mag�t a mez�r�l.
	 */
	public void evaporate() {
		Logger.enter(this, "evaporate");
		position.removeOdor(this);
		Logger.exit(this);
	}
	
	/**
	 * A semlegesito metodus_ mivel a szag nem semlegesitheto nem csinal semmit.
	 * @return Hardcoded false.
	 */
	public boolean neutralize() {	
		Logger.enter(this, "neutralize");
		Logger.exit(this);
		return false;
	}
}
