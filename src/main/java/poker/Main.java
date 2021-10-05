package poker;

import javafx.application.Application;
import javafx.stage.Stage;
import poker.controller.Controlleur;
import poker.rmi.FacadeGame;
import poker.rmi.FacadeImpl;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Main extends Application {

    private static final String HOST = "127.0.0.1";//Mettre l'adresse du serveur.


    @Override
    public void start(Stage primaryStage) throws Exception{

        try {
            Registry registry = LocateRegistry.getRegistry(HOST, 9345);
            String[] names = registry.list();
            for (String name1 : names) {
                System.out.println("~~~~" + name1 + "~~~~");
            }
            FacadeGame serv = (FacadeGame) registry.lookup(FacadeImpl.serviceName);
            new Controlleur(primaryStage, serv);
        } catch (Exception e) {
            System.err.println("Aucun serveur n'a été trouvé");

        }
    }


    public static void main(String[] args) {
        launch(args);
    }
}
