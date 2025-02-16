package oop.task_02;

public abstract class Animal implements Speakable {
    private String name;
    private int age;

    Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }   

    public int age() {
        return this.age;
    }
}