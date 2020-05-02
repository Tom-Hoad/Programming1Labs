package Y1S2.lab3;

import uk.ac.soton.ecs.comp1206.labtestlibrary.interfaces.threading.Seat;

import java.util.concurrent.locks.ReentrantLock;

public class ForkSeat2 implements Seat {

    @Override
    public void askFork1() {

    }

    @Override
    public void askFork2() {

    }

    @Override
    public void assignForks(ReentrantLock reentrantLock, ReentrantLock reentrantLock1) {
        reentrantLock.lock();
    }
}
