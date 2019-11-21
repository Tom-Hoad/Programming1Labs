/* Lab 6: Inheritance and Polymorphism */
package lab6;

import lab8.part2.Food;

public abstract class Carnivore extends Animal {
    // The constructor method for a carnivore.
    public Carnivore(String name, int age) {
        super(name, age);
    }

    // The method to get a carnivore to eat only meat.
    public void eat(Food food) throws Exception {
        if (food instanceof Plant) {
            throw new Exception("A carnivore cannot eat a plant.");
        } else {
            System.out.println("The carnivore is eating the " + food.getName());
        }
    }
}
