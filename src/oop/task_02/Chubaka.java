package oop.task_02;

import oop.task_02.Speakable;

public class Chubaka extends Animal {
    public Chubaka(String name, int age) {
        super(name, age);
    }

    @Override
    public void speak() {
        System.out.println("Whrsssssssssssst!");
    }
}