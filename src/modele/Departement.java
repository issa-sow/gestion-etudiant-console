package modele;

public class Departement {
	private long idDep;
	private String nomDep;
	private String niveau;
	private String tel;
	private String chefDep;
	
	public Departement(String nomDep, String niveau, String tel, String chefDep) {
		this.nomDep = nomDep;
		this.niveau = niveau;
		this.tel = tel;
		this.chefDep = chefDep;
	}

	public long getIdDep() {
		return idDep;
	}

	public void setIdDep(long idDep) {
		this.idDep = idDep;
	}

	public String getNomDep() {
		return nomDep;
	}

	public void setNomDep(String nomDep) {
		this.nomDep = nomDep;
	}

	public String getNiveau() {
		return niveau;
	}

	public void setNiveau(String niveau) {
		this.niveau = niveau;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getChefDep() {
		return chefDep;
	}

	public void setChefDep(String chefDep) {
		this.chefDep = chefDep;
	}
	
	public String toString() {
		return "\t" + "Departement: { " + "\n" +
				"\t\t" + "id du département : " + this.idDep + "\n" +
				"\t\t" + "Nom du département : " + this.nomDep + "\n" +
				"\t\t" + "Niveau : " + this.niveau + "\n" +
				"\t\t" + "Téléphone : " + this.tel + "\n" +
				"\t\t" + "Chef du département : " + this.chefDep + "\n" +
				"\t } \n" ;
	}
}
