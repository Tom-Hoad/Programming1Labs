package Y1S2.lab3;

import uk.ac.soton.ecs.comp1206.labtestlibrary.interfaces.threading.Seat;

import java.util.concurrent.locks.ReentrantLock;

public class ForkSeat1 implements Seat {
    private ReentrantLock reentrantLockThis;
    private ReentrantLock reentrantLockOther;

    @Override
    public void askFork1() {
        reentrantLockThis.lock();
    }

    @Override
    public void askFork2() {
        reentrantLockOther.lock();
    }

    @Override
    public void assignForks(ReentrantLock reentrantLockThis, ReentrantLock reentrantLockOther) {
        this.reentrantLockThis = reentrantLockThis;
        this.reentrantLockOther = reentrantLockOther;
    }
}
