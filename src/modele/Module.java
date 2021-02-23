package modele;

public class Module {
	private long idModule;
	private String nomModule;
	private String nbreHeureModule;
	
	public Module(String nomModule, String nbreHeureModule) {
		this.nomModule = nomModule;
		this.nbreHeureModule = nbreHeureModule;
	}

	public long getIdModule() {
		return idModule;
	}

	public void setIdModule(long idModule) {
		this.idModule = idModule;
	}

	public String getNomModule() {
		return nomModule;
	}

	public void setNomModule(String nomModule) {
		this.nomModule = nomModule;
	}

	public String getNbreHeureModule() {
		return nbreHeureModule;
	}

	public void setNbreHeureModule(String nbreHeureModule) {
		this.nbreHeureModule = nbreHeureModule;
	}
	
	public String toString() {
		return "\t Module { " + "\n" +
				"\t\t Id du module : " + this.idModule + "\n" +
				"\t\t Nom du module : " + this.nomModule + "\n" +
				"\t\t Nombre d'heure total  : " + this.nbreHeureModule + "\n" +
				"\t } \n" ;
	}
}