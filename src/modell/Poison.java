package modell;

import skeleton.Logger;
/**
 * A m�reg objektum.
 */
public class Poison extends Entity implements Active {
	
	/**
	 * A h�tral�v� id�, am�g m�g a p�ly�n lesz a m�reg.
	 */
	private int TTL;

	public Poison() {
		Logger.attach("Poison", this);
	}
	
	public Poison(Glade glade, Field pos) {
		Logger.attach("Poison", this);
		this.glade = glade;
		setPosition(pos);
	}
	
	/**
	 * A m�reg anim�l�sa. Midenk�rben cs�kkenti a h�tral�v� id�t.
	 */
	public void animate() {
		Logger.enter(this, "animate");
		glade.removeActiveObject(this);
		getPosition().removeEntity(this);
		Logger.exit(this);
	}
	
	/**
	 * �tk�z�s egy hangy�val. Megm�rgezi a hangy�t.
	 */
	public void collide(Ant ant) {
		Logger.enter(this, "collide", Logger.getObjectName(ant));
		ant.poison();
		Logger.exit(this);
	}

}
