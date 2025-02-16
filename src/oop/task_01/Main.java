package oop.task_01;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        Animal animal = new Cat("Dog", 5);
        Animal animal2 = new Dog("Cat", 3);
        
        animal.say();
        animal2.say();
    }
}
