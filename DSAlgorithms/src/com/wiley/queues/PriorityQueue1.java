package com.wiley.queues;

import com.wiley.queues.LinkedQueue.Node;


// PQ-ARRAY /LIST/HEAP
public class PriorityQueue1 {

	class Node{
        private Node next;
        private int data;
        private int priority;
        Node(int data, int priority){
            this.data = data;
            this.priority = priority;
        }
    }

    private Node head;
    public PriorityQueue1(){
        head = null;
    }

    public PriorityQueue1(int data, int priority){
        head = new Node(data, priority);
    }

    public boolean isEmpty(){
        return head == null;
    }

    public void enqueue(int data, int priority){
        if(isEmpty()){
            head = new Node(data, priority);
            return;
        }

        Node n = new Node(data, priority);
        Node temp = head;
        if(head.priority > n.priority){
            n.next = head;
            head = n;
            return;
        }

        while(temp.next != null && temp.next.priority < n.priority){
            temp = temp.next;
        }

        n.next = temp.next;
        temp.next = n;
    }

    public String toString(){
        if(isEmpty()) return "EMPTY PRIORITY QUEUE";
        String s = "";
        Node temp = head;
        while(temp != null){
            s += "[data: "+ temp.data + " | priority:" + temp.priority + "] -> " ;
            temp = temp.next;
        }
        return s;

    }

}

class TestPriorityQueue{
    public static void main(String[] args) {
    	
        PriorityQueue1 p = new PriorityQueue1();
        p.enqueue(15, 2);
        p.enqueue(60, 4);
        p.enqueue(4, 1);
        p.enqueue(9, 56);
        p.enqueue(41, 3);
        
        // 4->9->15->41->60

        System.out.println(p);

    }

}
