import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestElephantCarpaccio {

	@Test 
	public void uneChevre() {
		Panier panier1Item = new Panier(1);
		assertTrue(199.98d == panier1Item.getPrice());
	}
	
}
