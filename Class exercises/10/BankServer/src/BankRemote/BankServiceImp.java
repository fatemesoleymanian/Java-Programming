package src.BankRemote;

import java.rmi.server.RemoteServer;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

public class BankServiceImp extends UnicastRemoteObject implements BankService {
    public BankServiceImp()throws Exception{}
    @Override
    public void update(Client client, String amount, String reciever) throws Exception {
        System.out.println ("The client IP is:"+ RemoteServer.getClientHost ());
        ClientRepo clientRepo=new ClientRepo();
        clientRepo.update(client,amount,reciever);


    }

    @Override
    public String  show(Client client) throws Exception {
        System.out.println ("The client IP is:"+RemoteServer.getClientHost ());
        ClientRepo clientRepo=new ClientRepo();
        return clientRepo.select(client);

    }
}
