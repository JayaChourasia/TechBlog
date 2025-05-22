// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.concurrent.locks.ReentrantLock;
class Main {
    ReentrantLock rl = new ReentrantLock();
    public static void main(String[] args) {
        System.out.println("ReentrantThread Demo");
        Main m1= new Main();
        Thread t1= new Thread(()->m1.outerMethod());
        t1.start();
    }
    public void outerMethod(){
        rl.lock();
        try{
            System.out.println("in outerMethod");
            innerMethod();
        }finally
        {
            rl.unlock();
        }
    }
    public void innerMethod(){
        rl.lock();
        try{
            System.out.println("in innerMethod");
        }finally
        {
            rl.unlock();
        }
        
    }
}
