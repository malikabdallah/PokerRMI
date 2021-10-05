package poker.vue.controller;

import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import poker.controller.Controlleur;
import poker.rmi.exceptions.CaracteresSpeciauxException;
import poker.rmi.exceptions.NomDeJoueurDejaExistantException;
import poker.vue.Vue;

import java.rmi.RemoteException;

public class Home implements Vue {

    public TextField login;
    private Controlleur controlleur;

    @Override
    public void setController(Controlleur controlleur) {
        this.controlleur=controlleur;
    }

    @Override
    public Runnable actualiser() {
        return null;
    }

    public void connexion(MouseEvent mouseEvent) {

        try {
            controlleur.getModel().ajouterJoueurInscrit(login.getText());
        } catch (RemoteException e) {
            e.printStackTrace();
        } catch (NomDeJoueurDejaExistantException e) {
            e.printStackTrace();
        } catch (CaracteresSpeciauxException e) {
            e.printStackTrace();
        }
        controlleur.connexion();
    }
}
