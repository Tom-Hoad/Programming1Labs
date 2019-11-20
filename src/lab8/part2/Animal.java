/* Lab 8: Overloading, Interfaces & Hierarchy */
package lab8.part2;

// The class of Animal. Implements the Comparable interface.
public abstract class Animal implements Comparable<Animal> {
    private String name;
    private int age;

    // The constructor method for an animal. Takes a name and age.
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // The constructor method for an animal. Takes no parameters.
    public Animal() {
        this("newborn", 0);
    }

    // The method to get the name of an animal.
    public String getName() {
        return name;
    }

    // The method to get the age of an animal.
    public int getAge() {
        return age;
    }

    // The abstract method to make an animal make noise.
    public abstract void makeNoise();

    // The method to eat some food. Takes a food object as a parameter.
    public abstract void eat(Food food) throws Exception;

    // The method to eat some food. Takes a food object & a number as a parameter.
    public void eat(Food food, int num) throws Exception {
        for (int i = 0; i < num; i++) {
            eat(food);
        }
    }

    // The method to compare the ages of two animals.
    public int compareTo(Animal animal) {
        return this.age - animal.getAge();
    }
}
