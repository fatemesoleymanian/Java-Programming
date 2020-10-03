package usc.ac.ir;

public class Equation {
    public int zx1;
    public int zx2;
    public int zy1;
    public int zy2;
    public int e;
    public int f;
    public float x;
    public float y;

    public void answer() {

        x=((e * zy1) -(zy2*f))/((zx2*zy1)-(zy2*zx1));
        y=((f*zx2)-(e*zx1))/((zx2*zy1)-(zy2*zx1));

        System.out.println("X equals :" + x);
        System.out.println("Y equals :" + y);









    }
}
