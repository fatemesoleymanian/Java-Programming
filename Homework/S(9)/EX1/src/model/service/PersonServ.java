package model.service;

import model.entity.PersonInfo;
import model.repository.PersonRepo;

public class PersonServ {
    private static PersonServ personServ=new PersonServ();
    public static PersonServ getInstance(){
        return personServ;
    }
    private PersonServ(){}
    public void save(PersonInfo person) throws Exception{
        try (PersonRepo repository = new PersonRepo()){
            repository.inserting(person);
            repository.commit();
        }
    }
}
