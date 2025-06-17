package Threads;

public class Threads1 implements Runnable{

    @Override
    public void run() {
        // task for thread;
        for(int i = 0; i <= 10; i++){
            System.out.println("Value of I is " + i);

            // with the hlp of try catch
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
//                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String args[]){
        // create object of my Threads1 class
        Threads1 t = new Threads1();
        Thread thr = new Thread(t);

        // object of Threads2
        Threads2 t1 = new Threads2();

        thr.start();
        t1.start();
    }
}
