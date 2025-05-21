// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.lang.Thread.*;

class Main {
    public static void main(String[] args) throws InterruptedException  {
        MyThread t1= new MyThread();
        System.out.println("1.State is "+t1.getState());
        t1.start();
        System.out.println("2.State is "+t1.getState());
        t1.sleep(100);
        System.out.println("4.State is "+t1.getState());
        t1.join();
        System.out.println("5.State is "+t1.getState());
    }
}
class MyThread extends Thread{
    public void run(){
        try{
            System.out.println("3.State is RUNNING ");
            Thread.sleep(2000);
        }catch(InterruptedException e){
            System.out.println("Exception is "+e);
        }
        //System.out.println("4.State is "+t1.getState());
    }
}