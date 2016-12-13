package oop_concepts;

/**
 * Created by eugen on 11/15/2016.
 */
public class Dog extends Animal implements Playable{
    public Dog (String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound () {
        System.out.println("Bark "+ getName());
    }

    public void play () {
        System.out.println("Play with a bone");
    }
}
