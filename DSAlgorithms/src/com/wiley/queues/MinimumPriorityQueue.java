package com.wiley.queues;

class MinimumPriorityQueue {
	  public static int heapSize = 0;
	  public static int treeArraySize = 20;
	  public static int INF = 100000;

	  //function to get right child of a node of a tree
	  public static int getRightChild(int A[], int index) {
	    if((((2*index)+1) < A.length && (index >= 1)))
	      return (2*index)+1;
	    return -1;
	  }

	  //function to get left child of a node of a tree
	  public static int getLeftChild(int A[], int index) {
	      if(((2*index) < A.length && (index >= 1)))
	          return 2*index;
	      return -1;
	  }

	  //function to get the parent of a node of a tree
	  public static int getParent(int A[], int index) {
	    if ((index > 1) && (index < A.length)) {
	      return index/2;
	    }
	    return -1;
	  }

	  public static void minHeapify(int A[], int index) {
	    int leftChildIndex = getLeftChild(A, index);
	    int rightChildIndex = getRightChild(A, index);

	    // finding smallest among index, left child and right child
	    int smallest = index;

	    if ((leftChildIndex <= heapSize) && (leftChildIndex>0)) {
	      if (A[leftChildIndex] < A[smallest]) {
	        smallest = leftChildIndex;
	      }
	    }

	    if ((rightChildIndex <= heapSize && (rightChildIndex>0))) {
	      if (A[rightChildIndex] < A[smallest]) {
	        smallest = rightChildIndex;
	      }
	    }

	    // smallest is not the node, node is not a heap
	    if (smallest != index) {
	      int temp;
	      //swapping
	      temp = A[smallest];
	      A[smallest] = A[index];
	      A[index] = temp;
	      minHeapify(A, smallest);
	    }
	  }

	  public static void buildMinHeap(int A[]) {
	    for(int i=heapSize/2; i>=1; i--) {
	      minHeapify(A, i);
	    }
	  }

	  public static int minimum(int A[]) {
	    return A[1];
	  }

	  public static int extractMin(int A[]) {
	    int minm = A[1];
	    A[1] = A[heapSize];
	    heapSize--;
	    minHeapify(A, 1);
	    return minm;
	  }

	  public static void decreaseKey(int A[], int index, int key) {
	    A[index] = key;
	    while((index>1) && (A[getParent(A, index)] > A[index])) {
	      int temp;
	      temp = A[getParent(A, index)];
	      A[getParent(A, index)] = A[index];
	      A[index] = temp;
	      index = getParent(A, index);
	    }
	  }

	  public static void increaseKey(int A[], int index, int key) {
	    A[index] = key;
	    minHeapify(A, index);
	  }

	  public static void insert(int A[], int key) {
	    heapSize++;
	    A[heapSize] = INF;
	    decreaseKey(A, heapSize, key);
	  }

	  public static void printHeap(int A[]) {
	    for(int i=1; i<=heapSize; i++) {
	      System.out.println(A[i]);
	    }
	    System.out.println("");
	  }

	  public static void main(String[] args) {
	    int A[] = new int[treeArraySize];
	    buildMinHeap(A);

	    insert(A, 20);
	    insert(A, 15);
	    insert(A, 8);
	    insert(A, 10);
	    insert(A, 5);
	    insert(A, 7);
	    insert(A, 6);
	    insert(A, 2);
	    insert(A, 9);
	    insert(A, 1);

	    printHeap(A);

	    increaseKey(A, 5, 22);
	    printHeap(A);

	    System.out.println(minimum(A));
	    System.out.println("");
	    System.out.println(extractMin(A));
	    System.out.println("");

	    printHeap(A);

	    System.out.println(extractMin(A));
	    System.out.println(extractMin(A));
	    System.out.println(extractMin(A));
	    System.out.println(extractMin(A));
	    System.out.println(extractMin(A));
	    System.out.println(extractMin(A));
	    System.out.println(extractMin(A));
	    System.out.println(extractMin(A));
	    System.out.println(extractMin(A));
	  }
	}