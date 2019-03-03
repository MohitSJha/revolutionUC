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
		Button button1 = new Button("hey!");
		button1.setOnAction(e -> buttonClicked(window));
		
		Button button2 = new Button("you!");
		button2.setOnAction(e -> buttonClicked(window));
		
		Button button3 = new Button("you!");
		button2.setOnAction(e -> buttonClicked(window));
		
		//Top layout
		HBox topLayout = new HBox(20);
		topLayout.getChildren().addAll(text);
		
		//Layout for the options
		VBox options = new VBox();
		options.getChildren().addAll(button1, button2, button3);
		
		//Border pane
		BorderPane pane = new BorderPane();
		pane.setTop(topLayout);
		pane.setCenter(options);
		
		mainPage = new Scene(pane, 400, 800);
		
		window.setScene(mainPage);
		window.setTitle("Revolution! UC!!");
		window.show();
		
	}
	
	
}
