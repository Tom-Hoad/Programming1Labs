package Y1S2.lab3;

import uk.ac.soton.ecs.comp1206.labtestlibrary.interfaces.threading.UnitCounter;

public class Counter implements UnitCounter {
    private int count;

    // The constructor to create a counter.
    public Counter() {
        this.count = 0;
    }

    // The method to add one to the counter.
    public void addOne() {
        count++;
    }

    // The method to return the value of the counter.
    public int getCounter() {
        return count;
    }
}
