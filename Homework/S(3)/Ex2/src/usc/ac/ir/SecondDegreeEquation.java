package usc.ac.ir;

public class SecondDegreeEquation {
private float A;
private float B;
private float C;
public float delta;
public float x1;
public float x2;

SecondDegreeEquation(){
    System.out.println("Enter Quadratic Equation Coefficients (Ax^2 + Bx + C = 0 ):");
}
    public void setA(float a) {
       this.A = a;
    }

    public void setB(float b) {
        this.B = b;
    }

    public void setC(float c) {
        this.C = c;
    }

    public void answer()throws ArithmeticException{

    delta= (float) Math.pow(this.B,2) - (4 *this.A *this.C);
    if (delta<0)throw new ArithmeticException("this equation has no answer .");


    x1= (float) ((-(this.B)+Math.sqrt(delta))/2*this.A);
    x2= (float) ((-(this.B)-Math.sqrt(delta))/2*this.A);


    if (x1==x2) System.out.println("this equation has only one answer . x :"+" "+x1);

else System.out.println("x1 :" + x1+"\n"+"x2 :" + x2);

    }
}
