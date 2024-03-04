package Multithreading;


class Demo extends Thread {
    @Override
    public void run() {
        System.out.println("THREAD IS RUNNING");
    }
}

public class ByThreadClass {
    public static void main(String[] args) {
        Demo d1=new Demo();
        Demo d2=new Demo();

        d1.start();
        d2.start();
    }


}
