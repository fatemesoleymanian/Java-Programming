package usc.ac.ir;

import java.util.InputMismatchException;

public class StudentInfo <FULLNAME,STUDENTNUMBER,FATHERNAME>{
    FULLNAME fullname;
    STUDENTNUMBER studentnumber;
    FATHERNAME fathername;
    StudentInfo(){
        System.out.println("plz enter your information .");
    }


    public FULLNAME getFullname() {
        return fullname;
    }

    public STUDENTNUMBER getStudentnumber() {
        return studentnumber;
    }

    public FATHERNAME getFathername() {
        return fathername;
    }

    public void setFullname(FULLNAME fullname) {
        this.fullname = fullname;
    }

    public void setStudentnumber(STUDENTNUMBER studentnumber){
        this.studentnumber = studentnumber;

    }

    public void setFathername(FATHERNAME fathername) {
        this.fathername = fathername;
    }
}
