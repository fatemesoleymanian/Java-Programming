package remote;

import java.rmi.Remote;

public interface PeopleService extends Remote {
    void save (People people)throws Exception;
}
