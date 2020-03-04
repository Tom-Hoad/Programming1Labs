package Y1S2.lab1;

import java.io.*;
import java.util.Random;

import uk.ac.soton.ecs.comp1206.labtestlibrary.interfaces.io.RandomIO;

public class RandomNumberWriter implements RandomIO {
    private Random random;

    public RandomNumberWriter(long seed) {
        this.random = new Random(seed);
    }

    public void writeRandomByte(String filename) {
        try {
            FileOutputStream out = new FileOutputStream(filename);

            for (int i = 0; i < 10000; i++) {
                String str = String.valueOf(random.nextInt(100000));
                byte b[] = str.getBytes();
                out.write(b);
            }

            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void writeRandomChars(String filename) {
        try {
            Writer writer = new FileWriter(filename);

            for (int i = 0; i < 10000; i++) {
                writer.write(String.valueOf(random.nextInt(100000)));
                writer.write('\n');
            }

            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
