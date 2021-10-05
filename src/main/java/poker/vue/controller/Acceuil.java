package poker.vue.controller;

import javafx.scene.control.ListView;
import poker.controller.Controlleur;
import poker.modele.JoueurInterface;
import poker.vue.Vue;

import java.rmi.RemoteException;

public class Acceuil implements Vue {

    public ListView list;


    private Controlleur controlleur;


    private void initializeListe(){
        list.getItems().clear();
        try {
            for(String user:controlleur.getModel().getLesInscrits()){
                list.getItems().add(user);
            }
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void setController(Controlleur controlleur) {
        this.controlleur=controlleur;

    }

    @Override
    public Runnable actualiser() {
        return null;
    }
}
