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

    public void answer(){
        if((zx2*zy1)-(zx1*zy2)!=0){
            System.out.println("X equals :" + x);
            System.out.println("Y equals :" + y);

        }

        else {
            System.out.println("this mathematic equation has no answer!");
        }


    }
}
