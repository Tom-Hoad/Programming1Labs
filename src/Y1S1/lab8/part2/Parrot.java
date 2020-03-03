/* Lab 8: Overloading, Interfaces & Hierarchy */
package Y1S1.lab8.part2;

// The class of Parrot. Subclass to the Omnivore class.
public class Parrot extends Omnivore {
    // The constructor method for a parrot. Takes a name and age.
    public Parrot(String name, int age) {
        super(name, age);
    }

    // The constructor method for a parrot. Takes an age.
    public Parrot(int age) {
        super("Polly", age);
    }

    // The method to have the parrot squawk.
    public void makeNoise() {
        System.out.println("Squawk!");
    }
}
