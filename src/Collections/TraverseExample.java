package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

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
        // for forward traversal
        Iterator<String> itr = name.iterator();

        while(itr.hasNext()){
            String next = itr.next();
            System.out.println(next);
        }

       System.out.println("_____________________________________________________________");
       // for backward Traversal
       ListIterator<String> list = name.listIterator();

    }
}
