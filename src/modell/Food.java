package modell;

import java.util.ArrayList;

import skeleton.Logger;
/**
 * Az �lelem objektum.
 */
public class Food extends Entity {

	/**
	 *  A megl�v� �lelem mennyis�ge.
	 */
	private int quantity;
	
	/**
	 * Az �lelemhez tartoz� szagok.
	 */
	private ArrayList<FoodOdor> foodOdors = new ArrayList<FoodOdor>();
	
	public Food() {
		Logger.attach("Food", this);
	}
	
	/**
	 * Visszaadja a m�g megl�v� �lelem mennyis�g�t.
	 * @return A megl�v� mennyis�g.
	 */
	public int getQuantity() {
		Logger.enter(this, "getQuantity");
		for (FoodOdor fo : foodOdors) {
			fo.evaporate();
		}
		Logger.exit(this);
		return 0;
	}
	
	/**
	 * Hozz�ad a list�hoz egy �j �lelemszagot.
	 * @param foodOdor Az �lelemszag.
	 */
	public void addFoodOdor(FoodOdor foodOdor) {
		Logger.enter(this, "addFoodOdor", Logger.getObjectName(foodOdor));
		foodOdors.add(foodOdor);
		Logger.exit(this);
	}
	
	/**
	 * �tk�z�s egy hangy�val. Cs�kkenti az �lelem mennyis�g�t.
	 * @param A hangya. 
	 */
	public void collide(Ant ant) {
		Logger.enter(this, "collide", Logger.getObjectName(ant));
		Logger.exit(this);
	}
}
