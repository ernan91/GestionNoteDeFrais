package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import metier.User;

public class UserDao  implements GestionDao<User>{

	@Override
	public int  insert(User t) throws SQLException {
		// TODO Auto-generated method stub
		
		// connection à la base de données
		Connection  connection =  Connect.getInstance().getConnection() ;
		
		// Creer la requete MYSqL 
		
		String req= " INSERT INTO `user`( nom, `prenom`, `email`, `mdp`, `role`) VALUES (?,?,?,?,?) " ;
		
		// creer l'objet ou l'instance PreparedStatement
		
		PreparedStatement   stmt = connection.prepareStatement(req);
		
		stmt.setString(1, t.getNom());
		stmt.setString(2, t.getPrenom());
		stmt.setString(3, t.getMail());
		stmt.setString(4, t.getMdp());
		stmt.setString(5, t.getRole());
		
		
		
		int nbligne = stmt.executeUpdate();
		stmt.close();
		connection.close();
		
		return nbligne ;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		
		
		return 0;
	}

	@Override
	public int update(User t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<User> findAll() throws SQLException {
		// TODO Auto-generated method stub
		
		Connection connection = Connect.getInstance().getConnection();
		
		String req = " select * from user";
		
		PreparedStatement stmt = connection.prepareStatement(req);
		//  ligne 1  -> id =>1 , nom => "Guerfi", prenom => "Souhila".....
		// ligne 2 id =>2 , nom =>" Dupont", prenom => "Jean"....
		///..................
		 
		ResultSet liste = stmt.executeQuery() ;
		List<User>   listeUser = new ArrayList<User>();
		while(liste.next()) {
			
			int id = liste.getInt("id");
			String nom = liste.getString("nom");
			String prenom = liste.getString("prenom");
			String email = liste.getString("email");
			String mdp = liste.getString("mdp");
			String role = liste.getString("role");
		    User user = new User();
		    user.setId(id);
		    user.setNom(nom);
		    user.setPrenom(prenom);
		    user.setMail(email);
		    user.setMdp(mdp);
		    user.setRole(role);
		    
		    listeUser.add(user);
		    
		    
		
			
			
			
		}
		
		
		
		return listeUser;
	}
	
	
	public static  User verifierUser(String email, String mdp) throws SQLException {
		// TODO Auto-generated method stub
		Connection connexion = Connect.getInstance().getConnection() ;	
		String req = "select * from user where email = ? and mdp =? ";
		PreparedStatement pstmt = connexion.prepareStatement(req);
		pstmt.setString(1, email);
		pstmt.setString(2, mdp);
		
		ResultSet jeu = pstmt.executeQuery() ;
		
		User user = null ;
		while(jeu.next()) {
			user = new User();
			 user.setId(jeu.getInt("id"));
			   user.setNom(jeu.getString("nom"));
			   user.setPrenom(jeu.getString("prenom"));
			   user.setMail(jeu.getString("email"));
			   user.setMdp(jeu.getString("mdp"));
			   user.setRole(jeu.getString("role"));
			
		}
		
		
		
		return user ;
	}
}