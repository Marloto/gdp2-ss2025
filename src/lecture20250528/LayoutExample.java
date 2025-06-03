package lecture20250528;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class LayoutExample extends Application {

	public void start(Stage primaryStage) throws Exception {
		//GridPane pane = new GridPane();
		// So nicht, stapelt alles ins erste Feld - sogar übereinander
//		pane.getChildren().add(new Label("A"));
//		pane.getChildren().add(new Label("B"));
		
//		pane.add(new Label("AAAAA"), 0, 0);
//		pane.add(new Label("B"), 0, 1);
//		pane.add(new Label("C"), 1, 0);
//		pane.add(new Label("D"), 1, 1);
		
//		BorderPane pane = new BorderPane();
//		pane.setCenter(new ListView());
//		pane.setTop(new Button("Test"));
//		pane.setLeft(new Button("Links"));
		
		FlowPane pane = new FlowPane();
		ObservableList<Node> children = pane.getChildren();
		for(int i = 0; i < 10; i ++ ) {
			children.add(new Label("Test" + i));
		}
		
		Scene scene = new Scene(pane);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

}
