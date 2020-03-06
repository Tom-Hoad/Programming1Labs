package Y1S2.lab1;

import java.io.*;
import java.util.Random;

import uk.ac.soton.ecs.comp1206.labtestlibrary.interfaces.io.RandomIO;

public class RandomNumberWriter implements RandomIO {
    private Random random;

    public RandomNumberWriter(long seed) {
        this.random = new Random(seed);
    }

    @Override
    public void writeRandomByte(String fileName) throws IOException {
        DataOutputStream out = new DataOutputStream(new FileOutputStream(fileName));

        for (int i = 0; i < 10000; i++) {
            out.write(random.nextInt(100000));
        }

        out.close();
    }

    @Override
    public void writeRandomChars(String fileName) throws IOException {
        Writer writer = new FileWriter(fileName);

        for (int i = 0; i < 10000; i++) {
            writer.write(String.valueOf(random.nextInt(100000)));
            writer.write('\n');
        }

        writer.close();
    }
}
