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
	
	@Test
	public void unPanierCH() {
		Panier panierDE = new Panier(2,1);
		assertTrue(6527.96*1.08 == panierDE.getPrice("CH"));
	}
	
	@Test
	public void unPanierFR() {
		Panier panierDE = new Panier(2,1);
		assertTrue(6527.96*1.196 == panierDE.getPrice("FR"));
	}
	
	@Test
	public void unPanierReduction15() {
		Panier panierDE = new Panier(40000,20000);
		assertTrue(130559200 * 0.85 == panierDE.getPrice());
	}
	
	@Test
	public void unPanierReduction10() {
		Panier panierDE = new Panier(9800,300);
		assertTrue(3798204 * 0.9 == panierDE.getPrice());
	}
	
	@Test
	public void unPanierReduction7() {
		Panier panierDE = new Panier(6500,700);
		assertTrue(5589470 * 0.93 == panierDE.getPrice());
	}
	
	@Test
	public void unPanierReduction5() {
		Panier panierDE = new Panier(4900,200);
		assertTrue(2205502 * 0.95 == panierDE.getPrice());
	}
	
	@Test
	public void unPanierReduction3() {
		Panier panierDE = new Panier(2000,50);
		assertTrue(706360 * 0.97 == panierDE.getPrice());
	}
}
