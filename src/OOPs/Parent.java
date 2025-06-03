package OOPs;


// concept of overriding
public class Parent {
    //overridden method
    public void m1(){
        System.out.println("I am m1() of parent");
    }
}

class child extends Parent {

    // method overriding
    public void m1(){
        System.out.println("i am child class : ");
    }
}
