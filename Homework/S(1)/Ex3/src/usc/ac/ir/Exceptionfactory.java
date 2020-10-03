package usc.ac.ir;

public class Exceptionfactory extends Exception {

    public static String ExceptionHandling(Exception exception){

        if(exception instanceof ArithmeticException){
            return "this mathematic equation has no answer!";

        }else
            return "exception";
    }
}
