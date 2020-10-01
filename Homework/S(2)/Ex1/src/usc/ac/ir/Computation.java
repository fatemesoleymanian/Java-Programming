package usc.ac.ir;

public class Computation implements Calculator{
    public double result;
    @Override
    public double summation(double a, double b) {
        this.result=a + b;
        return result;
    }

    @Override
    public double subtraction(double a, double b) {
        this.result=a - b;
        return result;
    }

    @Override
    public double multiplication(double a, double b) {
        this.result=a * b;
        return result;
    }

    @Override
    public double division(double a, double b) {
        this.result=a / b;
        return result;
    }
    Computation(){
        System.out.println("COMPUTATING...");
    }


}
