/* Lab 6: Inheritance and Polymorphism */
package Y1S1.lab6;

public class Parrot extends Omnivore {
    // The constructor method for a parrot.
    public Parrot(String name, int age) {
        super(name, age);
    }

    // The method to have the parrot squawk.
    public void makeNoise() {
        System.out.println("Squawk!");
    }
}
