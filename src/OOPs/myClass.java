package OOPs;

// abstraction
abstract public class myClass {
    // create method
    public void cal(){
        System.out.println("calculating result");
    }

    // abstract method
    abstract public void launchRocket();
}

// abstract class can not be inheritance
class Start{
    public static void main(String args[]){
        myChild mc1 = new myChild();
        mc1.launchRocket();
        mc1.cal();
    }
}
