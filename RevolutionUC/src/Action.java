import javafx.scene.control.Label;
import javafx.stage.Stage;

public class Action
{
	public void closeProgram(Stage window)
	{
		//Closes the window
		window.close();
	}
	
	public void buttonClicked(Stage window)
	{
		Label newText = new Label("Button 1!!!");
	}

}
