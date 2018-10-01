import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestElephantCarpaccio {

	@Test 
	public void uneChevre() {
		Panier panier1Item = new Panier(1,0);
		assertTrue(199.98 == panier1Item.getPrice());
	}
	
	@Test 
	public void unPanier() {
		Panier panierFinal = new Panier(5,2);
		assertTrue(13255.9 == panierFinal.getPrice());
	}
	
	@Test
	public void unPanierDE() {
		Panier panierDE = new Panier(2,1);
		assertTrue(6527.96*1.29 == panierDE.getPrice("DE"));
	}
	
	@Test
	public void unPanierDK() {
		Panier panierDE = new Panier(2,1);
		assertTrue(6527.96*1.25 == panierDE.getPrice("DK"));
	}
	
	@Test
	public void unPanierHR() {
		Panier panierDE = new Panier(2,1);
		assertTrue(6527.96*1.25 == panierDE.getPrice("HR"));
	}
	
	@Test
	public void unPanierIS() {
		Panier panierDE = new Panier(2,1);
		assertTrue(6527.96*1.255 == panierDE.getPrice("IS"));
	}
}
