package modell;

import skeleton.Logger;

public abstract class Spray {
	
	/**
	 * A rendelekez�sre �ll� f�j�sok sz�ma.
	 */
	private int quantity;
	
	/**
	 * A hat�sug�r m�rete.
	 */
	protected int radius;
	
	protected Glade glade;
	
	/**
	 * A param�terk�nt �tadott mez� k�r� f�j�s.
	 * @param center
	 */
	public abstract void use(Field center);
	
	/**
	 * Visszaadja a m�g rendelekez�sre �ll� f�j�sok sz�m�t.
	 * @return A f�j�sok sz�ma.
	 */
	public int getQuantity() {
		Logger.enter(this, "getQuantity");
		Logger.exit(this);
		return quantity;
	}

	/**
	 * Be�ll�tja f�j�sok sz�m�t.
	 * @param quantity A f�j�sok sz�ma.
	 */
	public void setQuantity(int quantity) {
		Logger.enter(this, "setQuantity", "quantity:int");
		this.quantity = quantity;
		Logger.exit(this);
	}

	/**
	 * Visszaadja a hat�sug�r m�rtet�t.
	 * @return A hat�sug�r
	 */
	public int getRadius() {
		Logger.enter(this, "getRadius");
		Logger.exit(this);
		return radius;
	}

	/**
	 * Be�ll�tja a hat�sugarat.
	 * @param radius A hat�sug�r m�rete.
	 */
	public void setRadius(int radius) {
		Logger.enter(this, "setRadius", "radius:int");
		this.radius = radius;
		Logger.exit(this);
	}
}
