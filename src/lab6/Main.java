/* Lab 6: Inheritance and Polymorphism */
package lab6;

public class Main {
    public static void main(String[] args) throws Exception {
        // Testing the wolf subclass.
        Wolf wolf = new Wolf("Wolfy", 15);
        wolf.makeNoise();
        System.out.println("The name of the wolf is: " + wolf.getName());
        System.out.println("The age of the wolf is: " + wolf.getAge());

        // Testing the parrot subclass.
        Parrot parrot = new Parrot("Jim", 22);
        parrot.makeNoise();
        System.out.println("The name of the parrot is: " + parrot.getName());
        System.out.println("The age of the parrot is: " + parrot.getAge());

        // Testing the goat subclass.
        Goat goat = new Goat("Ted", 19);
        goat.makeNoise();
        System.out.println("The name of the goat is: " + goat.getName());
        System.out.println("The age of the goat is: " + goat.getAge());

        // Testing the meat subclass.
        Meat meat = new Meat("Beef");
        System.out.println("The name of the meat is: " + meat.getName());

        // Testing the plant subclass.
        Plant plant = new Plant("Lettuce");
        System.out.println("The name of the plant is: " + plant.getName());

        // Making the animals eat the wrong food to get an exception.
        wolf.eat(plant);
        parrot.eat(meat);
        goat.eat(meat);
    }
}
