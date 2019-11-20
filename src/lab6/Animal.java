/* Lab 6: Inheritance and Polymorphism */
package lab6;

public abstract class Animal {
    private String name;
    private int age;

    // The constructor method for an animal.
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
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
}
