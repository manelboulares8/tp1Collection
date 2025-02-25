package tpCollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Stats {
	
	public void InfosEtudiant(Etudiant e ) {
		System.out.println("la moyenne de "+e.getNom()+":\n"+e.getValue());
		System.out.println("\nla meilleure note de "+e.getNom()+":\n"+e.getBestNote());
		System.out.println("\nla moins bonne note de "+e.getNom()+":\n"+e.getWorstNote());

	}
	 public static float moyenneGroupe(List<Etudiant> etudiants) {
	        if (etudiants == null || etudiants.isEmpty()) {
	            throw new IllegalArgumentException("La liste des étudiants est vide ou non initialisée.");
	        }

	        float sommeMoyennes = 0;
	        for (Etudiant etudiant : etudiants) {
	            sommeMoyennes += etudiant.getValue();
	        }
	        return sommeMoyennes / etudiants.size();
	    }
	 
	 public void meilleureEtudiant(List<Etudiant> etudiants) {
		System.out.println("le meilleure etudiant est : "+(Collections.max(etudiants)).getNom());
	 }
	 
	 public void moinsBonsEtudiant(List<Etudiant> etudiants) {
			System.out.println("le moins bon etudiant est : "+(Collections.min(etudiants)).getNom());
	 }
	 
	 public void TrierSelonMat(List<Etudiant> etudiants) {
		 Collections.sort(etudiants,new matriculeComp());
	 }
	 
	 public void TrierSelonNom(List<Etudiant> etudiants) {
		 Collections.sort(etudiants,new CompareNom());

	 }
}
