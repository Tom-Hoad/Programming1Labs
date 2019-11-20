/* Lab 6: Inheritance and Polymorphism */
package lab6;

public class Wolf extends Carnivore {
    // The constructor method for a wolf.
    public Wolf(String name, int age) {
        super(name, age);
    }

    // The method to have the wolf howl.
    public void makeNoise() {
        System.out.println("Howl!");
    }
}
