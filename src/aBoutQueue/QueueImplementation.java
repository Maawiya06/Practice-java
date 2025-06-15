package aBoutQueue;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueImplementation {

    int[] queue;
    int front;
    int rear;
    int size;

    QueueImplementation(int size) {
        queue = new int[size];
        this.size = size;
        front = -1;
        rear = -1;
    }

    void push(int val){
        // check full
        if(rear == size - 1){
            System.out.println("Queue OverFlow");
            return;
        }
        else if(front == -1 && rear == -1){
            // empty case
            front++;
            rear++;
            queue[rear] = val;
        }
        else{
            rear++;
            queue[rear] = val;
        }
    }

    // for pop
    void pop(){
        if(front == -1 && rear == -1){
            System.out.println("UnderFlow Condition");
            return;
        }
        else if(front == rear){
            // empty case
            queue[front] = -1;
            front = -1;
            rear = -1;
        }
        else{
            queue[front] = -1;
            front++;
        }
    }

    boolean isEmpty(){
        if(front == -1 && rear == -1){
            return true;
        }
        else{
            return false;
        }
    }

    Integer getSize(){
        return rear - front +1;
    }

    int getFront(){
        if(front == -1){
            System.out.println("No element in this Queue, can't give any element: ");
            return -1;
        }
        else{
            return queue[front];
        }
    }

    void print(){
        System.out.println("Printing Queue: ");
        for(int i = 0; i < size; i++){
            System.out.println(queue[i] + " ");
        }
    }

    public static void main(String args[]){
        Queue<Integer> q = new ArrayDeque<>(5);
        q.add(10);
        System.out.println(q);
        q.add(20);
        System.out.println(q);
        q.add(30);
        System.out.println(q);
        q.add(40);
        System.out.println(q);
        q.add(50);
        System.out.println(q);

        System.out.println(q.size());
        System.out.println("________________________________________________________________________________");

        q.remove();
        System.out.println(q);
        System.out.println(q.size());
        System.out.println("_________________________________________________________________________________");

        System.out.println(q.isEmpty());
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        q.add(100);
        System.out.println(q);
    }
}
