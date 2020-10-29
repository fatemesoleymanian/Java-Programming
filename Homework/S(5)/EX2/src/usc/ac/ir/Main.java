package usc.ac.ir;

public class Main {

    public static void main(String[] args) {

	if (UserRegister.getInstance().introduction() == 1 ){


	    if (UserRegister.getInstance().logIn() == 1){
	        UserRegister.getInstance().moveToSite();
        }else return;
    }
	else return;



    }
}
