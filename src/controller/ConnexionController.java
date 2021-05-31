package controller;

import java.io.IOException;
import java.sql.SQLException;

import application.MainApplication;
import dao.UserDao;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import metier.User;

public class ConnexionController {
	
	
	
	@FXML
	public TextField emailText ;
	
	@FXML
	public TextField mdpText ;

	@FXML 
	public BorderPane mainPane;
	
	@FXML
	public void connexion(Event event) {
		
		try {
		User user	= UserDao.verifierUser(emailText.getText(),mdpText.getText());
			if(user != null) {
				
			}else 
			{ 
				FXMLLoader acc = new FXMLLoader() ;
				acc.setLocation(MainApplication.class.getClassLoader().getResource("vue/inscriptionLayout.fxml"));
			   try {
				   // charger la page inscription 
				AnchorPane inscriptionPane = (AnchorPane)acc.load();
				// modifier le contenu du mainPane
				this.mainPane.setCenter(inscriptionPane);
				
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
}
			}
		} 
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
}
