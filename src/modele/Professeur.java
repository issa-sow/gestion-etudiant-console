package modele;

public class Professeur extends Personne { 
	private String grade;
	
	public Professeur(String nom, String prenom, String tel, String adresse, String email, String grade) {
		super(nom, prenom, tel, adresse, email);
		this.grade = grade;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	public String toString() {
		return "[ \n" +
				"\t Information sur le professeur \n\n" + 
				super.toString() + 
				"\t Grade : " + this.grade +  "\n" +
				"] \n";
	}
}
