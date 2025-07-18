package Collections;

import java.util.*;

public class Main {
    public static void main(String args[]){
        System.out.println("Welcome to the code java Collection Framework");

        /*
        creating collection

        1)Type safe - same type of element or object are added to collection

        2)un Type safe - Diffrent tpe of element added int the collection

        */

        // type safe collection(Dimond operator k andar type declear krna h )
        ArrayList<String> name = new ArrayList<>();
        ArrayList<Integer> number  = new ArrayList<>();
        name.add("Ameer ");
        name.add("Maawiya ");
        name.add("Rohan ");
        name.add("Mosad ");
        System.out.println(name);
//        System.out.println(name.get(0));
//        System.out.println(name.get(3));

        // remove
        name.remove("Mosad ");
        System.out.println(name);

        // for removing
        System.out.println("SIZE : " + name.size());

        // for checking that element are not
        System.out.println(name.contains("Ameer "));

        // check for empty
        System.out.println(name.isEmpty());

        //set the name by your own mean
        name.add(1, "RAM");
        System.out.println(name);

        // clear all
//        name.clear();
//        System.out.println(name);

        // OR
        System.out.println(name.getFirst());
        System.out.println(name.getLast());
        number.add(234);


        // Un type safe collection
        LinkedList list = new LinkedList();
        list.add("Ameer ");
        list.add(237);
        list.add(625.98);
        System.out.println(list);

        System.out.println("Vector________________________________________________________________________");

        // create a vector
        Vector<String> vector = new Vector<>();
        vector.addAll(name);
        System.out.println("VECTOR " + vector);

        System.out.println("Hashset________________________________________________________________________");
        HashSet<Double> nms = new HashSet<>();
        nms.add(14.12);
        nms.add(65.2589650);
        nms.add(45.25);
        System.out.println(nms);

        System.out.println("Treeset..........................................................................");
        TreeSet<Double> tree = new TreeSet<>();
        tree.addAll(nms);
        System.out.println(tree);
    }
}
