package lecutre20250527.solution;

import java.util.Arrays;
import java.util.Collection;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import lecutre20250527.Mitarbeiter;
import lecutre20250527.MitarbeiterListe;

public class MitarbeiterVerwaltung extends Application {
	
	private static final Collection<String> ABTEILUNGEN = Arrays.asList("IT", "Verkauf", "Marketing", "HR", "Buchhaltung");
	private static final Collection<String> POSITIONEN = Arrays.asList("Manager", "Sachbearbeiter", "Praktikant", "Auszubildender");
    
    // UI-Komponenten
    private TextField txtName;
    private ChoiceBox<String> choiceAbteilung;
    private ComboBox<String> comboPosition;
    private CheckBox checkVollzeit;
    private ListView<Mitarbeiter> listMitarbeiter;
    private Button btnHinzufuegen;
    private Button btnBearbeiten;
    private Button btnLoeschen;
    private Label labelAnzahl;
    
    // Geschäftslogik
    private MitarbeiterListe verwaltung = new MitarbeiterListe();
    
    // UI-Daten (JavaFX braucht ObservableList für automatische Updates)
    private ObservableList<Mitarbeiter> uiListe = FXCollections.observableArrayList();
    
    @Override
    public void start(Stage primaryStage) {
    	
    	// 6x Label
    	Label nameLabel = new Label("Name");
    	Label abteilungLabel = new Label("Abteilung");
    	Label positionLabel = new Label("Position");
    	Label arbeitszeitLabel = new Label("Arbeitszeit");
    	Label anzahlLabel = new Label("Anzahl");
    	Label titelLabel = new Label("Mitarbeiterverwaltung");
    	
    	// Aufgabe: labelAnzahl ergänzen und in der UI sichtbar bekommen
    	labelAnzahl = new Label("Anzahl: 0");
    	
    	//3x Buttons
    	btnHinzufuegen = new Button("Hinzufügen");
    	btnBearbeiten = new Button("Bearbeiten");
    	btnLoeschen = new Button("Löschen");
    	
    	//1xChoiceBox
    	choiceAbteilung = new ChoiceBox<String>();
    	choiceAbteilung.getItems().addAll(ABTEILUNGEN);
    	//choiceAbteilung.getSelectionModel().select(0);
    	choiceAbteilung.setValue("IT");
    	
    	//1xComboBox
    	comboPosition = new ComboBox<String>();
    	comboPosition.getItems().addAll(POSITIONEN);
    	comboPosition.setEditable(true);
    	comboPosition.setValue("Sachbearbeiter");
    	
    	//1xTextField
    	txtName = new TextField();
    	
    	//1xCheckbox
    	checkVollzeit = new CheckBox("Vollzeit");
    	
    	//1x ListView
    	listMitarbeiter = new ListView<Mitarbeiter>();
    	listMitarbeiter.setItems(uiListe);
    	
    	// Aufgabe: Bauen Sie die HBox / VBox Kombination in eine BorderPane und GridPane um 
    	// -> vgl. add(node, col, row) für Grid
    	// -> vgl. setTop, setCenter, usw. für Border
    	
    	// HBox für Titel
    	HBox titel = new HBox();
    	titel.setAlignment(Pos.CENTER);
    	titel.setPadding(new Insets(10));
    	Label labelTitle = new Label("Mitarbeiterverwaltung");
    	labelTitle.setStyle("-fx-font-size: 24px; -fx-font-weight: bold;");
    	titel.getChildren().add(labelTitle);
    	
    	// Grid für Formular
    	GridPane form = new GridPane();
    	form.setPadding(new Insets(10));
    	form.setHgap(10);
    	form.setVgap(10);
    	form.add(nameLabel, 0, 0);
    	form.add(txtName, 1, 0);
    	form.add(abteilungLabel, 0, 1);
    	form.add(choiceAbteilung, 1, 1);
    	form.add(positionLabel, 0, 2);
    	form.add(comboPosition, 1, 2);
    	form.add(arbeitszeitLabel, 0, 3);
    	form.add(checkVollzeit, 1, 3);
    	
    	// HBox als Gegenelement zur VBox
//    	HBox namePane = new HBox();
//    	namePane.getChildren().addAll(nameLabel, txtName);
//    	HBox abteilungPane = new HBox();
//    	abteilungPane.getChildren().addAll(abteilungLabel,choiceAbteilung);
//    	HBox positionPane = new HBox();
//    	positionPane.getChildren().addAll(positionLabel, comboPosition);
//    	HBox arbeitszeitPane = new HBox();
//    	arbeitszeitPane.getChildren().addAll(arbeitszeitLabel, checkVollzeit);
    	
    	// Buttons bleiben als HBox
    	HBox buttonPane = new HBox();
    	buttonPane.setSpacing(10);
    	buttonPane.setAlignment(Pos.CENTER);
    	buttonPane.setPadding(new Insets(10));
    	buttonPane.getChildren().addAll(btnHinzufuegen, btnBearbeiten, btnLoeschen);
    	
    	VBox listLayout = new VBox();
    	listLayout.getChildren().addAll(listMitarbeiter, labelAnzahl);
    	
    	// Main Layout
    	BorderPane main = new BorderPane();
    	main.setTop(titel);
    	main.setCenter(form);
    	main.setRight(listLayout);
    	main.setBottom(buttonPane);
    	
    	// Stichwort: Layout / Pane
//    	VBox main = new VBox();
//    	List<Node> children = main.getChildren();
//    	// Hinweis: ObservableList ist ein spezielles Interface, dies bietet eine addAll(element1, element2, element3, ...) an - List hat dies nicht
//    	children.add(namePane);
//    	children.add(abteilungPane);
//    	children.add(positionPane);
//    	children.add(arbeitszeitPane);
//    	children.add(buttonPane);
//    	children.add(listMitarbeiter);
//    	children.add(labelAnzahl);
    	
    	//setOnAction an einem Button, Funktionalität ergänzen für die Logik
//    	btnHinzufuegen.setOnAction(new EventHandler<ActionEvent>() {
//			public void handle(ActionEvent event) {
//				// ... ihre Logik platzieren!
//				System.out.println("click");
//			}
//    	});
    	// Macht das selbe wie das obere Beispiel, mehr dazu in Kapitel 10
    	btnHinzufuegen.setOnAction((event) -> handleBtnHinzugefuegt());
    	btnLoeschen.setOnAction((event) -> handleBtnLoeschen());
    	btnBearbeiten.setOnAction((event) -> handleBtnBearbeiten());
    	
        
        // Scene und Stage
        Scene scene = new Scene(main, 800, 600);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

	private void handleBtnBearbeiten() {
		// Mitarbeiter finden
		Mitarbeiter mitarbeiter = listMitarbeiter.getSelectionModel().getSelectedItem();
		// Felder aktualisieren, wie können die UI-Controls konfiguriert werden, welche Methoden sind notwendig -> siehe Cheat Sheet
		txtName.setText(mitarbeiter.getName());
		choiceAbteilung.setValue(mitarbeiter.getAbteilung());
		comboPosition.setValue(mitarbeiter.getPosition());
		checkVollzeit.setSelected(mitarbeiter.isVollzeit());
		verwaltung.mitarbeiterEntfernen(mitarbeiter);
		uiListeAktualisieren();
	}

	private void handleBtnLoeschen() {
		Mitarbeiter mitarbeiter = listMitarbeiter.getSelectionModel().getSelectedItem();
		verwaltung.mitarbeiterEntfernen(mitarbeiter);
		uiListeAktualisieren();
	}

	private void handleBtnHinzugefuegt() {
		// ... was muss man machen, wenn man auf den button klickt?
		// Daten aus den textfeld, choicebox, combobox, checkbox auslesen <-
		String name = txtName.getText();
		//choiceAbteilung.getSelectionModel().getSelectedItem()
		String abteilung = choiceAbteilung.getValue();
		String position = comboPosition.getValue();
		boolean vollzeit = checkVollzeit.isSelected();
		
		// Mitarbeiter Objekt erzeugen <-
		Mitarbeiter mitarbeiter = new Mitarbeiter(name, abteilung, position, vollzeit);
		
		// Liste hinzufügen (vgl. verwaltung Attribut)
		verwaltung.mitarbeiterHinzufuegen(mitarbeiter);
		
		// später die UI / ListView aktualisieren
		System.out.println(verwaltung.getAlleMitarbeiter());
		uiListeAktualisieren();
		
		// Leeren der Eingabe
		eingabefelderLeeren();
	}
    
    // UI-Liste mit Geschäftslogik synchronisieren
    private void uiListeAktualisieren() {
        uiListe.clear();
        uiListe.addAll(verwaltung.getAlleMitarbeiter());
        labelAnzahl.setText("Anzahl: " + verwaltung.getAnzahl());
    }
    
    // Eingabefelder zurücksetzen
    private void eingabefelderLeeren() {
        txtName.clear();
        choiceAbteilung.setValue("IT");
        comboPosition.setValue("Sachbearbeiter");
        checkVollzeit.setSelected(true);
    }
    
    
    /*
     * es ginge auch so, wenn man das va10-projekt nutzt - dann aber mit run configuration (wie beim player / guessnumber)
     public static void main(String[] args) {
        launch(args);
     }
     */
}