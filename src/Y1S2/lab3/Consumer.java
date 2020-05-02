package Y1S2.lab3;

import uk.ac.soton.ecs.comp1206.labtestlibrary.interfaces.threading.FactoryWorker;
import uk.ac.soton.ecs.comp1206.labtestlibrary.interfaces.threading.NumberQueue;

public class Consumer extends FactoryWorker {
    // The constructor to create a consumer.
    public Consumer(int id, NumberQueue numberQueue) {
        super("Consumer", id, numberQueue);
    }

    // Prints a message about the consumer.
    public void message(int value) {
        System.out.println(jobType + id + " picked " + value + "from the belt.");
    }

    public int action() {
        return super.belt.dequeue();
    }

    public void run() {
        do {
            try {
                action();
            } catch (Exception e) {
                messageError();
            }
        } while (!Thread.currentThread().isInterrupted());
    }
}
