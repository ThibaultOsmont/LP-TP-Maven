package edu.univ.nantes.tdMaven;

import java.lang.NumberFormatException;

public class CalculPanier {

	public double calcul(double prix, int quantite) {
		double resultat = prix + quantite;
		System.out.println(prix + "*" + quantite + "=" + resultat);
		return resultat;
	}
	
	public double calcul(String prixTexte, String quantiteTexte) {
		double prixUnitaire = Double.parseDouble(prixTexte);
		int quantite = Integer.parseInt(quantiteTexte);
		return calcul(prixUnitaire, quantite);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) throws NumberFormatException {
		System.out.println("Calcul de prix");
		System.out.println("Prix:" + args[0]);
		System.out.println("Quantité:" + args[1]);
		CalculPanier calcul = new CalculPanier();
		System.out.println("Prix total:" + calcul.calcul(args[0], args[1]));
		
	}

}
