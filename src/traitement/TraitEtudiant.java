package traitement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import connexion.Connexion;
import modele.Etudiant;

public class TraitEtudiant {
	private Scanner sc = new Scanner(System.in);
	private Connexion connexionBD = new Connexion();
	private Connection connexion = null;
	private PreparedStatement statement;
	
	public void insertEtudiant() {
		//Recup�ration de la connexion
		connexion = connexionBD.getConnection();
		
		List<Etudiant> etudiants = new ArrayList<>();

		char YesOrNo = ' ';
		do {
			//R�cup�ration des informations de l'�tudiant
			Etudiant etu = new Etudiant();
			
			System.out.println("Saisissez les donn�es de l'�tudiant");
			
			System.out.print("\t Nom : " );
			etu.setNom(sc.nextLine());
			
			System.out.print("\t Prenom : " );
			etu.setPrenom(sc.nextLine());
			
			System.out.print("\t T�l�phone : " );
			etu.setTel(sc.nextLine());
			
			System.out.print("\t Adresse : " );
			etu.setAdresse(sc.nextLine());
			
			System.out.print("\t E-mail : " );
			etu.setEmail(sc.nextLine());
			
			System.out.print("\t Salle : " );
			etu.setSalle(sc.nextLine());
			
			System.out.print("\t Niveau : " );
			etu.setNiveau(sc.nextLine());
			
			//Insertion des donn�es de l'�tudiant 
			String sqlQuery = "INSERT INTO Etudiant VALUES(null, ?, ?, ?, ?, ?, ?, ?);";
			try {
				statement = connexion.prepareStatement( sqlQuery );
	            statement.setString( 1, etu.getNom() );
	            statement.setString( 2, etu.getPrenom() );
	            statement.setString( 3, etu.getTel() );
	            statement.setString( 4, etu.getAdresse() );
	            statement.setString( 5, etu.getEmail() );
	            statement.setString( 6, etu.getSalle() );
	            statement.setString( 7, etu.getNiveau() );

	            statement.executeUpdate();

	        } catch ( SQLException e ) {
	        	System.out.println("L'insertion sur la BDD a �chou�!" + e.getMessage());
	        }
			
			//Ajout de l'etudiant dans la liste  d'�tudiant
			etudiants.add(etu);
			
			//On donne la possibilit� � l'utilisateur d'inscrire un autre �tudiant
			do {
				System.out.println("Voulez-vous inserer un autre �tudiant (O/N) ?");
				YesOrNo = sc.nextLine().charAt(0);
			}while(YesOrNo != 'O' && YesOrNo != 'N');
			
		}while(YesOrNo == 'O');
		
		System.out.println("\t Vioci la liste des �tudiants que vous avez enregistr� dans la BDD");
		
		for(Etudiant etu : etudiants) {
			System.out.println(etu.toString());
		}
		
		// Fermeture de la connexion
        try {
            if ( statement != null )
                statement.close();
            if ( connexion != null )
                connexion.close();
        } catch ( SQLException e ) {

        }
        
	}
}
