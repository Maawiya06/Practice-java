package Collections;

import java.util.ArrayList;
import java.util.LinkedList;

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
        number.add(234);


        // Un type safe collection
        LinkedList list = new LinkedList();
    }
}
