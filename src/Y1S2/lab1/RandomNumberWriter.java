package Y1S2.lab1;

import java.util.Random;

import uk.ac.soton.ecs.comp1206.labtestlibrary.interfaces.io.RandomIO;

public class RandomNumberWriter implements RandomIO {
    private Random random;

    public RandomNumberWriter(long seed) {
        this.random = new Random(seed);
    }

    public void writeRandomByte(String filename) {

    }

    public void writeRandomChars(String filename) {

    }


}
