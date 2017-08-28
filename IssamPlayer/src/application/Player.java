package application;

import javafx.beans.binding.Bindings;
import javafx.beans.property.DoubleProperty;
import javafx.geometry.Rectangle2D;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Screen;

public class Player extends BorderPane{

	Media media;
	MediaPlayer mediaPlayer;
	MediaView mediaView;
	Pane pane;
	double h,w;
	MediaBar mediaBar;
	public Player(String string) {
		media = new Media(string);

		mediaPlayer = new MediaPlayer(media);

		mediaView = new MediaView(mediaPlayer);

		pane = new Pane();
		pane.getChildren().add(mediaView);
		setCenter(pane);


		mediaBar = new MediaBar(mediaPlayer);
		setBottom(mediaBar);
		setStyle("-fx-background-color: #bfc2c7");
		Rectangle2D visualBounds = Screen.getPrimary().getVisualBounds();

		mediaPlayer.play();

	}

}
