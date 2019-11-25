/* Lab 8: Overloading, Interfaces & Hierarchy */
package lab8.part2;

// The class of Omnivore. Subclass to the Animal class.
public abstract class Omnivore extends Animal {
    // The constructor method for a omnivore.
    public Omnivore(String name, int age) {
        super(name, age);
    }

    // The method to get an omnivore to eat.
    public void eat(Food food) {
        System.out.println("The omnivore is eating the " + food.getName());
    }
}
