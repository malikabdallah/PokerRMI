package poker.controller;

import javafx.stage.Stage;
import poker.farbqiue.Fabrique;

public class Controlleur {

    public Fabrique fabrique;
    public Stage stage;

    public Controlleur(Stage primaryStage) {
        this.stage=primaryStage;
        this.fabrique=new Fabrique(primaryStage,this);
    }
}
