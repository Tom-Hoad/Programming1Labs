package Y1S2.lab3;

public class Belt extends CyclicQueue {
    public Belt(int capacity) {
        super(capacity);
    }

    @Override
    public synchronized void enqueue(int value) {
        super.enqueue(value);
    }

    @Override
    public synchronized int dequeue() {
        return super.dequeue();
    }
}
