package exercice2;

import java.util.Map;
import java.util.TreeMap;

public class Annuaire {
    private Map<String, Fiche> contacts;

    public Annuaire() {
        this.contacts = new TreeMap<>(); 
    }

    public void ajouterFiche(String nom, String numero, String adresse) {
        contacts.put(nom, new Fiche(nom, numero, adresse));
    }

    public Fiche rechercherFiche(String nom) {
        return contacts.get(nom);
    }

    public void afficherAnnuaire() {
        for (Fiche fiche : contacts.values()) {
            System.out.println(fiche);
        }
    }
}