package Collections;

import java.util.HashMap;

public class MapExample {
    public static void main(String args[]){

        HashMap<String , Integer> courses = new HashMap<>();
        courses.put("Core Java", 4000);
        courses.put("basic Python", 3500);
        courses.put("Spring boot", 8000);
        courses.put("Androide", 4000);
        System.out.println(courses);

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++");
        // by foreach
        courses.forEach((e1, e2) ->{
            System.out.println(e1+ "=>" +e2);
        });

        // for finding one element
        System.out.println(courses.get("Core Java"));
    }
}
