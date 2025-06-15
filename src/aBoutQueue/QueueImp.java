package aBoutQueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public class QueueImp {
    public static void main(String args[]){
        Queue<Integer> q = new LinkedList<>();
        q.add(5);
        System.out.println(q);

        System.out.println(q.size());

        if(q.isEmpty() == true){
            System.out.println("Queue is empty");
        }
        else{
            System.out.println("Queue is not empty");
        }

        q.remove(5);
        System.out.println(q.size());

        q.add(10);
        q.add(20);
        q.add(30);

        System.out.println(q);

        System.out.println("First element is " + q.peek());
        System.out.println("Last Element is " + ((LinkedList<Integer>) q).peekLast());
    }
}
