/* Lab 6: Inheritance and Polymorphism */
package lab6;

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
