package OOPs;

public class Student {

    // 1 create constructor
    Student(){
        System.out.println("Creating Object : ");
    }
    // 2nd constructor
    public Student(int st){
        System.out.println("Parameterized Constructor: (int) ");
    }
    // 3rd constructor
    public Student(int i, String n, String a){
        studentId = i;
        studentName = n;
        studentAdd = a;
    }
    // Data: Data Member : Instance Variable
    int studentId;
    String studentName;
    String studentAdd;

    // Behaviour: Member Method : methods(Functions)
    public void Study(){
        System.out.println(studentName + " is Studying");
    }

    public void FullDetails(){
        System.out.println("My name is " + studentName);
        System.out.println("My Id is " + studentId);
        System.out.println("My Address  is " + studentAdd);
    }

}
