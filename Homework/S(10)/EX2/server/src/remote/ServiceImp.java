package remote;

import java.rmi.server.RemoteServer;
import java.rmi.server.UnicastRemoteObject;

public class ServiceImp extends UnicastRemoteObject implements PeopleService {

    public ServiceImp()throws Exception{}

    @Override
    public void save(People people) throws Exception {
        PeopleRepo peopleRepo=new PeopleRepo();
        peopleRepo.insert(people);
        peopleRepo.close();
        System.out.println("the client IP is "+ RemoteServer.getClientHost());


    }
}
