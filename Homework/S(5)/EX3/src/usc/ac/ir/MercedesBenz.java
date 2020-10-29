package usc.ac.ir;

public class MercedesBenz extends Car {
    public final String name="SLS AMG";
    public final float cost=5600000;
    MercedesBenz(){
        System.out.println("car name: "+name+"\ncost: "+cost+" $");
    }
    @Override
    public void differentialNumber() {
        System.out.println("differential number : 1");

    }

    @Override
    public void acceleration() {
        System.out.println("acceleration : 3.8 (0-100 second)");

    }

    @Override
    public void differetialType() {
        System.out.println("4WD");

    }

    @Override
    public void enginePower() {
        System.out.println("engine power : 583");

    }
}
