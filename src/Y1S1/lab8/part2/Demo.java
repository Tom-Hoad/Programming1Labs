/* Lab 8: Overloading, Interfaces & Hierarchy */
package Y1S1.lab8.part2;

import java.util.ArrayList;
import java.util.Collections;

// The demo class to create an ArrayList of animals and then sorts it.
public class Demo {
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();

        // Adding all the animals to an array list of animals.
        animals.add(new Wolf("Wolfy", 10));
        animals.add(new Wolf());
        animals.add(new Parrot(32));
        animals.add(new Parrot("Dave", 28));
        animals.add(new Goat("Gary", 19));

        /* An interface is a completely abstract class. This means that all its methods must be abstract, whereas an
         abstract class can have normal classes too. It's purpose is to group similar methods together, to provide
         multiple inheritance which normal polymorphism cannot provide.*/

        // Compares the lists as a result of sorting.
        for (Animal a : animals) {
            System.out.println(a.getName());
        }

        // Adding Collections.reverseOrder() as a parameter will sort the array list into reverse order.
        Collections.sort(animals);

        for (Animal a : animals) {
            System.out.println(a.getName());
        }
    }
}

