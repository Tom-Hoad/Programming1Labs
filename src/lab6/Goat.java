/* Lab 6: Inheritance and Polymorphism */
package lab6;

public class Goat extends Herbivore {
    // The constructor method for a goat.
    public Goat(String name, int age) {
        super(name, age);
    }

    // The method to have the parrot squawk.
    public void makeNoise() {
        System.out.println("Bleat!");
    }
}
