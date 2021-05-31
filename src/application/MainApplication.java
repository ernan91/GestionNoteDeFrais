package application;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class MainApplication extends Application {

	@Override
	public void start(Stage primaryStage) {
		
		//1 charger le fichier fxml

        FXMLLoader acc = new FXMLLoader() ;
        acc.setLocation(MainApplication.class.getClassLoader().getResource("vue/connexionLayout.fxml"));
        try {
            BorderPane mainPane = (BorderPane)acc.load();

            //2 Ajouter dans ma scene
            Scene  scene = new Scene(mainPane, 350, 300);
            //Ajouter la scene dans Stage 
            primaryStage.setScene(scene);

            primaryStage.show();


        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace(); }
        }
}