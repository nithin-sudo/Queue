package com.bridgelabz.queue;

public class Runner {
    public static void main(String[] args) {
        MyQueue<Integer> myQueue = new MyQueue<Integer>();
        myQueue.enQueue(55);
        myQueue.enQueue(30);
        myQueue.enQueue(70);
        myQueue.printQueue();
    }
}
