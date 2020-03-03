/* Lab 8: Overloading, Interfaces & Hierarchy */
package Y1S1.lab8.part2;

// The class of Wolf. Subclass to the Carnivore class.
public class Wolf extends Carnivore {
    // The constructor method for a wolf. Takes a name and age.
    public Wolf(String name, int age) {
        super(name, age);
    }

    // The constructor method for a wolf. Takes no parameters.
    public Wolf() {
        super();
    }

    // The method to have the wolf howl.
    public void makeNoise() {
        System.out.println("Howl!");
    }
}
