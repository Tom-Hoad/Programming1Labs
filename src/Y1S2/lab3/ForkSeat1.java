package Y1S2.lab3;

import uk.ac.soton.ecs.comp1206.labtestlibrary.interfaces.threading.Seat;

import java.util.concurrent.locks.ReentrantLock;

public class ForkSeat1 implements Seat {
    private ReentrantLock leftLock;
    private ReentrantLock rightLock;

    @Override
    public void askFork1() {
        leftLock.lock();
    }

    @Override
    public void askFork2() {
        rightLock.lock();
        rightLock.notify();
    }

    @Override
    public void assignForks(ReentrantLock leftLock, ReentrantLock rightLock) {
        this.leftLock = leftLock;
        this.rightLock = rightLock;
    }
}
