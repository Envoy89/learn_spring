package com.theruzil.spring.spring_introduction;

public class Dog implements Pet {
    public Dog() {
        System.out.println("Dog created");
    }

    @Override
    public void say() {
        System.out.println("Bow-Wow!");
    }
}
