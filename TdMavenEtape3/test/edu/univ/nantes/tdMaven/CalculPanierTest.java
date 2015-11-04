package edu.univ.nantes.tdMaven;

import edu.univ.nantes.tdMaven.CalculPanier;

import junit.framework.TestCase;

public class CalculPanierTest extends TestCase {

	CalculPanier calcul;
		
	public void setUp() {
		calcul = new CalculPanier();
	}
		
	public void testCalcul() {
		assertEquals(15.0d, calcul.calcul("3", "5"), 0);
		assertEquals(15.0d, calcul.calcul(3, 5), 0);
	}
	
	public void testCalculAvecParametreInvalide() {
		try {
			calcul.calcul("XXX", "5");
			fail("Une exception aurait du être levée");
		} catch (NumberFormatException e) {
		}
		
		try {
			calcul.calcul("2", "XXX");
			fail("Une exception aurait du être levée");
		} catch (NumberFormatException e) {
		}
	}

}
