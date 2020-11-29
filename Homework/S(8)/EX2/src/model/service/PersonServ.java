package model.service;

import model.entity.Person;
import model.repository.PersonRepo;

public class PersonServ {
    private static PersonServ personServ=new PersonServ();
    public static PersonServ getInstance(){
        return personServ;
    }
    private PersonServ(){}
    public void save(Person person) throws Exception{
        try (PersonRepo repository = new PersonRepo()){
            repository.insert(person);
            repository.commit();
        }
    }

    public void edit(Person person) throws Exception{
        try (PersonRepo repository = new PersonRepo()){
            repository.update(person);
            repository.commit();
        }
    }
}
