package Heap;

import java.util.Scanner;

public class heapify {

    public void downHeapify(int[] heap, int parent, int size) {
        int largest = parent;
        int leftChild = 2 * parent + 1;
        int rightChild = 2 * parent + 2;

        if (leftChild < size && heap[leftChild] > heap[largest])
            largest = leftChild;
        if (rightChild < size && heap[rightChild] > heap[largest])
            largest = rightChild;
        if (parent != largest) {
            swap(heap, parent, largest);
            downHeapify(heap, largest, size);
        }
    }

    public void upHeapify(int[] arr, int index) {
        int parent = (index - 1) / 2; 

        // While the current element is smaller than its parent and not the root
        while (index > 0 && arr[index] < arr[parent]) {
            swap(arr, index, parent); // Swap the current element with its parent
            index = parent; // Move to the parent node
            parent = (index - 1) / 2; // Recalculate the parent index
        }
    }

    public void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    void buildMaxHeap(int[] arr, int size) {
        // Perform down-heapify for each non-leaf node in reverse order.
        for (int i = size / 2 - 1; i >= 0; i--) {
            downHeapify(arr, i, size);
        }
    }

    void buildMinHeap(int[] arr, int size) {
        // Traverse the array in reverse order and perform up-heapify for each element
        for (int i = size - 1; i >= 0; i--) {
            upHeapify(arr, i);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements in the binary tree: ");
        int n = sc.nextInt();

        int[] a = new int[n];
        System.out.println("Enter a binary tree in level order traversal: ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        heapify hp = new heapify();
        hp.buildMaxHeap(a, n);
       // hp.buildMinHeap(a, n);
        //we can use both up or down heapify to build max or min heap

        System.out.println("Heap after heapify:");
        for (int value : a) {
            System.out.print(value + " ");
        }
    }
}
