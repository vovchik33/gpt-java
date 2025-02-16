package oop.task_01;

public abstract class Animal {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    abstract public void say();

    public void age() {
        System.out.println("I'm " + age + " years old.");
    }
}