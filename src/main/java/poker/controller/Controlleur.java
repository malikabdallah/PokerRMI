package poker.controller;

import javafx.application.Platform;
import javafx.stage.Stage;
import poker.farbqiue.Fabrique;
import poker.rmi.FacadeGame;
import poker.rmi.FacadeImpl;
import poker.vue.Vue;
import poker.vue.controller.Acceuil;
import poker.vue.controller.Home;

import java.rmi.RemoteException;

public class Controlleur {

    public Fabrique fabrique;
    public Stage stage;

    //vues
    private Acceuil acceuil;
    private Home home;
    private Vue fenetrePrincipal;


    int DerniereModif = 0;
    int toursActuel = 0;

    private FacadeGame model;

    public FacadeGame getModel() {
        return model;
    }

    public void setModel(FacadeGame model) {
        this.model = model;
    }

    public Controlleur(Stage primaryStage, FacadeGame facade) {
        this.stage=primaryStage;
        this.fabrique=new Fabrique(primaryStage,this);
        fenetrePrincipal=this.fabrique.createConnexionView();

        Thread threadMaJ = new Thread(getRunnableMaJ());
        threadMaJ.start();
    }

    private int getDerniereModif() {
        return DerniereModif;
    }

    private void setDerniereModif(int derniereModif) {
        DerniereModif = derniereModif;
    }

    private int getIndiceDeModificationDuModele() {
        try {
            return this.model.getIndiceDeModificationDuModele();
        } catch (RemoteException e) {
            e.printStackTrace();
        }
        return 0;
    }

    private Runnable getRunnableMaJ() {
        return () -> {
            while (!Thread.currentThread().isInterrupted()) {
                if(getIndiceDeModificationDuModele()!= getDerniereModif()) {
                    if (getIndiceDeModificationDuModele() != getDerniereModif()) {
                        setDerniereModif(getIndiceDeModificationDuModele());
                        Platform.runLater(fenetrePrincipal.actualiser());
                    }
                }
            }
        };
    }

    public void connexion() {

        this.fabrique.createAcceulView();
    }
}
