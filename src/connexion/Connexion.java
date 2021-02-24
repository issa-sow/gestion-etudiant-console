package connexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connexion {
	
	public Connection getConnection() {
		Connection connexion = null;
		
		// Chargemnt du driver
        try {
            Class.forName( "com.mysql.jdbc.Driver" );
        } catch ( ClassNotFoundException e ) {
        	System.out.println("erreur lors du chargement du driver : " + e.getMessage());
        }

        // Connexion à la base de donnée
        String url = "jdbc:mysql://localhost:3306/gestion_etudiant";
        String user = "issa";
        String password = "issa";

        try {
            connexion = DriverManager.getConnection( url, user, password );
        } catch ( SQLException e ) {
        	System.out.println("erreur lors de la connexion à la base : " + e.getMessage());
        }
		
		return connexion;	
	}
}
