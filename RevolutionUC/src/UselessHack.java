import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;


public class UselessHack extends Application implements EventHandler<ActionEvent>
{
	
	Scene mainPage;

	public static void main(String[] args)
	{
		// Launches the program as a JavaFX application
		launch(args);

	}

	@Override
	public void start(Stage window) throws Exception
	{
		
		//To properly close when the X on top is pressed
		window.setOnCloseRequest(e -> closeProgram(window));
		
		// Setting texts
		Text sdTxt = new Text("Looks like you've made it this far");
		sdTxt.setFont(Font.font("Verdana", FontWeight.BOLD, 20));
		Text text = new Text("Welcome to the first screen");
		text.setFont(Font.font("Courier New", FontWeight.BOLD, 24));
		
		// All the buttons
		Button trick = new Button("Click on me");
		trick.setOnAction(e -> buttonClicked(window, trick));
		
		Button trick2 = new Button("No Click me");
		trick2.setOnAction(e -> buttonClicked(window, trick2));
		
		Button trick3 = new Button("No u!");
		trick3.setOnAction(e -> buttonClicked(window, trick3));
		
		Button close = new Button("Close");
		close.setOnAction(e -> closeProgram(window));
		
		//Aligning all the texts
		StackPane layout = new StackPane();
		StackPane.setAlignment(text, Pos.TOP_CENTER);
		StackPane.setAlignment(sdTxt, Pos.BOTTOM_CENTER);
		layout.getChildren().addAll(text, sdTxt);
		
		//Layout for the options
		VBox options = new VBox(10);
		options.getChildren().addAll(trick, trick2, trick3, close);
		options.setAlignment(Pos.CENTER);
		layout.getChildren().add(options);
		
		mainPage = new Scene(layout, 800, 500);
		
		window.setScene(mainPage);
		window.setTitle("Revolution! UC!!");
		window.show();
		
	}

	@Override
	public void handle(ActionEvent click)
	{
		// HAndled through lambda expressions
		
	}
	
	public void closeProgram(Stage window)
	{
		//Closes the window
		window.close();
	}
	
	public void buttonClicked(Stage window, Button button)
	{
		String prev = button.getText();
		
		button.setText("Yay!!! You pressed a button!");
		
		button.setOnAction(e -> button.setText(prev));
	}
	
	
}
