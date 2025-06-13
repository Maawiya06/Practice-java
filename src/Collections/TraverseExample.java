package Collections;

import java.util.ArrayList;

public class TraverseExample {

    public static void main(String args[]) {

        ArrayList<String> name = new ArrayList<>();
        ArrayList<Integer> number = new ArrayList<>();
        name.add("Ameer");
        name.add("Maawiya");
        name.add("Rohan");
        name.add("Mosad");

        // apply for each loop
        for(String str :name){
            System.out.print(str +"\t"+ str.length()+"\t");

            // for reverse the String
            StringBuffer  br = new StringBuffer(str);
            System.out.println(br.reverse());

        }

        System.out.println("___________________________________________________________");


    }
}
