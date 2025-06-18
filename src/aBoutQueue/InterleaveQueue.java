package aBoutQueue;

import java.util.LinkedList;
import java.util.Queue;

public class InterleaveQueue {

    static void InterleaveQueue(Queue<Integer> firstq) {
        Queue<Integer> secondq = new LinkedList<>();

        // Push first half of first queue into second queue
        int size = firstq.size();
        for (int i = 0; i < size / 2; i++) {
            int temp = firstq.poll();
            secondq.add(temp);
        }

        // Merge both halves into the original queue
        for (int i = 0; i < size / 2; i++) {
            int temp = secondq.poll();
            firstq.add(temp);

            temp = firstq.poll();
            firstq.add(temp);
        }
    }


    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);

        InterleaveQueue(q);

        System.out.println("Interleaved Queue: " + q);
    }

}
