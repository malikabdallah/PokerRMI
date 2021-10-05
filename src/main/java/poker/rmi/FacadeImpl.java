package poker.rmi;

import poker.modele.*;
import poker.rmi.exceptions.*;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;
import java.util.Map;
import java.util.Observable;

public class FacadeImpl extends Observable implements FacadeGame {

    @Override
    public void ajouterJoueurInscrit(String name) throws RemoteException, NomDeJoueurDejaExistantException, CaracteresSpeciauxException {

    }

    @Override
    public void retirerJoueurInscrit(String name) throws RemoteException, AucunJoueurNePossedeCeNomException {

    }

    @Override
    public void rejoindreConcours(String nomDuConcours, String nomDuJoueur) throws RemoteException, AucunJoueurNePossedeCeNomException, JoueurParticipeDejaException {

    }

    @Override
    public void creerEquipe(String joueur, String concours, String name) throws RemoteException, AucunJoueurNePossedeCeNomException, DejaDansUneEquipeException, CaracteresSpeciauxException {

    }

    @Override
    public void rejoindreEquipe(String joueur, String equipe) throws RemoteException, AucunJoueurNePossedeCeNomException, EquipeCompleteException, DejaDansUneEquipeException {

    }

    @Override
    public void accepterAtout(String nameConcours, String tours, int id, String nomJoueur) throws RemoteException {

    }

    @Override
    public void jouerCarte(String nameConcours, String tours, int id, String nomJoueur, String laCarte) throws RemoteException, CarteNonJouableException {

    }

    @Override
    public void refuserAtout(String nameConcours, String tours, int id) throws RemoteException {

    }

    @Override
    public void quitterEquipe(String nomDuJoueur) throws RemoteException {

    }

    @Override
    public List<JoueurInterface> getLesInscrits() throws RemoteException {
        return null;
    }

    @Override
    public JoueurInterface getJoueurByName(String name) throws RemoteException, AucunJoueurNePossedeCeNomException {
        return null;
    }

    @Override
    public List<Equipe> getLesEquipesIncompletes(Partie partie) throws RemoteException {
        return null;
    }

    @Override
    public List<Partie> getLesConcours() throws RemoteException {
        return null;
    }

    @Override
    public Partie getConcoursByName(String name) throws RemoteException {
        return null;
    }

    @Override
    public boolean atoutPris(String nameConcours, String tours, int id) throws RemoteException {
        return false;
    }

    @Override
    public Manche getManche(String nameConcours, String tours, int id) throws RemoteException {
        return null;
    }

    @Override
    public Map<JoueurInterface, LaCarte> getCartePosee(String nameConcours, String tours, int id) throws RemoteException {
        return null;
    }

    @Override
    public JoueurInterface getJoueurEnCoursDeTours(String nom, String tours, int id) throws RemoteException {
        return null;
    }

    @Override
    public int getIndiceDeModificationDuModele() throws RemoteException {
        return 0;
    }
}
