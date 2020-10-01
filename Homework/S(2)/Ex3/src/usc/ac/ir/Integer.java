package usc.ac.ir;

public class Integer implements MyInteger{
    public static int  newInt;

    @Override
    public void isEven( int integer) {

    if ((integer % 2)== 0) System.out.println("even ");
    }

    @Override
    public void isOdd(int integer) {
    if ((integer % 2)!= 0) System.out.println("odd");
    }

    @Override
    public void isPositive(int integer) {

        if (Math.abs(integer)==integer && integer!=0) System.out.println("positive");

    }

    @Override
    public void isNegative(int integer) {

    if (Math.abs(integer)!=integer && integer!=0) System.out.println("negative ");
    }

    @Override
    public void isZero(int integer) {

    if (integer == 0) System.out.println("zero ");

    }
}
