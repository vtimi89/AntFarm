package modell;

import skeleton.Logger;

/**
 * Az entit�s objektum. 
 */
public abstract class Entity {
	
	/**
	 * A mez�, amin az entit�s van.
	 */
	protected Field position;
	
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
	 * �tk�z�s egy hangy�val. A lesz�rmazottak k�l�nb�z� m�don implemet�lhatj�k, 
	 * att�l f�gg�en mi t�rt�njen az �tk�z�s sor�n.
	 * @param ant A hangya, amivel �tk�zik.
	 */
	public void collide(Ant ant) {		
		// A leszarmazottak fogjak implementalni szukseg eseten
	}
	
	/**
	 * �tk�z�s egy hangy�szs�nnel. A lesz�rmazottak k�l�nb�z� m�don implemet�lhatj�k, 
	 * att�l f�gg�en mi t�rt�njen az �tk�z�s sor�n.
	 * @param anteater A hangy�ss�n, amivel �tk�zik.
	 */
	public void collide(Anteater anteater) {
		// A leszarmazottak fogjak implementalni szukseg eseten
	}
}
