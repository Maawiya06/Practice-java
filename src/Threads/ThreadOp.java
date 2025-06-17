package Threads;

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

        System.out.println("Program Ended...");
    }
}
