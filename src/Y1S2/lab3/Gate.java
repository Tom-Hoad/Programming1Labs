package Y1S2.lab3;

public class Gate implements Runnable {
    private Counter counter;
    private int numGuests;

    // The constructor to create a gate.
    public Gate(Counter counter, int numGuests) {
        this.counter = counter;
        this.numGuests = numGuests;
    }

    // The method to add one to the counter.
    public void run() {
        for (int i = 0; i < numGuests; i++) {
            counter.addOne();
        }
    }
}
