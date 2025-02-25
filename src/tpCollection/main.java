package tpCollection;

import java.util.ArrayList;


public class main {
	public static void main(String[]args) {
		Etudiant e1 =new Etudiant("MB23","Manel");
		Etudiant e2 =new Etudiant("GJ21","Ghofrane");
		Etudiant e3 =new Etudiant("FG20","Farah");
		Etudiant e4 =new Etudiant("SM17","Sara");
		e1.addNote("POO", 18);
		e1.addNote("UML", 19);
		e2.addNote("POO", 17);
		e2.addNote("UML", 16);
		e3.addNote("POO", 14.5);
		e3.addNote("UML", 12);
		e4.addNote("POO", 16.5);
		e4.addNote("UML", 12.5);
		
		Stats statistique = new Stats();
		
		statistique.InfosEtudiant(e4);
		statistique.InfosEtudiant(e3);
		statistique.InfosEtudiant(e2);
		statistique.InfosEtudiant(e1);
		
		ArrayList<Etudiant> ListeEtudiants=new ArrayList<>();
		ListeEtudiants.add(e1);
		ListeEtudiants.add(e2);
		ListeEtudiants.add(e3);
		ListeEtudiants.add(e4);
		
		
		statistique.meilleureEtudiant(ListeEtudiants);
		statistique.moinsBonsEtudiant(ListeEtudiants);
		statistique.moyenneGroupe(ListeEtudiants);
		
		statistique.TrierSelonMat(ListeEtudiants);
		System.out.println("trié selon le matricule : \n");
		for (Etudiant etud : ListeEtudiants) {
            System.out.println(etud.toString());
        }
		statistique.TrierSelonNom(ListeEtudiants);
		System.out.println("trié selon le nom : \n");

		for (Etudiant etud : ListeEtudiants) {
            System.out.println(etud.toString());
        }
	}
}
