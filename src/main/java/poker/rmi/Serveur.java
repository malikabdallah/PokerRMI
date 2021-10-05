package poker.rmi;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.util.Observable;
import java.util.Observer;

public class Serveur implements Observer {

    final FacadeGame monModele;

    private Serveur() throws RemoteException {
        super();
        this.monModele = new FacadeImpl();
        ((FacadeImpl) monModele).addObserver(this);
    }

    public static void main(String[] args) {
        try {
            Registry rmiRegistry = LocateRegistry.createRegistry(9345);
            FacadeGame rmiService = (FacadeGame) UnicastRemoteObject
                    .exportObject(new FacadeImpl(), 9345);
            rmiRegistry.bind("BelotteService", rmiService);
            System.out.println("++++++++++++++ Remote service bound ++++++++++++++++++++");

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void update(Observable o, Object arg) {

    }
}
