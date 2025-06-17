package Threads;

public class ThreadOp {
    public static void main(String args[]){
        System.out.println("Program Started...");

        int X = 78 + 90;
        System.out.println("The Result is : " + X);

        // Thread...
        Thread t = Thread.currentThread();
        String tname = t.getName();
        System.out.println("Current Running Thread is : " + tname);
        System.out.println("Program Ended...");
    }
}
