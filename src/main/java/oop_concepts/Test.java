package oop_concepts;

/**
 * Created by eugen on 11/15/2016.
 */
public class Test {
    public static void main (String[] args) {
        Cat an1;
        an1 = new Cat("Barsik", 5);
        an1.setName("Jack");
        an1.setAge(3);
        an1.printAge();
        an1.makeSound();
        an1.play();
    }
}
