package oop_concepts;

/**
 * Created by eugen on 11/15/2016.
 */
public class Animal {
   private String name;
   private int age;

    public String getName () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public int getAge () {
        return age;
    }

    public void setAge (int age) {
        this.age = age;
    }

    public Animal (String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Animal (String name) {
        this.name = name;
    }

    public Animal (int age) {
        this.age = age;
    }

    public void printAge () {
        System.out.println("Age is " + age);
    }

    public void makeSound () {
    }
}