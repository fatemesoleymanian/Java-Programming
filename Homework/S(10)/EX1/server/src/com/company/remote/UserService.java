package com.company.remote;

import java.rmi.server.RemoteServer;
import java.rmi.server.UnicastRemoteObject;

public class UserService extends UnicastRemoteObject implements UserInterface{

    public UserService()throws Exception{}
    @Override
    public void save(User user) throws Exception {
        DbUser dbUser=new DbUser();
        dbUser.insert(user);
        dbUser.close();
        System.out.println("the client IP is "+ RemoteServer.getClientHost());


    }

    @Override
    public boolean change(User user,String password) throws Exception {
        DbUser dbUser= new DbUser();
        boolean comp=dbUser.checkANDupdate(user,password);



    return comp;}
}
