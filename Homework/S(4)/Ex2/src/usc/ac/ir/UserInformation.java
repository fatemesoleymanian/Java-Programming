package usc.ac.ir;

public class UserInformation <E_MailADDRESS,USERNAME,PASSWORD>implements Cloneable{
    E_MailADDRESS email;
    USERNAME username;
    PASSWORD password;
    UserInformation(){
        System.out.println("Dear User To Use Site's Services Login To Your Account . ");
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
