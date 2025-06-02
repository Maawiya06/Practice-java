package OOPs;

// use inheritance with extends key word
public class Dog extends Animal{

    Dog(){
        super();
    }


    int x = 4;
    public void speak(){
        System.out.println(super.x);
        System.out.println(this.x);
    }
}
