package lecutre20250527;

import java.util.Arrays;
import java.util.Collection;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
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
        
        // Scene und Stage
//        Scene scene = new Scene(______, 800, 600);
//        primaryStage.setScene(scene);
//        primaryStage.show();
    }
    
    // UI-Liste mit Geschäftslogik synchronisieren
    /*private void uiListeAktualisieren() {
        uiListe.clear();
        uiListe.addAll(verwaltung.getAlleMitarbeiter());
        labelAnzahl.setText("Anzahl: " + verwaltung.getAnzahl());
    }*/
    
    // Eingabefelder zurücksetzen
    /*private void eingabefelderLeeren() {
        txtName.clear();
        choiceAbteilung.setValue("IT");
        comboPosition.setValue("Sachbearbeiter");
        checkVollzeit.setSelected(true);
    }*/
}