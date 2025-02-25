package tpCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
public class Etudiant implements Statisticable,Comparable<Etudiant>{
	private String matricule;
	private String nom ;
	private ArrayList<Note> ListeNotes;
	public Etudiant(String matricule, String nom) {
		super();
		this.matricule = matricule;
		this.nom = nom;
		this.ListeNotes =new ArrayList<>();
	}
	public String getMatricule() {
		return matricule;
	}
	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public ArrayList<Note> getListeNotes() {
		return ListeNotes;
	}
	public void setListeNotes(ArrayList<Note> listeNotes) {
		ListeNotes = listeNotes;
	}
	
	public void addNote(String intituleCours, double note) {
        ListeNotes.add(new Note(intituleCours, note));
    }
	
	
	 public int getBestNote() {
	       
	        return (int) (Collections.max(ListeNotes)).getNote();
	    }

	 
	 
	    public int getWorstNote() {
	        
	        return (int) ( Collections.min(ListeNotes)).getNote();
	    }

	    public void afficherNotes() {
	        System.out.println("Notes de " + nom + " (Matricule: " + matricule + "):");
	        for (Note note : ListeNotes) {
	            System.out.println(note);
	        }
	        System.out.println("Moyenne: " + getValue());
	        System.out.println("Meilleure note: " + getBestNote());
	        System.out.println("Moins bonne note: " + getWorstNote());
	    }
	
	public void addNotte(Note note) {
		ListeNotes.add(note);
	}
	@Override
	public float getValue() {
        if (ListeNotes.isEmpty()) {
            return 0;
        }
        double sum = 0;
        for (Note note : ListeNotes) {
            sum += note.getNote();
        }
        return (float) (sum / ListeNotes.size());
    }
	@Override
	public int compareTo(Etudiant o) {
		return Double.compare(this.getValue(), o.getValue());
	}
	@Override
	public String toString() {
		return "Etudiant [matricule=" + matricule + ", nom=" + nom + ", ListeNotes=" + ListeNotes + "]";
	}
	
	
}
