package usc.ac.ir;

public class Subject {
    public float math;
    public int zMath;
    public float logicCircuit;
    public int zLogicCircuit;
    public float technicLngu;
    public int zTechnicLngu;
    public float advnProgram;
    public int zAdvnProgram;

    public void avrg(float sum, int tedad){
        System.out.println("your average is "+ sum/tedad );
        if ( (sum / tedad )>= 12)
            System.out.println("you passed.");

        else
            System.out.println("you failed.");

    }
}
