package com.github.havlikmar.DU1.main;


import com.github.havlikmar.DU1.logika.Hra;
import com.github.havlikmar.DU1.ui.Controller;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;


public class Start extends Application 
{
    public static void main( String[] args )
    {
    	launch(args);
    }
    
    @Override
	public void start(Stage primaryStage) throws Exception {
		FXMLLoader loader = new FXMLLoader();
    	loader.setLocation(getClass().getResource("/ui/window.fxml"));    	
    	Parent root = loader.load();

    	Controller controller = loader.getController(); 	
    	Hra hra = new Hra();
    	controller.inicializuj(hra, this);

    	primaryStage.setScene(new Scene(root));
    	primaryStage.show();
    	primaryStage.setTitle("Hra na učení slovíček");
	}
}
