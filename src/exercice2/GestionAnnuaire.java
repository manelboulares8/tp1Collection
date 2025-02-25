package exercice2;

import java.util.Scanner;

public class GestionAnnuaire {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Annuaire annuaire = new Annuaire();
        
        while (true) {
            System.out.print("Commande : ");
            String commande = scanner.nextLine();
            
            if (commande.equals(".")) {
                System.out.println("Fin du programme.");
                break;
            } else if (commande.startsWith("?")) {
                String nom = commande.substring(1);
                Fiche fiche = annuaire.rechercherFiche(nom);
                if (fiche != null) {
                    System.out.println(fiche);
                } else {
                    System.out.println("Aucune fiche trouvée pour " + nom);
                }
            } else if (commande.startsWith("+")) {
                String nom = commande.substring(1);
                System.out.print("Numéro : ");
                String numero = scanner.nextLine();
                System.out.print("Adresse : ");
                String adresse = scanner.nextLine();
                annuaire.ajouterFiche(nom, numero, adresse);
                System.out.println("Fiche ajoutée.");
            } else if (commande.equals("!")) {
                annuaire.afficherAnnuaire();
            } else {
                System.out.println("Commande invalide.");
            }
        }
        scanner.close();
    }
}
