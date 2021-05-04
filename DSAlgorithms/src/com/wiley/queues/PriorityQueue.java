package com.wiley.queues;
import java.util.ArrayList;
import java.util.List;

	
public class PriorityQueue {
	
	    List<Integer> queue;

	    public PriorityQueue(List<Integer> queue) {
	        this.queue = queue;
	    }

	    void heapify(List<Integer> list, int heapSize, int i) {
	        int largest = i;
	        int left = 2 * i + 1;
	        int right = 2 * i + 2;

	        if (left < heapSize && list.get(left) > list.get(i)) {
	            largest = left;
	        }
	        if (right < heapSize && list.get(right) > list.get(largest)) {
	            largest = right;
	        }
	        if (largest != i) {
	            int temp = list.get(largest);
	            list.set(largest, list.get(i));
	            list.set(i, temp);
	            heapify(list, heapSize, largest);
	        }
	    }

	    void insert(Integer newElement) {
	        this.queue.add(newElement);
	        int sizeOfQueue = queue.size();
	        for (int i = (sizeOfQueue / 2 - 1); i >= 0; i--) {
	            heapify(queue, sizeOfQueue, i);
	        }
	        System.out.println("Element " + newElement + " added.");
	        printQueue();
	    }

	    void delete(Integer element) {
	        if (queue != null && !queue.isEmpty()) {
	            if (queue.indexOf(element) != -1) {
	                //swap the element to be deleted with last element
	                int lastIndex = queue.size() - 1;
	                int lastElement = queue.get(lastIndex);
	                queue.set(lastIndex, element);
	                queue.set(queue.indexOf(element), lastElement);

	                //delete last element
	                queue.remove(element);
	                System.out.println("Element " + element + " deleted successfully.");

	                //heapify entire queue
	                int sizeOfQueue = queue.size();
	                for (int i = (sizeOfQueue / 2 - 1); i >= 0; i--) {
	                    heapify(queue, sizeOfQueue, i);
	                }
	                printQueue();
	            } else {
	                System.out.println("There is no such element " + element + " in the queue.");
	            }
	        } else {
	            System.out.println("Queue is empty and cannot perform delete operation.");
	        }

	    }

	    Integer peek() {
	        return !queue.isEmpty() ? queue.get(0) : null;
	    }

	    Integer extractMax() {
	        Integer root;
	        if (queue != null && !queue.isEmpty()) {

	            //swap the root element with last element
	            int lastIndex = queue.size() - 1;
	            int lastElement = queue.get(lastIndex);
	            root = queue.get(0);
	            queue.set(lastIndex, root);
	            queue.set(0, lastElement);

	            //delete last element
	            queue.remove(lastIndex);

	            //heapify entire queue
	            int sizeOfQueue = queue.size();
	            for (int i = (sizeOfQueue / 2 - 1); i >= 0; i--) {
	                heapify(queue, sizeOfQueue, i);
	            }
	            printQueue();
	            return root;
	        } else {
	            System.out.println("Queue is empty and cannot perform extract max operation.");
	            return null;
	        }
	    }

	    void printQueue() {
	        System.out.println("---------------------------------");
	        System.out.print("Queue : ");
	        for (Integer i : queue) {
	            System.out.print("\t" + i);
	        }
	        System.out.println("\n---------------------------------");
	    }

	    public static void main(String[] args) {
	        List<Integer> queue = new ArrayList<>();
	        PriorityQueue priorityQueue = new PriorityQueue(queue);
	        priorityQueue.delete(20);
	        System.out.println("Peek of the Queue is " + priorityQueue.peek());
	        priorityQueue.insert(10);
	        priorityQueue.insert(20);
	        priorityQueue.delete(10);
	        priorityQueue.insert(30);
	        System.out.println("Peek of the Queue is " + priorityQueue.peek());
	        priorityQueue.insert(40);
	        priorityQueue.delete(100);
	        priorityQueue.insert(50);
	        System.out.println("Peek of the Queue is " + priorityQueue.peek());
	        priorityQueue.insert(70);
	        System.out.println("Peek of the Queue is " + priorityQueue.peek());
	        priorityQueue.delete(70);
	        System.out.println("Extract Max : " + priorityQueue.extractMax());
	    }
	}

