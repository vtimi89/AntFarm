﻿package modell;

import java.util.ArrayList;

import skeleton.Logger;
/**
 * Az élelem objektum.
 */
public class Food extends Entity {

	/**
	 *  A meglévő élelem mennyisége.
	 */
	private int quantity;
	
	/**
	 * Az élelemhez tartozó szagok.
	 */
	private ArrayList<FoodOdor> foodOdors;
	
	public Food() {
		Logger.attach("Food", this);
	}
	
	/**
	 * Visszaadja a még meglévő élelem mennyiségét.
	 * @return A meglévő mennyiség.
	 */
	public int getQuantity() {
		Logger.enter(this, "getQuantity");
		Logger.exit(this);
		return 0;
	}
	
	/**
	 * Hozzáad a listához egy új élelemszagot.
	 * @param foodOdor Az élelemszag.
	 */
	public void addFoodOdor(FoodOdor foodOdor) {
		Logger.enter(this, "addFoodOdor", Logger.getObjectName(foodOdor));
		Logger.exit(this);
	}
	
	/**
	 * Ütközés egy hangyával. Csökkenti az élelem mennyiségét.
	 * @param A hangya. 
	 */
	public void collide(Ant ant) {
		Logger.enter(this, "collide", Logger.getObjectName(ant));
		Logger.exit(this);
	}
}
