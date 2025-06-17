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

    static void ReverseFirstK(Queue<Integer> q, int k) {
        Stack<Integer> st = new Stack<>();
        int n = q.size();

        // Push first K elements in the stack
        for (int i = 0; i < k; i++) {
            int temp = q.poll();
            st.push(temp); // Fix: you were adding back to queue instead of pushing to stack
        }

        // Push all k elements from the stack back into the queue
        while (!st.isEmpty()) {
            int temp = st.pop(); // Fix: should pop from stack
            q.add(temp);         // Fix: add to queue
        }

        // Pop and push first (n-k) elements into queue again to retain original order
        for (int i = 0; i < (n - k); i++) {
            int temp = q.poll();
            q.add(temp);
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

//        reverseQueue(q);

        ReverseFirstK(q, 4);

        System.out.println("Queue is Printing: ");
        while (!q.isEmpty()) {
            int element = q.poll();
            System.out.println(element);
        }
    }
}
