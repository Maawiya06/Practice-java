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
    }
}
