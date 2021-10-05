package poker.modele.facade;

import poker.modele.*;
import poker.rmi.exceptions.AucunJoueurNePossedeCeNomException;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;
import java.util.Map;

public interface facadePoker extends Remote, facadeGame {

    String serviceName = "BelotteService";

    List<JoueurInterface> getLesInscrits() throws RemoteException;

    JoueurInterface getJoueurByName(String name) throws RemoteException, AucunJoueurNePossedeCeNomException;

    List<Equipe> getLesEquipesIncompletes(Concours concours) throws RemoteException;

    List<Concours> getLesConcours() throws RemoteException;

    Concours getConcoursByName(String name) throws RemoteException;


    boolean atoutPris(String nameConcours, String tours, int id) throws RemoteException;

    Manche getManche(String nameConcours, String tours, int id) throws RemoteException;

    Map<JoueurInterface, LaCarte> getCartePosee(String nameConcours, String tours, int id) throws RemoteException;

    JoueurInterface getJoueurEnCoursDeTours(String nom, String tours, int id) throws RemoteException;

    int getIndiceDeModificationDuModele() throws RemoteException;
}
