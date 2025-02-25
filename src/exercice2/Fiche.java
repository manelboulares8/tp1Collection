package exercice2;

public class Fiche implements Comparable<Fiche> {
    private String nom;
    private String numero;
    private String adresse;

    public Fiche(String nom, String numero, String adresse) {
        this.nom = nom;
        this.numero = numero;
        this.adresse = adresse;
    }

    public String getNom() {
        return nom;
    }

    @Override
    public int compareTo(Fiche autre) {
        return this.nom.compareTo(autre.nom);
    }

    @Override
    public String toString() {
        return "Nom: " + nom + ", Numéro: " + numero + ", Adresse: " + adresse;
    }
}