package Y1S2.lab3;

public class Belt extends CyclicQueue {
    public Belt(int capacity) {
        super(capacity);
    }

    @Override
    public synchronized void enqueue(int value) {
        while (isFull()) {
            try {
                this.wait();
            } catch (InterruptedException ignored) { }
        }
        super.enqueue(value);
        this.notifyAll();
    }

    @Override
    public synchronized int dequeue() {
        while (isEmpty()) {
            try {
                this.wait();
            } catch (InterruptedException ignored) { }
        }
        return super.dequeue();
    }
}
