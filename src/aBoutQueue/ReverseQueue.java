package aBoutQueue;

import java.util.Queue;
import java.util.Stack;
import java.util.concurrent.ArrayBlockingQueue;

public class ReverseQueue {


    static void reverseQueue(Queue<Integer> q) {
        Stack<Integer> st = new Stack<>();

        // add one by one element queue s stack m dalo
        // Fix method names: Queue doesn't have front() and pop()
        while (!q.isEmpty()) {
            int frontElement = q.poll();
            st.push(frontElement);
        }

        // one by one element stack s queue m dalo
        // Fix: use add() to push elements back to queue
        while (!st.isEmpty()) {
            int element = st.pop();
            q.add(element);
        }
    }

    public static void main(String args[]) {

        Queue<Integer> q = new ArrayBlockingQueue<>(10);

        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        q.add(60);

        reverseQueue(q);

        System.out.println("Queue is Printing: ");
        while (!q.isEmpty()) {
            int element = q.poll();
            System.out.println(element);
        }
    }
}
