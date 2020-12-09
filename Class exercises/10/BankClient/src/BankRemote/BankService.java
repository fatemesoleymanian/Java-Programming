package src.BankRemote;

import java.rmi.Remote;
import java.util.List;

public interface BankService extends Remote {
    void update(Client client, String amount, String reciever)throws Exception;
    String show(Client client)throws Exception;
}
