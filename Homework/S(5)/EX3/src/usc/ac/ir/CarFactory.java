package usc.ac.ir;

public class CarFactory {
    public Car getCar(int choose)throws NullPointerException{
        if (choose==1)
            return new Toyota();
        if (choose==2)
            return new BMW();
        if (choose==3)
            return new MercedesBenz();
        if (choose!=1 && choose!=2 && choose!=3)throw new NullPointerException("plz choose one of three.");
        return null;

    }
}
