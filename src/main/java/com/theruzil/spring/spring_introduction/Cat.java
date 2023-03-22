package com.theruzil.spring.spring_introduction;

public class Cat implements Pet {
    public Cat() {
        System.out.println("Cat created");
    }

    @Override
    public void say() {
        System.out.println("Meow-Meow!");
    }
}
