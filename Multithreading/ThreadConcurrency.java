package Multithreading;
class Demo1 extends Thread{
    @Override
    public void run() {
        char ch='b';
        for (int a=0;a<3;a++){
            System.out.println(ch);
            ch++;
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }
}

public class ThreadConcurrency {
    public static void main(String[] args) {
        Demo1 d1=new Demo1();
        Demo1 d2=new Demo1();

        d1.start();

        d2.start();
    }
}
