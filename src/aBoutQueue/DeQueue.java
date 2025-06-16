package aBoutQueue;

import java.util.ArrayDeque;
import java.util.Deque;

public class DeQueue {
    public static void main(String args[]){
        Deque<Integer> deque = new ArrayDeque<>();

        deque.addFirst(10);
        deque.addFirst(15);
        deque.addLast(20);
        deque.addLast(30);

        System.out.println("First " + deque.peekFirst());
        System.out.println("Last " + deque.peekLast());

        System.out.println("Size is: " + deque.size());

        System.out.println("Remove from first: " + deque.removeFirst());
        System.out.println("Size is: " + deque.size());

        System.out.println("Remove form last: " + deque.removeLast());
    }
}
