package modell;

import skeleton.Logger;

public class Odor {
	
	/**
	 * A szag intenzit�sa.
	 */
	protected int intensity;
	
	/**
	 * A mez�, amihez tartozik.
	 */
	protected Field position;
	
	/**
	 * Visszaadja a szag intenzit�s�t.
	 * @return intezit�s.
	 */
	public int getIntensity() {
		Logger.enter(this, "getIntensity");
		Logger.exit(this);
		return intensity;
	}
	
	/**
	 * Visszadja a pozici�t.
	 * @return a pozici�.
	 */
	public Field getPosition() {
		return position;
	}
	
	/**
	 * Be�ll�tja az �j pozici�t.
	 * @param position Az �j pozici�.
	 */
	public void setPosition(Field position) {
		this.position = position;
	}
	
	/**
	 * Az intezit�s be�ll�t�sa.
	 * @param i Az intezit�s �rt�ke.
	 */
	public void setIntensity(int i) {
		Logger.enter(this, "setIntensity", "i:int");
		this.intensity = i;
		Logger.exit(this);
	}
	/**
	 * Semleges�t�s, a k�l�nb�z� lesz�rmazottak fogj�k implement�lni.
	 */
	public void neutralize() {
		
	}

}
