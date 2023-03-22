package com.theruzil.spring.spring_introduction;

public class Person {
    private Pet pet;

//    public Person(Pet pet) {
//        System.out.println("Person created");
//        this.pet = pet;
//    }

    public Person() {
        System.out.println("Person created");
    }

    public void setPet(Pet pet) {
        System.out.println("Person set pet");
        this.pet = pet;
    }

    public void callYourPet() {
        System.out.println("Hello, my lovely pet!");
        pet.say();
    }
}
