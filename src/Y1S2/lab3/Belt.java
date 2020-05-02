package Y1S2.lab3;

public class Belt extends CyclicQueue {
    public Belt(int capacity) {
        super(capacity);
    }

    @Override
    public synchronized void enqueue(int value) {
        try {
            super.enqueue(value);
        } catch (Exception ignored) {}
    }

    @Override
    public synchronized int dequeue() {
        try {
            return super.dequeue();
        } catch (Exception ignored) {
            return 0;
        }
    }
}
