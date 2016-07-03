package ex3;

public class Manager extends Employe {

	public Manager(String nom, String prenom) {
		super(nom, prenom);
	}

	@Override
	public String toString() {
		return " Manager [Nom =" + getNom() + ", Prenom=" + getPrenom() + "]";
	}

}
