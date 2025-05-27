package lecture20250520;

import java.util.List;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class MyFirstApplication extends Application {
	
	@Override
	public void init() throws Exception {
		super.init();
	}

	public void start(Stage primaryStage) throws Exception {
		// Anweisungszeilen, die alle notwendigen "Node"-Objekte erzeugt, u.a. Controls und Panes
		
		Button label = new Button("Hello, World!");
		
		Parameters parameters = getParameters();
		List<String> unnamed = parameters.getUnnamed();
		for (String string : unnamed) {
			System.out.println(string);
		}
		
		Scene scene = new Scene(label); // genau ein Node muss mit übergeben werden
		primaryStage.setScene(scene);
		//primaryStage.show();
	}
	
	// Wie od. wo starten Java-Anwendungen?
//	public static void main(String[] args) {
//		Application.launch(args);
//	} -> geht nicht wegen Maven :(

}
