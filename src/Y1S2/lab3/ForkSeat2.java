package Y1S2.lab3;

import uk.ac.soton.ecs.comp1206.labtestlibrary.interfaces.threading.Seat;

import java.util.concurrent.locks.ReentrantLock;

public class ForkSeat2 implements Seat {
    private ReentrantLock leftLock;
    private ReentrantLock rightLock;

    @Override
    public void askFork1() {
        synchronized (leftLock) {
            try {
                leftLock.wait();
            } catch (InterruptedException ignored) { }
            leftLock.lock();
        }
    }

    @Override
    public void askFork2() {
        rightLock.lock();
    }

    @Override
    public void assignForks(ReentrantLock leftLock, ReentrantLock rightLock) {
        this.leftLock = leftLock;
        this.rightLock = rightLock;
    }
}
