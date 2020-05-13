package Y1S2.lab3;

import uk.ac.soton.ecs.comp1206.labtestlibrary.interfaces.threading.NumberQueue;

public class CyclicQueue implements NumberQueue {
    private int[] arr;
    private int head;
    private int tail;

    // The constructor to create a circular queue.
    public CyclicQueue(int capacity) {
        this.arr = new int[capacity];
        this.head = -1;
        this.tail = -1;
    }

    // The method to add a number to the end of the queue.
    public void enqueue(int value) {
        if (isFull()) {
            throw new IndexOutOfBoundsException();
        } else {
            if (head == -1) {
                head = 0;
            }

            tail = (tail + 1) % arr.length;
            arr[tail] = value;
        }
    }

    // The method to remove the number at the front of the queue.
    public int dequeue() {
        if (isEmpty()) {
            throw new IndexOutOfBoundsException();
        } else {
            int value = arr[head];

            if (head == tail) {
                head = -1;
                tail = -1;
            } else {
                head = (head + 1) % arr.length;
            }

            return value;
        }
    }

    // The method to say whether the queue is empty.
    public boolean isEmpty() {
        return head == - 1;
    }

    // The method to say whether the queue is full.
    public boolean isFull() {
        return (head == 0 && tail == arr.length - 1) || (head == tail + 1);
    }
}
