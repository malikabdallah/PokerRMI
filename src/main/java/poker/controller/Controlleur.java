package poker.controller;

import javafx.stage.Stage;
import poker.farbqiue.Fabrique;
import poker.rmi.FacadeGame;
import poker.rmi.FacadeImpl;

public class Controlleur {

    public Fabrique fabrique;
    public Stage stage;

    public Controlleur(Stage primaryStage, FacadeGame facade) {
        this.stage=primaryStage;
        this.fabrique=new Fabrique(primaryStage,this);
        this.fabrique.createConnexionView();
    }
}
