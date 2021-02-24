package modele;

public class Personne {
	protected long id;
	protected String nom;
	protected String prenom;
	protected String tel;
	protected String adresse;
	protected String email;
	
	public Personne() {
		this.nom = null;
		this.prenom = null;
		this.tel = null;
		this.adresse = null;
		this.email = null;
	}
	
	public Personne(String nom, String prenom, String tel, String adresse, String email) {
		this.nom = nom;
		this.prenom = prenom;
		this.tel = tel;
		this.adresse = adresse;
		this.email = email;
	}
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public String toString() {
		return  "\t idEtudiant : " + this.id + "\n" + 
				"\t Nom : " + this.nom + "\n" + 
				"\t Prenom : " + this.prenom + "\n" +
				"\t Téléphone : " + this.tel + "\n" +
				"\t Adresse : " + this.adresse + "\n" +
				"\t E-mail : " + this.email + "\n" ;
	}
	
}
