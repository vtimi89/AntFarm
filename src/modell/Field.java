package modell;

import java.util.ArrayList;
import java.util.HashMap;

import skeleton.Logger;

public class Field {

	/**
	 * A szomsz�dokat t�rol� objektum.
	 */
	private HashMap<Direction, Field> neighbours = new HashMap<Direction, Field>();
	
	/**
	 * A szagokat t�rol� lista.
	 */
	private ArrayList<Odor> odors = new ArrayList<Odor>();
	
	/**
	 * Az entit�sokat t�rol� lista.
	 */
	private ArrayList<Entity> entities = new ArrayList<Entity>();
	
	public Field() {
		Logger.attach("Field", this);
	}
	
	/**
	 * Az adott ir�nyban l�v� szomsz�d megad�sa.
	 * @param dir Az ir�ny.
	 * @param neighbour A szomsz�d mez�.
	 */
	public void setNeighbour(Direction dir, Field neighbour) {
		Logger.enter(this, "setNeighbour", "dir:" + dir.toString(), Logger.getObjectName(neighbour));		
		Logger.exit(this);
	}
	
	/**
	 * Visszaadja az adott ir�nyban l�v� szomsz�dot.
	 * @param dir Az ir�ny.
	 * @return A szomsz�d mez�.
	 */
	public Field getNeighbour(Direction dir) {
		Logger.enter(this, "getNeighbour", "dir: " + dir.toString());
		Logger.exit(this);
		return new Field();
	}
	
	/**
	 * Egy list�t ad vissza azokkal a mez�kkel, amik a mez�t�l radius t�vols�gon bel�l vannak.
	 * @param radius A t�vols�g.
	 * @return Lista a mez�kr�l.
	 */
	public ArrayList<Field> getNeighbours(int radius) {
		Logger.enter(this, "getNeighbours", "radius:int");
		Logger.exit(this);
		Logger.off();
		ArrayList<Field> list = new ArrayList<Field>();
		for (int i = 0; i < 3; i++) {			
			list.add(new Field());
		}
		list.add(this);
		Logger.on();
		return list;
	}
	
	/**
	 * A mez�ben l�v� szagok �sszintenzit�sa.
	 * @return Az �sszintenzit�s.
	 */
	public int getOdorIntensity() {
		Logger.enter(this, "getOdorIntensity");
		int intens = 0;
		for (Odor o : odors) {
			intens += o.getIntensity();
		}
		Logger.exit(this);
		return intens;
	}
	
	/**
	 * Egy szag hozz�ad�sa a mez�h�z.
	 * @param odor A szagobjektum.
	 */
	public void addOdor(Odor odor) {
		Logger.enter(this, "addOdor");
		odors.add(odor);
		Logger.exit(this);
	}
	
	/**
	 * Visszaadja a mez�ben tal�lhat� szagok list�j�t.
	 * @return A szaglista.
	 */
	public ArrayList<Odor> getOdors() {
		Logger.enter(this, "getOdors");
		Logger.exit(this);				
		return odors;
	}

	/**
	 * Szag t�rl�se a mez�r�l.
	 * @param odor A t�rlend� szagobjektum.
	 */
	public void removeOdor(Odor odor) {
		Logger.enter(this, "removeOdors", Logger.getObjectName(odor));
		odors.remove(odor);
		Logger.exit(this);
	}

	/**
	 * Entit�s hozz�ad�sa a mez�h�z.
	 * @param entity Egy entit�s.
	 */
	public void addEntity(Entity e) {
		Logger.enter(this, "addEntity", Logger.getObjectName(e));
		entities.add(e);
		Logger.exit(this);
	}

	/**
	 * Entit�s elt�vol�t�sa.
	 * @param entity T�rlend� entit�s.
	 */
	public void removeEntity(Entity e) {
		Logger.enter(this, "removeEntity", Logger.getObjectName(e));
		entities.remove(e);
		Logger.exit(this);
	}

	/**
	 * Az �sszes entit�s lek�r�se.
	 * @return Az entit�sok list�ja.
	 */
	public ArrayList<Entity> getEntities() {
		Logger.enter(this, "getEntities");
		Logger.exit(this);
		return entities;
	}	
}
