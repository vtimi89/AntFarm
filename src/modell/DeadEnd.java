package modell;

import skeleton.Logger;

/**
 * A p�lyasz�le objektum. 
 *
 */
public class DeadEnd extends Entity {

	public DeadEnd() {
		Logger.attach("Deadend", this);
	}
	
	/**
	 * �tk�z�s hangy�val, meg�li a hangy�t.
	 * @param ant A hangya, amivel �tk�zik.
	 */
	public void collide(Ant ant) {
		Logger.enter(this, "collide", Logger.getObjectName(ant));
		ant.kill();
		Logger.exit(this);
	}
	
	/**
	 * �tk�z�s hangy�szs�nnel, pihenni k�ldi a hangy�szt.
	 * @param anteater A hangy�szs�n, amivel �tk�zik,.
	 */
	public void collide(Anteater anteater) {
		Logger.enter(this, "collide", Logger.getObjectName(anteater));
		anteater.goRest();
		Logger.exit(this);
	}
}
