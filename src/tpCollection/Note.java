package tpCollection;

public class Note implements Statisticable,Comparable<Note>{
	private String intitule;
	private double note;
	public Note(String intitule, double note2) {
		super();
		this.intitule = intitule;
		this.note = note2;
	}
	public String getIntitule() {
		return intitule;
	}
	public void setIntitule(String intitule) {
		this.intitule = intitule;
	}
	public double getNote() {
		return note;
	}
	public void setNote(int note) {
		this.note = note;
	}
	@Override
	public float getValue() {
		
		return (float)note;
	}
	
	 @Override
	    public int compareTo(Note autreNote) {
	        return Double.compare(this.note, autreNote.note);
	    }
	@Override
	public String toString() {
		return "Note [intitule=" + intitule + ", note=" + note + "]";
	}
	
	 
}
