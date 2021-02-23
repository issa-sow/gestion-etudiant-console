package modele;

public class ProfModuleDepart {
	private long idProfModuleDepart;
	private long idProfesseur;
	private long idModule;
	private long idDepartement;
	
	public ProfModuleDepart(long idProfesseur, long idModule, long idDepartement) {
		this.idProfesseur = idProfesseur;
		this.idModule = idModule;
		this.idDepartement = idDepartement;
	}

	public long getIdProfModuleDepart() {
		return idProfModuleDepart;
	}

	public void setIdProfModuleDepart(long idProfModuleDepart) {
		this.idProfModuleDepart = idProfModuleDepart;
	}
	
	public long getIdProfesseur() {
		return idProfesseur;
	}

	public void setIdProfesseur(long idProfesseur) {
		this.idProfesseur = idProfesseur;
	}

	public long getIdModule() {
		return idModule;
	}

	public void setIdModule(long idModule) {
		this.idModule = idModule;
	}

	public long getIdDepartement() {
		return idDepartement;
	}

	public void setIdDepartement(long idDepartement) {
		this.idDepartement = idDepartement;
	}

	public String toString() {
		return 	"\t IdProfModuleDepart : " + this.idProfModuleDepart + "\n" +
				"\t IdProfesseur : " + this.idProfesseur + "\n" +
				"\t IdModule : " + this.idModule + "\n" + 
				"\t IdDepartement : " + this.idDepartement + "\n" ;
	}
}
