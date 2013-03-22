package modell;

import skeleton.Logger;
/**
 * Fat�rzs akad�ly.
 */
public class Log extends Barricade {
	
	public Log() {
		Logger.attach("Log", this);
	}
	
	/**
	 * �tk�z�s egy hangy�szs�nnel. Blokkolja a hangy�szs�nt.
	 * @param anteater A hangy�szs�n, amivel �tk�zik.
	 */
	public void collide(Anteater anteater) {
		Logger.enter(this, "collide", Logger.getObjectName(anteater));
		anteater.block();
		Logger.exit(this);
	}

}
