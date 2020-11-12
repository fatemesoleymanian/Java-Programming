package usc.ac.ir;

public  abstract class Employees<EMPCODE,EMPNC,EMPNAME,SALARY,FATHERNAME,WORKEXPERIENCE,CAREERPOSITION> {
    public EMPCODE code;
    public EMPNC nationalCode;
    public EMPNAME name;
    public SALARY salary;
    public FATHERNAME fathername;
    public WORKEXPERIENCE workexperience;
    public CAREERPOSITION careerposition;


    public void showInfo(){}
    public void getInfo(){}
    public void deleteInfo(){}
}
