package usc.ac.ir;

public class Toyota extends Car {
    public final String name="GT86";
    public final float cost=200000;
    Toyota(){
        System.out.println("car name: "+name+"\ncost: "+cost+" $");
    }
    @Override
    public void differentialNumber() {
        System.out.println("differential number : 2");

    }

    @Override
    public void acceleration() {
        System.out.println("acceleration : 6.5 meter per square of second");

    }

    @Override
    public void differetialType() {
        System.out.println("4WD");

    }

    @Override
    public void enginePower() {
        System.out.println("engine power : 220");

    }
}
