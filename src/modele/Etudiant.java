package modele;

public class Etudiant extends Personne {
	private String salle;
	private Departement dep;
	
	public Etudiant(String nom, String prenom, String tel, String adresse, String email, String salle, Departement dep) {
		super(nom, prenom, tel, adresse, email);
		this.salle = salle;
		this.dep = dep;
	}

	public String getSalle() {
		return salle;
	}

	public void setSalle(String salle) {
		this.salle = salle;
	}

	public Departement getDep() {
		return dep;
	}

	public void setDep(Departement dep) {
		this.dep = dep;
	}
	
	public String toString() {
		return "[ \n" +
				"\t Information sur l'étudiant \n\n" + 
				super.toString() + 
				"\t Salle : " + this.salle +  "\n" +
				dep.toString() + "\n" +
				"] \n";
	}
}
