package lecture20250528.ui;

import java.util.ArrayList;

import javafx.application.Application;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
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
        // Scene und Stage
//      Scene scene = new Scene(______);
//      primaryStage.setScene(scene);
//      primaryStage.show();
	}

}
