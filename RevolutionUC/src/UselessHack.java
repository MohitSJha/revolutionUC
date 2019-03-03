import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

import java.util.ArrayList;

public class UselessHack extends Application implements EventHandler
{
	
	Scene mainPage, firstPage, secondPage, thirdPage;

	public static void main(String[] args)
	{
		// Launches the program as a JavaFX application
		launch(args);

	}

	@Override
	public void handle(Event arg0)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void start(Stage window) throws Exception
	{
		Label text = new Label("Welcome to the first screen");
		
		//To properly close when the X on top is pressed
		window.setOnCloseRequest(e -> closeProgram(window));
		
		//All the buttons to navigate
		Button rButton = new Button("Remove a station");
		rButton.setOnAction(e -> buttonClicked(window));
		
	}
	
	public void closeProgram(Stage window)
	{
		//Closes the window
		window.close();
	}
	
	public void buttonClicked(Stage window)
	{
		
	}

}
