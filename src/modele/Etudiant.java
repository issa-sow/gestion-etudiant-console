package modele;

public class Etudiant extends Personne {
	private String salle;
	private String niveau;
	
	public Etudiant() {
		super();
		this.salle = null;
	}
	
	public Etudiant(String nom, String prenom, String tel, String adresse, String email, String salle, String niveau) {
		super(nom, prenom, tel, adresse, email);
		this.salle = salle;
		//this.idDep = idDep;
		this.niveau = niveau;
	}

	public String getSalle() {
		return salle;
	}

	public void setSalle(String salle) {
		this.salle = salle;
	}

	public String getNiveau() {
		return niveau;
	}
	
	public void setNiveau(String niveau) {
		this.niveau = niveau;
	}
	
	public String toString() {
		return "[ \n" +
				"\t Information sur l'étudiant \n\n" + 
				super.toString() + 
				"\t Salle : " + this.salle +  "\n" +
				"\t Niveau : " + this.niveau +  "\n" +
				"] \n";
	}
}
