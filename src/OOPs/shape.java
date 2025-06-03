package OOPs;

// gaining 100% abstraction by interface
public interface shape {
    public static final int i = 45;

    public abstract void calculateArea(int r);
}

class Circle implements shape {
    public void calculateArea(int r){
        System.out.println("Area of Circle : " + (Math.PI * r * r));
    }

    public static void main(String args[]){
        shape s1 = new Circle();
        s1.calculateArea(2);
    }
}

// abstract vs Interface
