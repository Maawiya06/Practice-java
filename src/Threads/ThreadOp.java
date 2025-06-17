package Threads;

class UserThread extends Thread{
    public void run(){
        System.out.println("This is user defined Thread");
    }
}

public class ThreadOp {
    public static void main(String args[]) throws InterruptedException {
        System.out.println("Program Started...");

        int X = 78 + 90;
        System.out.println("The Result is : " + X);

        // Thread...
        Thread t = Thread.currentThread();
        String tname = t.getName();
        System.out.println("Current Running Thread is : " + tname);

        // setName
        t.setName("MyMain");
        System.out.println(t.getName());

        // sleep
        try{
            Thread.sleep(5000);
        }
        catch (Exception e){

        }

        // get Id
        System.out.println(t.getId());

        // going to start user defined Thread

        System.out.println("Program Ended...");
        UserThread t2 = new UserThread();
        t2.start();
    }
}
