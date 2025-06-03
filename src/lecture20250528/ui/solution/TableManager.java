package lecture20250528.ui.solution;

import java.util.ArrayList;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import lecture20250528.model.Article;
import lecture20250528.model.Reservation;
import lecture20250528.model.Table;

public class TableManager extends Application {
	
    private ArrayList<Table> tables;
    private ArrayList<Article> articles;
    
    private Table current;
	private Label tableLabel;
	private ListView<Reservation> reservations;
	private ListView<String> orders;
	private ChoiceBox<Article> selectArticle;
	private Button addArticle;
	private TextField date;
	private TextField name;
	private Button addReservation;
    
	// Init Methode kommt wann im Lebenszyklus einer JavaFX Anwendung dran
	// -> nach der Objekterzeugung und vor dem Aufruf von Start
	// Wann notwendig? Alles was zw. Konstr. und init "konfiguriert wird" wäre im
	// konstruktor noch nicht da, u.a. Parameter
    public void init() throws Exception {
        this.tables = new ArrayList<>();
        this.articles = new ArrayList<>();
        
        for(int i = 0; i < 10; i ++) {
            this.tables.add(new Table(i));
        }
        
        this.tables.get(0).addReservation(new Reservation("10:00", "A"));
        this.tables.get(0).addReservation(new Reservation("20:00", "B"));
        this.tables.get(1).addReservation(new Reservation("20:00", "C"));
        
        this.articles.add(new Article("Pizza Diavolo", 12.99));
        this.articles.add(new Article("Pizza Margherita", 9.99));
        this.articles.add(new Article("Spagetthi Carbonara", 8.99));
        this.articles.add(new Article("Lasagne Bolognese", 9.99));
        this.articles.add(new Article("Rotwein Chianti 0,75l", 14.99));
        this.articles.add(new Article("Gemischter Salat", 4.99));
    }

	public void start(Stage primaryStage) throws Exception {
		// Wie würden Sie vorgehen?
		// 1. Überlegungen / Skizze was genau die UI benötigt, wie
		//    diese Strukturiert ist
		// 2. Basierend auf der Skizze die verschiedenen
		//    Controls und Panes erzeugen
		//    -> alternativ Controls und Panes trennen
		// 3. Eventhandler umsetzen
		
		// Controls erzeugen
		
		tableLabel = new Label("");
		reservations = new ListView<Reservation>();
		orders = new ListView<String>();
		selectArticle = new ChoiceBox<Article>();
		selectArticle.getItems().addAll(articles); // ArrayList ist substituierbar auf Collection
		date = new TextField();
		name = new TextField();
		addArticle = new Button("Add");
		addReservation = new Button("Add");
		
		// Layout konfigurieren
		BorderPane main = new BorderPane();
		FlowPane tables = new FlowPane();
		VBox side = new VBox();
		HBox addReservationForm = new HBox();
		HBox addArticleForm = new HBox();
		
		main.setLeft(tables);
		main.setRight(side);
		
		side.getChildren().addAll(tableLabel, 
				reservations, 
				addReservationForm, 
				orders, 
				addArticleForm);
		
		addReservationForm.getChildren().addAll(date, name, addReservation);
		addArticleForm.getChildren().addAll(selectArticle, addArticle);
		
		// Für die Formulare
		addReservation.setOnAction((event) -> handleOnClickAddReservation());
		addArticle.setOnAction((event) -> handleOnClickAddArticle());
		// Wo initialiseren der Ereignisverarbeitung für die Tisch-Buttons (vgl. setOnAction)?
		
		// Buttons für Tische
		ObservableList<Node> children = tables.getChildren();
		for(Table t : this.tables) {
			Button button = new Button(t.toString());
			button.setOnAction((event) -> handleOnClickTable(t));
			children.add(button);
		}
//		for(int i = 0; i < this.tables.size(); i ++) {
//			Button button = new Button(this.tables.get(i).toString());
//			children.add(button);
//		}
		
        // Scene und Stage
        Scene scene = new Scene(main);
        primaryStage.setScene(scene);
        primaryStage.show();
        
        refreshUi();
	}
	
	
	private void handleOnClickAddArticle() {
		// current ist der aktuelle Tisch, könnte ggf. null sein
		// selectArticle ist die aktuelle auswahl
		// ... ggf. refreshUi
		
		if(current != null) {
			Article article = selectArticle.getValue();
			current.addToBill(article);
			refreshUi();
		}
	}

	private void handleOnClickAddReservation() {
		// current ist der aktuelle Tisch, könnte ggf. null sein
		// name, date sind die Textfelder
		// ... ggf. refreshUi
		if(current != null) {
			String nameText = name.getText();
			String dateText = date.getText();
			
			Reservation r = new Reservation(dateText, nameText);
			current.addReservation(r);
			refreshUi();
			
			name.setText("");
			date.setText("");
		}
	}

	private void handleOnClickTable(Table t) {
		// Label aktualisieren
		System.out.println(t.toString());
		if(current == null) {			
			current = t;
		} else if(current != t) {
			current = t;
		} else {
			current = null;
		}
		refreshUi();
	}

	private void refreshUi() {
		if(current == null) {
			tableLabel.setText("");
			reservations.getItems().clear();
			orders.getItems().clear();
			name.setDisable(true);
			date.setDisable(true);
			selectArticle.setDisable(true);
			addReservation.setDisable(true);
			addArticle.setDisable(true);
		} else {			
			tableLabel.setText(current.toString());
			// Listen aktualisieren (Reservierungen und Artikel)
			// -> reservations ListView<Reservation>
			// reservations.getItems().addAll(); // <- will Collection
			// t.reservations() liefert ein Iterable?
			reservations.getItems().clear();
			for(Reservation r : current.reservations()) {
				reservations.getItems().add(r);
			}
			// -> orders ListView<String>
			orders.getItems().clear();
			for(Article article : current.articlesOnBill()) {
				orders.getItems().add(article + ": " + current.getArticleCount(article));
			}
			name.setDisable(false);
			date.setDisable(false);
			selectArticle.setDisable(false);
			addReservation.setDisable(false);
			addArticle.setDisable(false);
		}
	}

	// Geht nicht bei Maven-basierten Projekten, hier klappt die Erkennung nicht richtig
	// -> bei Maven zusätzliche Klasse und Application.launch(TableManager.class, args);
    public static void main(String[] args) {
        launch(args);
    }

}
