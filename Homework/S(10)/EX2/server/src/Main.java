
import remote.ServiceImp;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.ServerNotActiveException;

public class Main {

    public static void main(String[] args) {

        try {
            LocateRegistry.createRegistry(1099);
            ServiceImp serviceImp=new ServiceImp();
            Naming.rebind("FoodServer",serviceImp);
            System.out.println("server is waiting for request . . .");

        } catch (RemoteException e) {
            e.printStackTrace ();
        } catch (ServerNotActiveException e) {
            e.printStackTrace ();
        } catch (MalformedURLException e) {
            e.printStackTrace ();
        } catch (Exception e) {
            e.printStackTrace ();
        }

    }
}
