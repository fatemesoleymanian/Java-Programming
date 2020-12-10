package com.company.remote;

import java.rmi.Remote;

public interface UserInterface extends Remote {
    void save(User user)throws Exception;

    boolean change(User user,String password)throws Exception;
}
