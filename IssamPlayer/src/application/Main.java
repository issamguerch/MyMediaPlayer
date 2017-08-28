package application;

import java.awt.Color;
import java.io.File;

import javafx.application.Application;
import javafx.geometry.Rectangle2D;
import javafx.stage.Screen;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		Player player = new Player("file:///C:/blob.mp4");
		Scene scene = new Scene(player);
		 Rectangle2D visualBounds = Screen.getPrimary().getVisualBounds();
		 primaryStage.setHeight(visualBounds.getHeight());
		 primaryStage.setWidth(visualBounds.getWidth());
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
