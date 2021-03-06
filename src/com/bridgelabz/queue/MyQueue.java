package com.bridgelabz.queue;

public class MyQueue <T>{
    Node <T>head;
    Node <T>tail;
    /**
     * insertring the elements in the queue
     * @param data
     * @param <T>
     */
    public<T> void enQueue(T data)
    {
        Node newNode = new Node();
        newNode.data=data;
        newNode.next=null;
        if(head == null && tail == null)
        {
            head = tail = newNode;
        }
        else{
            tail.next=newNode;
            tail=newNode;
        }
    }
    public void deQueue(){
        Node tempNode = head;
        head = head.next;
        System.out.println("dequeued element is: "+tempNode.data);
    }
    /**
     * printing the queue elements.
     */
    public void printQueue()
    {
        Node tempNode = head;
        System.out.println("the elements in the queue is :");
        while(tempNode!=null)
        {
            System.out.println(tempNode.data);
            tempNode=tempNode.next;
        }
    }
}
