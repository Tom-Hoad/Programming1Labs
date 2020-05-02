package Y1S2.lab3;

import uk.ac.soton.ecs.comp1206.labtestlibrary.interfaces.threading.FactoryWorker;
import uk.ac.soton.ecs.comp1206.labtestlibrary.interfaces.threading.NumberQueue;

import java.util.Random;

public class Producer extends FactoryWorker {
    // The constructor to create a producer.
    public Producer(int id, NumberQueue numberQueue) {
        super("Producer", id, numberQueue);
    }

    // Prints a message about the producer.
    public void message(int value) {
        System.out.println(jobType + id + " picked " + value + "from the belt.");
    }

    // Adds a random number to the queue.
    public int action() {
        Random rand = new Random();
        int randInt = rand.nextInt();
        super.belt.enqueue(randInt);
        return randInt;
    }

    public void run() {
        do {
            try {
                action();
            } catch (IndexOutOfBoundsException e) {
                messageError();
            }
        } while (!Thread.currentThread().isInterrupted());
    }
}
