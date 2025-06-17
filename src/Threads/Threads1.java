package Threads;

public class Threads1 implements Runnable{

    @Override
    public void run() {
        // task for thread;
        for(int i = 0; i <= 10; i++){
            System.out.println("Value of I is " + i);
        }
    }

    public static void main(String args[]){
        // create object of my Threads1 class
        Threads1 t = new Threads1();
        Thread thr = new Thread(t);
        thr.start();
    }
}
