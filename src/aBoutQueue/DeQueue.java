package aBoutQueue;

import java.util.ArrayDeque;
import java.util.Deque;

public class DeQueue {

    int[] Array;
    int size;
    int front;
    int rear;

    DeQueue(int size){
        Array = new int[size];
        this.size = size;
        front = -1;
        rear = -1;
    }

    void pushBack(int val){
        //overflow
        if((front == 0 && rear == size - 1) || (rear == front - 1)){
            System.out.println("Queue Overflow");
        }
        // empty queue
        else if(front == -1 && rear == -1){
            front++;
            rear++;
            Array[rear] = val;
        }
        // circular nature
        else if(front != 0 && rear == size - 1){
            rear = 0;
            Array[rear] = val;
        }
        //normal form
        else{
            rear++;
            Array[rear] = val;
        }
    }

    void pushfront(int val){
        // overflow
        if((front == 0 && rear == size - 1) || (rear == front - 1)){
            System.out.println("Queue Overflow");
        }
        //single element
        else if(front == -1 && rear == -1){
             front++;
             rear++;
             Array[front] = val;
        }
        else if(front == 0 && rear != size - 1){
            front = size - 1;
            Array[front] = val;
        }
        // normal case
        else{
            front--;
            Array[front] = val;
        }
    }

    void popFront(){
        //underFlow
        if(front == -1 && rear == -1){
            System.out.println("Under flow");
        }
        //Single Emeent
        else if(front == rear){
            Array[front] = -1;
            front++;
        }
        //circular nature
        else if(front == size - 1){
            Array[front] = -1;
            front = -1;
        }
        //normal form
        else{
            Array[front] = -1;
            front++;
        }
    }

    void popBack(){
        // underflow
        if(front == -1 && rear == -1){
            System.out.println("Under FLow");
        }
        // single elmenet
        else if(front == rear){
            Array[rear] = -1;
            front = -1;
            rear = -1;
        }
        else if(rear == 0){
            Array[rear] = -1;
            rear = size - 1;
        }
        // normal case
        else{
            Array[rear] = -1;
            rear--;
        }
    }


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
