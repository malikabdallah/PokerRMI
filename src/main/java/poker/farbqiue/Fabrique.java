package poker.farbqiue;

import poker.controller.Controlleur;
import poker.vue.Vue;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import poker.vue.controller.Home;

import java.io.IOException;
import java.net.URL;

public class Fabrique {
    private Stage stage;
    private Controlleur controlleur;


    public Fabrique (Stage stage, Controlleur controller){
        this.stage = stage;
        this.controlleur = controller;
    }


    public Vue createConnexionView() {
        return load(Home.class.getResource("/vues/home.fxml"), "Login");
    }
    public Vue createAcceulView() {

        System.out.println("load acceuil vue");
        return load(Home.class.getResource("/vues/acceuil.fxml"), "Login");
    }



    private Vue load(URL url, String title){
        FXMLLoader loader = new FXMLLoader(url);
        Parent root = null;
        try{
            root = loader.load();
        }
        catch(IOException e){
            e.printStackTrace();
            return null;
        }
        Vue view = loader.getController();
        view.setController(controlleur);
        stage.setTitle(title);
        Scene scene=new Scene(root);
        stage.setScene(scene);
        //  stage.setFullScreen(true);
        stage.centerOnScreen();
        stage.show();
        return view;
    }
}
