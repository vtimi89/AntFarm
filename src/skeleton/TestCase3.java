package skeleton;

import modell.Anteater;
import modell.Field;
import modell.Glade;

public class TestCase3 extends TestCase {
	
	public void test() {

		Logger.off();
		
		Glade glade = new Glade();
		Field field = new Field();		
		Anteater anteater = new Anteater(glade, field);
		
		Logger.on();
		
		anteater.animate();

	}

}