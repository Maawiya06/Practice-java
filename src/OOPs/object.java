package OOPs;

public class object {
    public static void main(String args[]){

        // now we are creation object of Student
        Student st1;
        st1 = new Student(12);

        st1.studentName = "Maawiya";
        st1.studentId = 7;
        st1.studentAdd = "Patna";

        st1.Study();
        st1.FullDetails();

        Student st2 = new Student();
        st2.studentName = "Ameer";
        st2.studentId = 9;
        st2.studentAdd = "Bihar";

        st2.Study();
        st2.FullDetails();

        // calling 3rd constructor
        Student st3 = new Student(784, "Ameer Maawiya", "Madhubani");
        st3.FullDetails();

        Dog d1 = new Dog();
        d1.eating();
        d1.speak();
        System.out.println(d1.color);
    }
}
