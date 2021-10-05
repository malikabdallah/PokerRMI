package poker.rmi;

import poker.modele.*;
import poker.rmi.exceptions.*;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;
import java.util.Map;

public interface FacadeGame extends Remote {

    void ajouterJoueurInscrit(String name) throws RemoteException, NomDeJoueurDejaExistantException, CaracteresSpeciauxException;

    void retirerJoueurInscrit(String name) throws RemoteException, AucunJoueurNePossedeCeNomException;

    void rejoindreConcours(String nomDuConcours, String nomDuJoueur) throws RemoteException, AucunJoueurNePossedeCeNomException, JoueurParticipeDejaException;

    void creerEquipe(String joueur, String concours, String name) throws RemoteException, AucunJoueurNePossedeCeNomException, DejaDansUneEquipeException, CaracteresSpeciauxException;

    void rejoindreEquipe(String joueur, String equipe) throws RemoteException, AucunJoueurNePossedeCeNomException, EquipeCompleteException, DejaDansUneEquipeException;

    void accepterAtout(String nameConcours, String tours, int id, String nomJoueur) throws RemoteException;

    void jouerCarte(String nameConcours, String tours, int id, String nomJoueur, String laCarte) throws RemoteException, CarteNonJouableException;

    void refuserAtout(String nameConcours, String tours, int id) throws RemoteException;

    void quitterEquipe(String nomDuJoueur) throws RemoteException;






    String serviceName = "BelotteService";

    List<JoueurInterface> getLesInscrits() throws RemoteException;

    JoueurInterface getJoueurByName(String name) throws RemoteException, AucunJoueurNePossedeCeNomException;

    List<Equipe> getLesEquipesIncompletes(Partie partie) throws RemoteException;

    List<Partie> getLesConcours() throws RemoteException;

    Partie getConcoursByName(String name) throws RemoteException;


    boolean atoutPris(String nameConcours, String tours, int id) throws RemoteException;

    Manche getManche(String nameConcours, String tours, int id) throws RemoteException;

    Map<JoueurInterface, LaCarte> getCartePosee(String nameConcours, String tours, int id) throws RemoteException;

    JoueurInterface getJoueurEnCoursDeTours(String nom, String tours, int id) throws RemoteException;

    int getIndiceDeModificationDuModele() throws RemoteException;
}
