package controller;

import model.entity.EmpInfo;
import model.repository.EmpDb;

public class ControllInfo {
    public void fill(String finame,String lname,String faname,String nc,String gen,String birth,String edu, String pnum, String email){

        boolean comp1=true;
        try {
            EmpDb empDb = new EmpDb();
            empDb.inserting(new EmpInfo().setFiName(finame).setlName(lname).setFaName(faname).setNc(nc).setGender(gen).setBirth(birth).setEdu(edu).setpNum(pnum).setEmail(email));
                empDb.commit();
                empDb.close();
        }catch (Exception e){
            e.getMessage ();
            e.printStackTrace();
        }}
}
