package Threads;

public class Threads2 extends Thread{

    public void run(){
        // Task for Thread
        for(int i = 10; i >= 0; i--){
            System.out.println("Value of Reverse I is: " + i);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
//                throw new RuntimeException(e);
            }
        }
    }
}
