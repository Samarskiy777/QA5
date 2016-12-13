package oop_concepts;

/**
 * Created by eugen on 11/15/2016.
 */
public class Cat extends Animal implements Playable {
    public Cat (String name, int age) {
        super(name, age);
        System.out.println("Setting initial values and calling super constructor");
    }

    @Override
    public void makeSound () {
        System.out.println("Meow " + getName());
    }

    public void play () {
        System.out.println("Playing with a ball");
    }
}
