/* Lab 6: Inheritance and Polymorphism */
package Y1S1.lab6;

import Y1S1.lab8.part2.Food;

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
