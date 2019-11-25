/* Lab 8: Overloading, Interfaces & Hierarchy */
package lab8.part2;

// The class of Herbivore. Subclass to the Animal class.
public abstract class Herbivore extends Animal {
    // The constructor method for a herbivore.
    public Herbivore(String name, int age) {
        super(name, age);
    }

    // The method to get a herbivore to eat only plants.
    public void eat(Food food) throws Exception {
        if (food instanceof Meat) {
            throw new Exception("A herbivore cannot eat meat.");
        } else {
            System.out.println("The herbivore is eating the " + food.getName());
        }
    }
}
