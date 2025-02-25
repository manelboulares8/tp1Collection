package tpCollection;

import java.util.Comparator;

public class CompareMoyenne implements Comparator<Etudiant>{

	@Override
	public int compare(Etudiant o1, Etudiant o2) {
		// TODO Auto-generated method stub
		return (int) (o1.getValue()-o2.getValue());
	}
	

}
