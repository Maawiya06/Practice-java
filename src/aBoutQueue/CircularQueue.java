package aBoutQueue;


public class CircularQueue {
    int[] Array;
    int size;
    int front;
    int rear;

    CircularQueue(int size){
        Array = new int[size];
        this.size = size;
        front = -1;
        rear = -1;
    }

    void push(int val){
        //overflow
        if(front == 0 && rear == size - 1){
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

    void pop(){
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
}
