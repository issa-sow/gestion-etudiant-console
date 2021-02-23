package modele;

public class EtudiantModule {
	private long idEtudiantModule;
	private long idEtudiant;
	private long idModule;
	private double note1;
	private double note2;
	private double moyDev;
	
	public EtudiantModule(long idEtudiant, long idModule, double note1, double note2) {
		this.idEtudiant = idEtudiant;
		this.idModule = idModule;
		this.note1 = note1;
		this.note2 = note2;
		this.moyDev = calculMoyDev(note1, note2);
	}
	
	public long getIdEtudiantModule() {
		return idEtudiantModule;
	}

	public void setIdEtudiantModule(long idEtudiantModule) {
		this.idEtudiantModule = idEtudiantModule;
	}

	public long getIdEtudiant() {
		return idEtudiant;
	}

	public void setIdEtudiant(long idEtudiant) {
		this.idEtudiant = idEtudiant;
	}

	public long getIdModule() {
		return idModule;
	}

	public void setIdModule(long idModule) {
		this.idModule = idModule;
	}

	public double getNote1() {
		return note1;
	}

	public void setNote1(double note1) {
		this.note1 = note1;
	}

	public double getNote2() {
		return note2;
	}

	public void setNote2(double note2) {
		this.note2 = note2;
	}
	
	public double calculMoyDev(double note1, double note2) {
		return (note1 + note2) / 2;
	}
	
	public String toString() {
		return  "\t idEtudiantModule : " + this.idEtudiantModule + "\n" +
				"\t Id de l'étudiant : " + this.idEtudiant + "\n" +
				"\t Id du module : " + this.idModule + "\n" + 
				"\t Note 1 : " + this.note1 + "\n" + 
				"\t Note 2 :" + this.note2 + "\n" +
				"\t Moyenne devoir : " + this.moyDev + "\n" ;
	}
}
