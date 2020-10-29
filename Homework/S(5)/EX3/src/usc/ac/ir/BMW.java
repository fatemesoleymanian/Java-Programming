package usc.ac.ir;

public class BMW extends Car{
    public final String name="BMW X3 3.0 Si";
    public final float cost=340000;
    BMW(){
        System.out.println("car name: "+name+"\ncost: "+cost+" $");
    }
    @Override
    public void differentialNumber() {
        System.out.println("differential number : 2");

    }

    @Override
    public void acceleration() {
        System.out.println("acceleration : 7.2 meter per square of second");

    }

    @Override
    public void differetialType() {
        System.out.println("4WD");

    }

    @Override
    public void enginePower() {
        System.out.println("engine power : 272");

    }
}
