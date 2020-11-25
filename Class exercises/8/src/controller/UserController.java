package controller;

import model.entity.UserEntity;
import model.repository.UserRepo;

import java.util.List;

public class UserController {

    public UserController(){

    }
    public void registration(String userName,String name,String password,String email){

        try {
            UserRepo userRepo=new UserRepo();
            userRepo.inserting(new UserEntity().setUser_name (userName).setName (name).setPassword (password).setEmail(email));

            userRepo.commit();
            userRepo.close();
        }
        catch (Exception e){
            e.getMessage ();
            e.printStackTrace();
        }}
    public boolean logIn(String usrnm,String  pss){
        boolean compare=false;

        try {
            UserRepo userRepo=new UserRepo();
            boolean ans=userRepo.selecting(usrnm,pss);
            if (ans == true) compare=true;
            else compare=false;

        }
        catch (Exception e){
            e.getMessage ();
            e.printStackTrace();
        }

        return compare;
    }

}
