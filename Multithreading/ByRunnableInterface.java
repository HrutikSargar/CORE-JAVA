package Multithreading;
class Demo3 implements Runnable{

    @Override
    public void run() {
        System.out.println("thread is running ");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
public class ByRunnableInterface {
    public static void main(String[] args) {
        Demo3 d1=new Demo3();
        Demo3 d2=new Demo3();

        Thread t1=new Thread(d1);
        Thread t2=new Thread(d2);

        t1.start();
        try {
            t1.join();

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        t2.start();


    }
}
