/* Lab 8: Overloading, Interfaces & Hierarchy */
package lab8.part2;

// The class of Goat. Subclass to the Herbivore class.
public class Goat extends Herbivore implements Comparable<Animal> {
    // The constructor method for a goat.
    public Goat(String name, int age) {
        super(name, age);
    }

    // The method to have the parrot squawk.
    public void makeNoise() {
        System.out.println("Bleat!");
    }
}
