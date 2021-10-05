package poker;

import javafx.application.Application;
import javafx.stage.Stage;
import poker.controller.Controlleur;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Controlleur controlleur=new Controlleur(primaryStage);
    }


    public static void main(String[] args) {
        launch(args);
    }
}
