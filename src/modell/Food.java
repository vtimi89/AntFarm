package modell;

import java.util.ArrayList;

/**
 * Az elelem objektum.
 */
public class Food extends Entity {

	/**
	 *  A meglevo elelem mennyisege.
	 */
	private int quantity;
	
	/**
	 * Az elelemhez tartozo szagok.
	 */
	private ArrayList<FoodOdor> foodOdors = new ArrayList<FoodOdor>();
	
	public Food() {}
	
	/**
	 * Visszaadja a meg meglevo elelem mennyiseget. Ha nulla akkor t�rli a szagokat.
	 * @return A megl�v� mennyis�g.
	 */
	public int getQuantity() {
		if (quantity == 0) {
			for (FoodOdor fo : foodOdors) {
				fo.evaporate();
			}
			foodOdors.clear();
			position.removeEntity(this);
		} 
		return quantity;
	}
	
	/**
	 * Hozzaad a listahoz egy uj elelemszagot.
	 * @param foodOdor Az elelemszag.
	 */
	public void addFoodOdor(FoodOdor foodOdor) {
		foodOdors.add(foodOdor);
	}
	
	/**
	 * Utkozes egy hangyaval. Csokkenti az elelem mennyiseget.
	 * @param ant hangya. 
	 */
	public void collide(Ant ant) {
		ant.eat();
		quantity--;
	}
}
