package usc.ac.ir;

public class Main {

    public synchronized static void main(String[] args) throws Exception{


        Thread thread1= new Thread()
        {
            @Override
            public void run() {
                Text.getInstance ().read();
            }
        };
        Thread thread2=new Thread(){
            @Override
            public void run(){
                Text.getInstance().write();
            }
        };

thread1.start();
thread2.start();




    }
}
