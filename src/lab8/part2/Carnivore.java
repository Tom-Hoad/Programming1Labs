/* Lab 8: Overloading, Interfaces & Hierarchy */
package lab8.part2;

// The class of Carnivore. Subclass to the Animal class.
public abstract class Carnivore extends Animal {
    // The constructor method for a carnivore. Takes a name and age.
    public Carnivore(String name, int age) {
        super(name, age);
    }

    // The constructor method for a carnivore. Takes no parameters.
    public Carnivore() {
        super();
    }

    // The method to get a carnivore to eat only meat. Takes a food object.
    public void eat(Food food) throws Exception {
        if (food instanceof Plant) {
            throw new Exception("A carnivore cannot eat a plant.");
        } else {
            System.out.println("The carnivore is eating the " + food.getName());
        }
    }
}
